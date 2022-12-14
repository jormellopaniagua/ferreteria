/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferre.vista;

import com.ferre.controlador.ClienteControlador;
import com.ferre.controlador.LoginControlador;
import com.ferre.model.Cliente;
import com.ferre.vista.MenuPrincipal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Usuario
 */
public class Clientes extends javax.swing.JFrame {
    MenuPrincipal menuprincipal = new MenuPrincipal();
    ClienteControlador clientectrl = new ClienteControlador();
    LoginControlador login = new LoginControlador();
    /**
     * Creates new form
     */
    
    public Clientes() {
     
        initComponents();
        leerDatos();
        Tbl_Cliente.setSelectionMode(0);
    }
    public String getIdcliente(){
        return txt_cliente.getText();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_atras = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Cliente = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        Btn_actualizarCliente = new javax.swing.JButton();
        Btn_consCliente = new javax.swing.JButton();
        Btn_registrarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CLIENTES");

        btn_atras.setBackground(new java.awt.Color(0, 102, 204));
        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        btn_atras.setBorderPainted(false);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        btn_home.setBackground(new java.awt.Color(0, 102, 204));
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_home.setBorderPainted(false);
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(9, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tbl_Cliente.setBackground(new java.awt.Color(0, 204, 255));
        Tbl_Cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tbl_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CLIENTE ", "TIPO ID", "NOMBRE ", "DIRECCION ", "TELEFONO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tbl_Cliente.setCellSelectionEnabled(true);
        Tbl_Cliente.setSelectionBackground(new java.awt.Color(0, 153, 204));
        Tbl_Cliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tbl_Cliente);
        Tbl_Cliente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("ID CLIENTE");

        Btn_actualizarCliente.setBackground(new java.awt.Color(0, 153, 153));
        Btn_actualizarCliente.setForeground(new java.awt.Color(238, 238, 238));
        Btn_actualizarCliente.setText("ACTUALIZAR");
        Btn_actualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_actualizarClienteActionPerformed(evt);
            }
        });

        Btn_consCliente.setBackground(new java.awt.Color(0, 153, 153));
        Btn_consCliente.setForeground(new java.awt.Color(238, 238, 238));
        Btn_consCliente.setText("CONSULTAR ");
        Btn_consCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_consClienteActionPerformed(evt);
            }
        });

        Btn_registrarCliente.setBackground(new java.awt.Color(0, 153, 153));
        Btn_registrarCliente.setForeground(new java.awt.Color(238, 238, 238));
        Btn_registrarCliente.setText("REGISTRAR");
        Btn_registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_registrarClienteActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO FERRE 2.jpg"))); // NOI18N

        btn_borrar.setBackground(new java.awt.Color(255, 51, 51));
        btn_borrar.setText("BORRAR");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(66, 66, 66)
                        .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(Btn_registrarCliente)
                        .addGap(56, 56, 56)
                        .addComponent(Btn_consCliente)
                        .addGap(70, 70, 70)
                        .addComponent(Btn_actualizarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_registrarCliente)
                    .addComponent(Btn_consCliente)
                    .addComponent(Btn_actualizarCliente)
                    .addComponent(btn_borrar))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        // TODO add your handling code here:
        
        menuprincipal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        
        menuprincipal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void Btn_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_registrarClienteActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new RegistrarCliente().setVisible(true);
        
    }//GEN-LAST:event_Btn_registrarClienteActionPerformed

    private void Btn_consClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_consClienteActionPerformed
        // TODO add your handling code here:
        if(this.getIdcliente()!=null){
            try{
                Cliente client = clientectrl.getById(Integer.valueOf(this.getIdcliente()));
                Object [] dato = new Object[5];
                dato[0] = client.getId();
                dato[1] = client.getTipoId();
                dato[2] = client.getNombreCliente();
                dato[3] = client.getDireccion();
                dato[4] = client.getTelefono();
                JOptionPane.showMessageDialog(this,"Se encontro un cliente", "Exitoso"
                    , JOptionPane.INFORMATION_MESSAGE); 
                limpiarTabla();
                ((DefaultTableModel)Tbl_Cliente.getModel()).addRow(dato);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"No se encontro ningun cliente", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
            }
            
            
        }else{
            JOptionPane.showMessageDialog(this,"Por favor escriba un id", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_Btn_consClienteActionPerformed

    private void Btn_actualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_actualizarClienteActionPerformed
        // TODO add your handling code here:
        int fila=Tbl_Cliente.getSelectedRow();
        
        if(fila>=0)
        {
            
            Integer codigo = (Integer)Tbl_Cliente.getValueAt(fila, 0);
            Cliente cliente  = clientectrl.getById(codigo);
            this.setVisible(false);
            new ActualizarCliente(cliente).setVisible(true);
                    
             
             System.out.println(cliente);
        }
        else
        {
           JOptionPane.showMessageDialog(this,"Selecciona un cliente", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_Btn_actualizarClienteActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        int fila=Tbl_Cliente.getSelectedRow();
        
        if(fila>=0)
        {
            
            Integer codigo = (Integer)Tbl_Cliente.getValueAt(fila, 0);
            int response = JOptionPane.showConfirmDialog(this, "??Quieres eliminar este elemento?", "Advertencia",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response==JOptionPane.YES_OPTION){
                Cliente client = new Cliente(codigo);
                clientectrl.borrar(client);
                this.limpiarTabla();
                this.leerDatos();
            }        
             
             
        }
        else
        {
           JOptionPane.showMessageDialog(this,"Selecciona un producto", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_btn_borrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_actualizarCliente;
    public javax.swing.JButton Btn_consCliente;
    public javax.swing.JButton Btn_registrarCliente;
    public javax.swing.JTable Tbl_Cliente;
    public javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_borrar;
    public javax.swing.JButton btn_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txt_cliente;
    // End of variables declaration//GEN-END:variables
    public void leerDatos(){
        List<Cliente> cliente = clientectrl.getAll();
        for (Cliente p: cliente){
            
            Object [] dato = new Object[5];
            dato[0] = p.getId();
            dato[1] = p.getTipoId();
            dato[2] = p.getNombreCliente();
            dato[3] = p.getDireccion();
            dato[4] = p.getTelefono();
           
                
             ((DefaultTableModel)Tbl_Cliente.getModel()).addRow(dato);
        }
    }
    public void limpiarTabla()
    {
        int fila = Tbl_Cliente.getRowCount();
        for (int i=fila-1;i>=0;i--)
        {
            ((DefaultTableModel)Tbl_Cliente.getModel()).removeRow(i);
        }
    }

}
