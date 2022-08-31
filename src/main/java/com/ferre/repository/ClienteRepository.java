/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class ClienteRepository {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ferrePU");
    EntityManager em = emf.createEntityManager();
    
    public List<Cliente> getAll(){
        TypedQuery query = em.createNamedQuery("Cliente.findAll", Cliente.class);
        List<Cliente> clientes = query.getResultList();
        return clientes;
    }
    
    public Cliente getbyId(Integer id){
        TypedQuery query = em.createNamedQuery("Cliente.findById", Cliente.class);
        query.setParameter("id", id);
        Cliente cliente = (Cliente) query.getSingleResult();
        return cliente;
    }
    
    public void insert(Cliente c){
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
    
   public void actualizar(Cliente c){
       em.getTransaction().begin();
       em.merge(c);
       em.getTransaction().commit();
       
   }
   public void eliminar(Cliente c){
       em.getTransaction().begin();
       c = em.find(Cliente.class, c.getId());
       if(c!=null){
           em.remove(c);
       }
       em.getTransaction().commit();
   }
}
