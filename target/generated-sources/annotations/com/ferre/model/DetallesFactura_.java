package com.ferre.model;

import com.ferre.model.Factura;
import com.ferre.model.Productos;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-08-30T18:55:00", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(DetallesFactura.class)
public class DetallesFactura_ { 

    public static volatile SingularAttribute<DetallesFactura, Double> total;
    public static volatile SingularAttribute<DetallesFactura, Productos> codProducto;
    public static volatile SingularAttribute<DetallesFactura, Factura> idFactura;
    public static volatile SingularAttribute<DetallesFactura, Integer> id;
    public static volatile SingularAttribute<DetallesFactura, Integer> cantidad;

}