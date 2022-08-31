/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferre.repository;

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
public class FacturaRepository {
    
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("ferrePU");
    EntityManager em = emf.createEntityManager();
    
    public List<Factura> getAll(){
        TypedQuery query = em.createNamedQuery("Factura.findAll", Factura.class);
        List<Factura> facturas = query.getResultList();
        return facturas;
    }
    public Factura getbyId(Integer id){
        TypedQuery query = em.createNamedQuery("Factura.findById", Factura.class);
        query.setParameter("id", id);
        Factura factura = (Factura) query.getSingleResult();
        return factura;
    }
    public List<Factura> getbyFecha(Date date){
        TypedQuery query = em.createNamedQuery("Factura.findByFecha", Factura.class);
        query.setParameter("fecha", date);
        List<Factura> factura = (List<Factura>) query.getResultList();
        return factura;
    }
    public void insert(Factura f){
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }
    public List<Factura> getbyMY(Integer mes, Integer anio){
        TypedQuery query = em.createNamedQuery("Factura.findByFechaMY", Factura.class);
        query.setParameter("fechaM", mes).setParameter("fechaY", anio);
        List<Factura> factura = (List<Factura>) query.getResultList();
        return factura;
    
    }
    
   
    
}
