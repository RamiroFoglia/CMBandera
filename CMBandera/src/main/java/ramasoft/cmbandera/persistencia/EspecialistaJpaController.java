
package ramasoft.cmbandera.persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import ramasoft.cmbandera.logica.Especialista;
import ramasoft.cmbandera.persistencia.exceptions.NonexistentEntityException;


public class EspecialistaJpaController implements Serializable {

    public EspecialistaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public EspecialistaJpaController() {
        emf = Persistence.createEntityManagerFactory("consultoriosJPAPU");
    }    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Especialista especialista) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(especialista);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Especialista especialista) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            especialista = em.merge(especialista);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = especialista.getId_persona();
                if (findEspecialista(id) == null) {
                    throw new NonexistentEntityException("The especialista with id " + id + " no longer exists.");
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
            Especialista especialista;
            try {
                especialista = em.getReference(Especialista.class, id);
                especialista.getId_persona();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The especialista with id " + id + " no longer exists.", enfe);
            }
            em.remove(especialista);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Especialista> findEspecialistaEntities() {
        return findEspecialistaEntities(true, -1, -1);
    }

    public List<Especialista> findEspecialistaEntities(int maxResults, int firstResult) {
        return findEspecialistaEntities(false, maxResults, firstResult);
    }

    private List<Especialista> findEspecialistaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Especialista.class));
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

    public Especialista findEspecialista(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Especialista.class, id);
        } finally {
            em.close();
        }
    }

    public int getEspecialistaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Especialista> rt = cq.from(Especialista.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
