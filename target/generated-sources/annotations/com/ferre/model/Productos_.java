package com.ferre.model;

import com.ferre.model.DetallesFactura;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-30T18:55:00", comments="EclipseLink-2.7.9.v20210604-rNA")
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