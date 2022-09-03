package com.ferre.model;

import com.ferre.model.Factura;
import com.ferre.model.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-09-02T19:58:12")
@StaticMetamodel(DetallesFactura.class)
public class DetallesFactura_ { 

    public static volatile SingularAttribute<DetallesFactura, Double> total;
    public static volatile SingularAttribute<DetallesFactura, Productos> codProducto;
    public static volatile SingularAttribute<DetallesFactura, Factura> idFactura;
    public static volatile SingularAttribute<DetallesFactura, Integer> id;
    public static volatile SingularAttribute<DetallesFactura, Integer> cantidad;

}