/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferre.repository;

import com.ferre.model.DetallesFactura;
import com.ferre.model.Factura;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author MELLO
 */
public class DetallesFacturaRepository {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ferrePU");
    EntityManager em = emf.createEntityManager();
    
    public List<DetallesFactura> getAll(){
        TypedQuery query = em.createNamedQuery("DetallesFactura.findAll", DetallesFactura.class);
        List<DetallesFactura> dfacturas = query.getResultList();
        return dfacturas;
    }
    public DetallesFactura getbyId(Integer id){
        TypedQuery query = em.createNamedQuery("DetallesFactura.findById", DetallesFactura.class);
        query.setParameter("id", id);
        DetallesFactura dfactura = (DetallesFactura) query.getSingleResult();
        return dfactura;
    }
    
    public void insert(DetallesFactura df){
        em.getTransaction().begin();
        em.persist(df);
        em.getTransaction().commit();
    }
}
