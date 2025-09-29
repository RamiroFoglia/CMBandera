package ramasoft.cmbandera2.percistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import ramasoft.cmbandera2.logica.Consulta;
import ramasoft.cmbandera2.logica.HistoriaClinica;
import ramasoft.cmbandera2.percistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Ramiro Foglia
 */
public class ConsultaJpaController implements Serializable {

    public ConsultaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public ConsultaJpaController() {
        emf= Persistence.createEntityManagerFactory("CMBanderaPU");
    }    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Consulta consulta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            HistoriaClinica hisClinica = consulta.getHisClinica();
            if (hisClinica != null) {
                hisClinica = em.getReference(hisClinica.getClass(), hisClinica.getIdHistoriaClinica());
                consulta.setHisClinica(hisClinica);
            }
            em.persist(consulta);
            if (hisClinica != null) {
                hisClinica.getConsultas().add(consulta);
                hisClinica = em.merge(hisClinica);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Consulta consulta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Consulta persistentConsulta = em.find(Consulta.class, consulta.getInConsulta());
            HistoriaClinica hisClinicaOld = persistentConsulta.getHisClinica();
            HistoriaClinica hisClinicaNew = consulta.getHisClinica();
            if (hisClinicaNew != null) {
                hisClinicaNew = em.getReference(hisClinicaNew.getClass(), hisClinicaNew.getIdHistoriaClinica());
                consulta.setHisClinica(hisClinicaNew);
            }
            consulta = em.merge(consulta);
            if (hisClinicaOld != null && !hisClinicaOld.equals(hisClinicaNew)) {
                hisClinicaOld.getConsultas().remove(consulta);
                hisClinicaOld = em.merge(hisClinicaOld);
            }
            if (hisClinicaNew != null && !hisClinicaNew.equals(hisClinicaOld)) {
                hisClinicaNew.getConsultas().add(consulta);
                hisClinicaNew = em.merge(hisClinicaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = consulta.getInConsulta();
                if (findConsulta(id) == null) {
                    throw new NonexistentEntityException("The consulta with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Consulta consulta;
            try {
                consulta = em.getReference(Consulta.class, id);
                consulta.getInConsulta();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The consulta with id " + id + " no longer exists.", enfe);
            }
            HistoriaClinica hisClinica = consulta.getHisClinica();
            if (hisClinica != null) {
                hisClinica.getConsultas().remove(consulta);
                hisClinica = em.merge(hisClinica);
            }
            em.remove(consulta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Consulta> findConsultaEntities() {
        return findConsultaEntities(true, -1, -1);
    }

    public List<Consulta> findConsultaEntities(int maxResults, int firstResult) {
        return findConsultaEntities(false, maxResults, firstResult);
    }

    private List<Consulta> findConsultaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Consulta.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Consulta findConsulta(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Consulta.class, id);
        } finally {
            em.close();
        }
    }

    public int getConsultaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Consulta> rt = cq.from(Consulta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
