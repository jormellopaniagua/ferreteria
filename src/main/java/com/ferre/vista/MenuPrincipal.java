/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferre.vista;

import static java.awt.Frame.MAXIMIZED_BOTH;

/**
 *
 * @author MELLO
 */
public class MenuPrincipal extends javax.swing.JFrame {

    //declaracion de objetos asociados
    //Ventas ventas = new Ventas();
    //InventarioProducto inventarioProducto = new InventarioProducto();
    //Clientes clientes = new Clientes();
    //Empleados empleados = new Empleados();


    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        //instanciacion de objetos asociados 
        
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre_bienvenido = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        que_hacer = new javax.swing.JLabel();
        btn_inventario = new javax.swing.JButton();
        btn_ventas = new javax.swing.JButton();
        btn_empleaados = new javax.swing.JButton();
        btn_clientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO FERRE 2.jpg"))); // NOI18N

        nombre_bienvenido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nombre_bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        nombre_bienvenido.setText("BIENVENIDO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(nombre_bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre_bienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        que_hacer.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        que_hacer.setForeground(new java.awt.Color(255, 255, 255));
        que_hacer.setText("??QUE DESEAS HACER?");
        que_hacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_inventario.setBackground(new java.awt.Color(0, 107, 205));
        btn_inventario.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        btn_inventario.setForeground(new java.awt.Color(255, 255, 255));
        btn_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario.png"))); // NOI18N
        btn_inventario.setText("INVENTARIO");
        btn_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventarioActionPerformed(evt);
            }
        });

        btn_ventas.setBackground(new java.awt.Color(0, 107, 205));
        btn_ventas.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        btn_ventas.setForeground(new java.awt.Color(255, 255, 255));
        btn_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta.png"))); // NOI18N
        btn_ventas.setText("VENTAS");
        btn_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventasActionPerformed(evt);
            }
        });

        btn_empleaados.setBackground(new java.awt.Color(0, 107, 205));
        btn_empleaados.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        btn_empleaados.setForeground(new java.awt.Color(255, 255, 255));
        btn_empleaados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado.png"))); // NOI18N
        btn_empleaados.setText("EMPLEADOS");
        btn_empleaados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empleaadosActionPerformed(evt);
            }
        });

        btn_clientes.setBackground(new java.awt.Color(0, 107, 205));
        btn_clientes.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        btn_clientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.png"))); // NOI18N
        btn_clientes.setText("CLIENTES");
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_empleaados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(que_hacer, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(que_hacer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inventario)
                    .addComponent(btn_ventas))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_empleaados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_empleaadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empleaadosActionPerformed
        this.setVisible(false);
        new EmpleadosV().setVisible(true);
    }//GEN-LAST:event_btn_empleaadosActionPerformed

    private void btn_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventarioActionPerformed
        this.setVisible(false);
        new InventarioProducto().setVisible(true);
    }//GEN-LAST:event_btn_inventarioActionPerformed

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
        this.setVisible(false);
        new Clientes().setVisible(true);
    }//GEN-LAST:event_btn_clientesActionPerformed

    private void btn_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Ventas().setVisible(true);
    }//GEN-LAST:event_btn_ventasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_empleaados;
    private javax.swing.JButton btn_inventario;
    private javax.swing.JButton btn_ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nombre_bienvenido;
    private javax.swing.JLabel que_hacer;
    // End of variables declaration//GEN-END:variables
    public void declararTexto(String em){
        nombre_bienvenido.setText(em);
    }

    
    
}
