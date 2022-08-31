
package com.ferre.repository;

import com.ferre.model.Empleados;
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
public class EmpleadosRepository {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ferrePU");
    EntityManager em = emf.createEntityManager();
    
    public List<Empleados> getAll(){
        TypedQuery query = em.createNamedQuery("Empleados.findAll", Empleados.class);
        List<Empleados> empleados = query.getResultList();
        return empleados;
    }
     public Empleados getbyId(Integer id){
        TypedQuery query = em.createNamedQuery("Empleados.findByIdCedula", Empleados.class);
        query.setParameter("idCedula", id);
        Empleados empleado = (Empleados) query.getSingleResult();
        return empleado;
    }
    public Empleados loginEmpleado(String nombre, String password){
        TypedQuery query = em.createNamedQuery("Empleados.findByNamePass", Empleados.class);
        query.setParameter("nombreEmpleado",nombre).setParameter("contrasena", password);
        Empleados empleado = (Empleados) query.getSingleResult();
        return empleado;
    }
    
    public void insert(Empleados e){
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }
    
   public void actualizar(Empleados e){
       em.getTransaction().begin();
       em.merge(e);
       em.getTransaction().commit();
       
   }
   public void eliminar(Empleados e){
       em.getTransaction().begin();
       e = em.find(Empleados.class, e.getIdCedula());
       if(e!=null){
           em.remove(e);
       }
       em.getTransaction().commit();
   }
    
}
