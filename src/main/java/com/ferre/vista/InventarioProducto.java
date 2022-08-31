/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferre.vista;

import com.ferre.controlador.ProductosControlador;
import com.ferre.model.Productos;
import com.ferre.vista.MenuPrincipal;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MELLO
 */
public class InventarioProducto extends javax.swing.JFrame {

    ProductosControlador productosctrl = new ProductosControlador();
   
    
    

    public InventarioProducto() {
        
        
        
        
        initComponents();
        tbl_productos.setSelectionMode(0);
        leerDatos();
        

    }
    
    public JTextField getcodigo() {
        return txt_Codigoproducto;
    }
    public JComboBox<String> gettipo() {
        return jCombo_tipo;
    }

    public JTable getTablaDatos() {
        return tbl_productos;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txt_Codigoproducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Btn_Consultarproducto = new javax.swing.JButton();
        Btn_Actualizarproducto = new javax.swing.JButton();
        Btn_BorrarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Btn_Registrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_productos = new javax.swing.JTable();
        jCombo_tipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CODIGO DEL PRODUCTO");

        Btn_Consultarproducto.setBackground(new java.awt.Color(0, 153, 204));
        Btn_Consultarproducto.setForeground(new java.awt.Color(238, 238, 238));
        Btn_Consultarproducto.setText("CONSULTAR ");
        Btn_Consultarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConsultarproductoActionPerformed(evt);
            }
        });

        Btn_Actualizarproducto.setBackground(new java.awt.Color(0, 153, 204));
        Btn_Actualizarproducto.setForeground(new java.awt.Color(238, 238, 238));
        Btn_Actualizarproducto.setText("ACTUALIZAR ");
        Btn_Actualizarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActualizarproductoActionPerformed(evt);
            }
        });

        Btn_BorrarProducto.setBackground(new java.awt.Color(0, 153, 204));
        Btn_BorrarProducto.setForeground(new java.awt.Color(238, 238, 238));
        Btn_BorrarProducto.setText("BORRAR");
        Btn_BorrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BorrarProductoActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("TIPO");

        Btn_Registrar.setBackground(new java.awt.Color(0, 153, 153));
        Btn_Registrar.setForeground(new java.awt.Color(238, 238, 238));
        Btn_Registrar.setText("REGISTRAR");
        Btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegistrarActionPerformed(evt);
            }
        });

        tbl_productos.setBackground(new java.awt.Color(0, 204, 255));
        tbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "MEDIDA", "TIPO", "EXISTENCIA", "UNIDAD", "PRECIO VENTA", "PRECIO COMPRA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_productos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_productos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_productos);

        jCombo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "miscelaneos", "plomeria", "electricos", "pintura" }));
        jCombo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_tipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCombo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_Actualizarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_BorrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_Codigoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_Consultarproducto, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Consultarproducto)
                    .addComponent(jLabel2)
                    .addComponent(txt_Codigoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Registrar))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCombo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_BorrarProducto)
                        .addComponent(Btn_Actualizarproducto)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO FERRE 2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));

        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INVENTARIO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jLabel1.getAccessibleContext().setAccessibleName("name_inventario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegistrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        new RegistrarProducto().setVisible(true);
        
        
      
    }//GEN-LAST:event_Btn_RegistrarActionPerformed

    private void Btn_BorrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BorrarProductoActionPerformed
        int fila=tbl_productos.getSelectedRow();
        
        if(fila>=0)
        {
            
            Integer codigo = (Integer)tbl_productos.getValueAt(fila, 0);
            int response = JOptionPane.showConfirmDialog(this, "¿Quieres eliminar este elemento?", "Advertencia",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response==JOptionPane.YES_OPTION){
                Productos pro = new Productos(codigo);
                productosctrl.borrar(pro);
                this.limpiarTabla();
                this.leerDatos();
            }        
             
             
        }
        else
        {
           JOptionPane.showMessageDialog(this,"Selecciona un producto", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_Btn_BorrarProductoActionPerformed

    private void Btn_ActualizarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarproductoActionPerformed
        // TODO add your handling code here:
        
        int fila=tbl_productos.getSelectedRow();
        
        if(fila>=0)
        {
            
            Integer codigo = (Integer)tbl_productos.getValueAt(fila, 0);
            Productos product  = productosctrl.getById(codigo);
            this.setVisible(false);
            new ActualizarProducto(product).setVisible(true);
                    
             
             System.out.println(product);
        }
        else
        {
           JOptionPane.showMessageDialog(this,"Selecciona un producto", "Advertencia"
                    , JOptionPane.WARNING_MESSAGE); 
        }
        
    }//GEN-LAST:event_Btn_ActualizarproductoActionPerformed

    private void Btn_ConsultarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConsultarproductoActionPerformed
        // TODO add your handling code here:
        System.out.print(getcodigo().getText().isEmpty());
        if(this.getcodigo().getText().isEmpty()){
             try{
                String tipo = this.gettipo().getSelectedItem().toString();
                List<Productos>productos = productosctrl.getByTipo(tipo);
                limpiarTabla();
                dibujarDatos(productos);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"No se encontro ningun producto con ese tipo", "Informacion"
                    , JOptionPane.INFORMATION_MESSAGE);
            }
            
        }else{
           
            try{
                
                Productos producto = new Productos();
                producto = productosctrl.getById(Integer.valueOf(this.getcodigo().getText()));
                limpiarTabla();
                dibujarTabla(producto);
                this.getcodigo().setText(" ");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"Producto no encontrado", "Informacion"
                    , JOptionPane.INFORMATION_MESSAGE); 
            }
            
            
        }
    }//GEN-LAST:event_Btn_ConsultarproductoActionPerformed

    private void jCombo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombo_tipoActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Actualizarproducto;
    public javax.swing.JButton Btn_BorrarProducto;
    public javax.swing.JButton Btn_Consultarproducto;
    public javax.swing.JButton Btn_Registrar;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton jButton1;
    public javax.swing.JComboBox<String> jCombo_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbl_productos;
    public javax.swing.JTextField txt_Codigoproducto;
    // End of variables declaration//GEN-END:variables
    
    
    public void leerDatos(){
        short valorm = 0;
        short valorM =1;
        List<Productos> productos = productosctrl.getAll();
        for (Productos p: productos){
            
            Object [] dato = new Object[8];
            dato[0] = p.getCodigo();
            dato[1] = p.getNombre();
            dato[2] = p.getMedida();
            dato[3] = p.getTipo();
            dato[4] = p.getExistencia();
            dato[5] = p.getUnidad();
            dato[6] = p.getPrecioCompra();
            dato[7] = p.getPrecioVenta();
            
            
            
                
            
             ((DefaultTableModel)tbl_productos.getModel()).addRow(dato);
        }
    }
    public void limpiarTabla()
    {
        int fila = tbl_productos.getRowCount();
        for (int i=fila-1;i>=0;i--)
        {
            ((DefaultTableModel)tbl_productos.getModel()).removeRow(i);
        }
    }
    public void dibujarTabla(Productos p){
            short valorm = 0;
            short valorM =1;
            Object [] dato = new Object[8];
            dato[0] = p.getCodigo();
            dato[1] = p.getNombre();
            dato[2] = p.getMedida();
            dato[3] = p.getTipo();
            dato[5] = p.getUnidad();
            dato[6] = p.getPrecioCompra();
            dato[7] = p.getPrecioVenta();
            try{
                if(p.getExistencia()==valorM){
                dato[4] = "Si";}
            }catch(Exception e){
                dato[4] = "No";
            }
            
            
                
            
             ((DefaultTableModel)tbl_productos.getModel()).addRow(dato);
    
    }
    public void dibujarDatos(List<Productos> productos){
        short valorm = 0;
        short valorM =1;
        for (Productos p: productos){
            
            Object [] dato = new Object[8];
            dato[0] = p.getCodigo();
            dato[1] = p.getNombre();
            dato[2] = p.getMedida();
            dato[3] = p.getTipo();
            dato[5] = p.getUnidad();
            dato[6] = p.getPrecioCompra();
            dato[7] = p.getPrecioVenta();
            try{
                if(p.getExistencia()==valorM){
                dato[4] = "Si";}
            }catch(Exception e){
                dato[4] = "No";
            }
            
            
                
            
             ((DefaultTableModel)tbl_productos.getModel()).addRow(dato);
        }
    }
}
