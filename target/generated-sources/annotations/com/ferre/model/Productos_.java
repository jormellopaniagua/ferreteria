package com.ferre.model;

import com.ferre.model.DetallesFactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-09-02T19:58:12")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, Integer> existencia;
    public static volatile SingularAttribute<Productos, String> unidad;
    public static volatile SingularAttribute<Productos, Integer> codigo;
    public static volatile SingularAttribute<Productos, String> tipo;
    public static volatile SingularAttribute<Productos, String> medida;
    public static volatile SingularAttribute<Productos, Double> precioCompra;
    public static volatile ListAttribute<Productos, DetallesFactura> detallesFacturaList;
    public static volatile SingularAttribute<Productos, Double> precioVenta;
    public static volatile SingularAttribute<Productos, String> nombre;

}