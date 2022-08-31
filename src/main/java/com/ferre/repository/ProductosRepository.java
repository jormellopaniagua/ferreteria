
package com.ferre.repository;


import com.ferre.model.Cliente;
import com.ferre.model.Productos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
/**
 *
 * @author MELLO
 */

public class ProductosRepository {
    
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ferrePU");
    EntityManager em = emf.createEntityManager();
    
    public List<Productos> getAll(){
        TypedQuery query = em.createNamedQuery("Productos.findAll", Productos.class);
        List<Productos> productos = query.getResultList();
        return productos;
    }
    public Productos getbyId(Integer id){
        TypedQuery query = em.createNamedQuery("Productos.findByCodigo", Productos.class);
        query.setParameter("codigo", id);
        Productos producto = (Productos) query.getSingleResult();
        return producto;
    }
    public List<Productos> getbyTipo(String tipo){
        TypedQuery query = em.createNamedQuery("Productos.findByTipo", Productos.class);
        query.setParameter("tipo", tipo);
        List<Productos> producto = (List<Productos>) query.getResultList();
        return producto;
    }
    public void insert(Productos p){
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
    
   public void actualizar(Productos p){
       em.getTransaction().begin();
       em.merge(p);
       em.getTransaction().commit();
       
   }
   public void eliminar(Productos p){
       em.getTransaction().begin();
       p = em.find(Productos.class, p.getCodigo());
       if(p!=null){
           em.remove(p);
       }
       em.getTransaction().commit();
   }
}
