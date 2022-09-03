package com.ferre.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-09-02T19:58:12")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile SingularAttribute<Empleados, Date> fechaNacimiento;
    public static volatile SingularAttribute<Empleados, String> direccion;
    public static volatile SingularAttribute<Empleados, String> contrasena;
    public static volatile SingularAttribute<Empleados, String> nombreEmpleado;
    public static volatile SingularAttribute<Empleados, String> cargo;
    public static volatile SingularAttribute<Empleados, String> telefono;
    public static volatile SingularAttribute<Empleados, Integer> idCedula;

}