/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferre.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author MELLO
 */
@Entity
@Table(name = "detalles_factura")
@NamedQueries({
    @NamedQuery(name = "DetallesFactura.findAll", query = "SELECT d FROM DetallesFactura d"),
    @NamedQuery(name = "DetallesFactura.findById", query = "SELECT d FROM DetallesFactura d WHERE d.id = :id"),
    @NamedQuery(name = "DetallesFactura.findByCantidad", query = "SELECT d FROM DetallesFactura d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DetallesFactura.findByTotal", query = "SELECT d FROM DetallesFactura d WHERE d.total = :total")})
public class DetallesFactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "cantidad")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private Double total;
    @JoinColumn(name = "id_factura", referencedColumnName = "id")
    @ManyToOne
    private Factura idFactura;
    @JoinColumn(name = "cod_producto", referencedColumnName = "codigo")
    @ManyToOne
    private Productos codProducto;

    public DetallesFactura() {
    }

    public DetallesFactura(Integer id) {
        this.id = id;
    }

    public DetallesFactura(Integer id, Integer cantidad, Double total, Factura idFactura, Productos codProducto) {
        this.id = id;
        this.cantidad = cantidad;
        this.total = total;
        this.idFactura = idFactura;
        this.codProducto = codProducto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Factura getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Factura idFactura) {
        this.idFactura = idFactura;
    }

    public Productos getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Productos codProducto) {
        this.codProducto = codProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesFactura)) {
            return false;
        }
        DetallesFactura other = (DetallesFactura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ferre.model.DetallesFactura[ id=" + id + " ]";
    }
    
}
