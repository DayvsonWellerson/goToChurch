package dados;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class DaoGenerico <Entidade> {
	private EntityManagerFactory emf;
	private EntityManager em;

	
	public EntityManagerFactory getEntityManager(){
		return this.emf;
	}
	
	public void setEntityManager(EntityManagerFactory e){
		this.emf = e;
	}
	
	public void inserir(Entidade obj){
	    try {
	    	em = emf.createEntityManager();
	    	em.getTransaction().begin();
	        em.persist(obj);
	        em.getTransaction().commit();
	    	
	    } catch (Exception e) {
	    	em.getTransaction().rollback();
	    }

	}	
	
	public void atualizar(Entidade obj){
		try {
	    	em = emf.createEntityManager();
	    	em.getTransaction().begin();
	        em.persist(obj);
	        em.getTransaction().commit();
	    	
	    } catch (Exception e) {
	    	em.getTransaction().rollback();
	    }
	}
	
	public void remover(Entidade obj){
		try {
	    	em = emf.createEntityManager();
	    	em.getTransaction().begin();
	        em.remove(obj);
	        em.getTransaction().commit();
	    	
	    } catch (Exception e) {
	    	em.getTransaction().rollback();
	    }
	}
	
	
	public Entidade pesquisarPorId(Serializable id){
		return null;
	}
	
	
	
	public List<Entidade> listar(){
		List<Entidade> entidades = null;
		try {
	    	em = emf.createEntityManager();
	    	em.getTransaction().begin();
	        Query q = em.createQuery("SELECT e FROM Entidade e");
	        entidades = q.getResultList();
	        em.getTransaction().commit();
	         
	    	
	    } catch (Exception e) {
	    	em.getTransaction().rollback();
	    }
		return entidades;
	}
}
