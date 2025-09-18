package ramasoft.cmbandera.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import ramasoft.cmbandera.logica.Consulta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ramasoft.cmbandera.logica.HistoriaClinica;
import ramasoft.cmbandera.persistencia.exceptions.NonexistentEntityException;


public class HistoriaClinicaJpaController implements Serializable {

    public HistoriaClinicaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public HistoriaClinicaJpaController() {
        emf = Persistence.createEntityManagerFactory("consultoriosJPAPU");
    }    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(HistoriaClinica historiaClinica) {
        if (historiaClinica.getConsultas() == null) {
            historiaClinica.setConsultas(new ArrayList<Consulta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ArrayList<Consulta> attachedConsultas = new ArrayList<Consulta>();
            for (Consulta consultasConsultaToAttach : historiaClinica.getConsultas()) {
                consultasConsultaToAttach = em.getReference(consultasConsultaToAttach.getClass(), consultasConsultaToAttach.getId_consulta());
                attachedConsultas.add(consultasConsultaToAttach);
            }
            historiaClinica.setConsultas(attachedConsultas);
            em.persist(historiaClinica);
            for (Consulta consultasConsulta : historiaClinica.getConsultas()) {
                HistoriaClinica oldHisClinicaOfConsultasConsulta = consultasConsulta.getHisClinica();
                consultasConsulta.setHisClinica(historiaClinica);
                consultasConsulta = em.merge(consultasConsulta);
                if (oldHisClinicaOfConsultasConsulta != null) {
                    oldHisClinicaOfConsultasConsulta.getConsultas().remove(consultasConsulta);
                    oldHisClinicaOfConsultasConsulta = em.merge(oldHisClinicaOfConsultasConsulta);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(HistoriaClinica historiaClinica) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            HistoriaClinica persistentHistoriaClinica = em.find(HistoriaClinica.class, historiaClinica.getId());
            ArrayList<Consulta> consultasOld = persistentHistoriaClinica.getConsultas();
            ArrayList<Consulta> consultasNew = historiaClinica.getConsultas();
            ArrayList<Consulta> attachedConsultasNew = new ArrayList<Consulta>();
            for (Consulta consultasNewConsultaToAttach : consultasNew) {
                consultasNewConsultaToAttach = em.getReference(consultasNewConsultaToAttach.getClass(), consultasNewConsultaToAttach.getId_consulta());
                attachedConsultasNew.add(consultasNewConsultaToAttach);
            }
            consultasNew = attachedConsultasNew;
            historiaClinica.setConsultas(consultasNew);
            historiaClinica = em.merge(historiaClinica);
            for (Consulta consultasOldConsulta : consultasOld) {
                if (!consultasNew.contains(consultasOldConsulta)) {
                    consultasOldConsulta.setHisClinica(null);
                    consultasOldConsulta = em.merge(consultasOldConsulta);
                }
            }
            for (Consulta consultasNewConsulta : consultasNew) {
                if (!consultasOld.contains(consultasNewConsulta)) {
                    HistoriaClinica oldHisClinicaOfConsultasNewConsulta = consultasNewConsulta.getHisClinica();
                    consultasNewConsulta.setHisClinica(historiaClinica);
                    consultasNewConsulta = em.merge(consultasNewConsulta);
                    if (oldHisClinicaOfConsultasNewConsulta != null && !oldHisClinicaOfConsultasNewConsulta.equals(historiaClinica)) {
                        oldHisClinicaOfConsultasNewConsulta.getConsultas().remove(consultasNewConsulta);
                        oldHisClinicaOfConsultasNewConsulta = em.merge(oldHisClinicaOfConsultasNewConsulta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = historiaClinica.getId();
                if (findHistoriaClinica(id) == null) {
                    throw new NonexistentEntityException("The historiaClinica with id " + id + " no longer exists.");
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
            HistoriaClinica historiaClinica;
            try {
                historiaClinica = em.getReference(HistoriaClinica.class, id);
                historiaClinica.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The historiaClinica with id " + id + " no longer exists.", enfe);
            }
            ArrayList<Consulta> consultas = historiaClinica.getConsultas();
            for (Consulta consultasConsulta : consultas) {
                consultasConsulta.setHisClinica(null);
                consultasConsulta = em.merge(consultasConsulta);
            }
            em.remove(historiaClinica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<HistoriaClinica> findHistoriaClinicaEntities() {
        return findHistoriaClinicaEntities(true, -1, -1);
    }

    public List<HistoriaClinica> findHistoriaClinicaEntities(int maxResults, int firstResult) {
        return findHistoriaClinicaEntities(false, maxResults, firstResult);
    }

    private List<HistoriaClinica> findHistoriaClinicaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(HistoriaClinica.class));
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

    public HistoriaClinica findHistoriaClinica(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(HistoriaClinica.class, id);
        } finally {
            em.close();
        }
    }

    public int getHistoriaClinicaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<HistoriaClinica> rt = cq.from(HistoriaClinica.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
