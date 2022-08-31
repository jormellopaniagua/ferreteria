/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferre.controlador;

import com.ferre.model.Empleados;
import com.ferre.vista.Login;
import com.ferre.vista.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MELLO
 */
public class LoginControlador implements ActionListener{
    
    public Empleados ems =new Empleados();
    EmpleadosControlador empleadoscontrl = new EmpleadosControlador();
    Login login;
    
    public void loginAccess(String usuario, String contraseña, JFrame ventana){
        if (usuario.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser llenados","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            try{
                
                Empleados em = empleadoscontrl.getLogin(usuario, contraseña);
                System.out.println(em.getNombreEmpleado());
                ventana.setVisible(false);
                MenuPrincipal menu = new MenuPrincipal();
                menu.declararTexto("BIENVENIDO "+em.getNombreEmpleado().toUpperCase());
                menu.setVisible(true);
                
            }
            catch(Exception e){
                 JOptionPane.showMessageDialog(null, "Los datos introducidos no son correctos","Error",JOptionPane.ERROR_MESSAGE);
            };
        
        }
}

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
