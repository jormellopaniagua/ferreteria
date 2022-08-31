/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferre.model;

/**
 *
 * @author MELLO
 */
public class TOFactura {
    private Integer id_codigo;
    private Integer cantidad;
    private double total;
    private double ganancia;

    public TOFactura(Integer id_codigo, Integer cantidad, double total, double ganancia) {
        this.id_codigo = id_codigo;
        this.cantidad = cantidad;
        this.total = total;
        this.ganancia = ganancia;
    }

    public Integer getId_codigo() {
        return id_codigo;
    }

    public void setId_codigo(Integer id_codigo) {
        this.id_codigo = id_codigo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
    
}
