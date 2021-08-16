/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomp;

import java.awt.Event;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import static proyectomp.CREAR_USUARIOS.checkCliente;
import static proyectomp.CREAR_USUARIOS.checkCompras;
import static proyectomp.CREAR_USUARIOS.checkEgreso;
import static proyectomp.CREAR_USUARIOS.checkEmplead;
import static proyectomp.CREAR_USUARIOS.checkHorario;
import static proyectomp.CREAR_USUARIOS.checkInventario;
import static proyectomp.CREAR_USUARIOS.checkLocal;
import static proyectomp.CREAR_USUARIOS.checkProductos;
import static proyectomp.CREAR_USUARIOS.checkProveedor;
import static proyectomp.CREAR_USUARIOS.checkUsuarios;
import static proyectomp.CREAR_USUARIOS.checkVenta;
import static proyectomp.EMPLEADOSS_CREAR.oculto;
import static proyectomp.Egresos_Crear.txtNombre;

/**
 *
 * @author angel
 */
public class ACTUALIZAR_USUARIOS extends javax.swing.JFrame {
int contador;
    /**
     * Creates new form CREAR_USUARIOS
     */
    public ACTUALIZAR_USUARIOS() {
        initComponents();
        
        this.setResizable(false);

        InputMap map3 = textNombre.getInputMap(JTextField.WHEN_FOCUSED); 
    map3.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    
    InputMap map = TextContra.getInputMap(JTextField.WHEN_FOCUSED); 
    map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    
       checkBoni.setVisible(false);
          checkDeduc.setVisible(false);
        
        
             
        
        
       
        this.setLocationRelativeTo(null);
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
        btnTodos = new javax.swing.JButton();
        nombreLabel = new javax.swing.JLabel();
        comboTip = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        checkSar = new javax.swing.JCheckBox();
        checkIngresos = new javax.swing.JCheckBox();
        LabelId = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        checkPlanilla = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        checkVenta = new javax.swing.JCheckBox();
        checkProductos = new javax.swing.JCheckBox();
        checkCliente = new javax.swing.JCheckBox();
        checkCargos = new javax.swing.JCheckBox();
        checkUsuarios = new javax.swing.JCheckBox();
        oculto = new javax.swing.JLabel();
        checkCompras = new javax.swing.JCheckBox();
        checkEmplead = new javax.swing.JCheckBox();
        checkLocal = new javax.swing.JCheckBox();
        checkInventario = new javax.swing.JCheckBox();
        checkProveedor = new javax.swing.JCheckBox();
        checkHorario = new javax.swing.JCheckBox();
        TextContra = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        checkEgreso = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        checkBoni = new javax.swing.JCheckBox();
        checkDeduc = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTodos.setText("TODOS");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel1.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));
        jPanel1.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 200, 20));

        comboTip.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Cliente" }));
        jPanel1.add(comboTip, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 200, -1));

        jLabel8.setText("TIPO DE USUARIO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        checkSar.setText("SAR");
        jPanel1.add(checkSar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        checkIngresos.setText("INGRESOS");
        checkIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkIngresosActionPerformed(evt);
            }
        });
        jPanel1.add(checkIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));
        jPanel1.add(LabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 90, 10));

        jLabel7.setText("Id");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        checkPlanilla.setText("PLANILLA");
        jPanel1.add(checkPlanilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("USUARIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 11, -1, -1));

        jLabel2.setText("NOMBRE EMPLEADO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 125, -1, -1));

        jLabel4.setText("ACCESOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        checkVenta.setText("VENTAS");
        jPanel1.add(checkVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        checkProductos.setText("PRODUCTOS");
        jPanel1.add(checkProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        checkCliente.setText("CLIENTES");
        jPanel1.add(checkCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        checkCargos.setText("CARGOS");
        checkCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCargosActionPerformed(evt);
            }
        });
        jPanel1.add(checkCargos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        checkUsuarios.setText("USUARIOS");
        jPanel1.add(checkUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        jPanel1.add(oculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 60, 20));

        checkCompras.setText("COMPRAS");
        jPanel1.add(checkCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        checkEmplead.setText("EMPLEADOS");
        jPanel1.add(checkEmplead, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        checkLocal.setText("LOCAL");
        checkLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLocalActionPerformed(evt);
            }
        });
        jPanel1.add(checkLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        checkInventario.setText("INVENTARIO");
        checkInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInventarioActionPerformed(evt);
            }
        });
        jPanel1.add(checkInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        checkProveedor.setText("PROVEEDORES");
        jPanel1.add(checkProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        checkHorario.setText("HORARIOS");
        jPanel1.add(checkHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        TextContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextContraActionPerformed(evt);
            }
        });
        TextContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextContraKeyTyped(evt);
            }
        });
        jPanel1.add(TextContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 202, -1));

        Guardar.setText("ACTUALIZAR");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 110, -1));

        checkEgreso.setText("EGRESOS");
        jPanel1.add(checkEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jLabel5.setText("NOMBRE DE USUARIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 92, -1, -1));

        textNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textNombreFocusLost(evt);
            }
        });
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreKeyTyped(evt);
            }
        });
        jPanel1.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 204, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 400));

        checkBoni.setText("BONIFICACIÓN");
        jPanel1.add(checkBoni, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        checkDeduc.setText("DEDUCCIONES");
        jPanel1.add(checkDeduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextContraActionPerformed

    private void checkLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkLocalActionPerformed

    private void checkInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInventarioActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
       
         
            Sentencias_Angel s = new Sentencias_Angel();
            s.setNombre_Usu(this.textNombre.getText());
            s.setContrasenia_Usu(this.TextContra.getText());
            s.setId_EE(Integer.parseInt(this.oculto.getText()));
            s.setTipoUsuario(this.comboTip.getSelectedItem().toString());
         if(checkBoni.isSelected()){
                s.setBoni_Usu("1");    
         }else{
             s.setBoni_Usu("0");
         }
         
            if(checkCargos.isSelected()){
                s.setCargos_Usu("1");    
         }else{
             s.setCargos_Usu("0");
         }
               if(checkCliente.isSelected()){
                s.setCliente_Usu("1");    
         }else{
             s.setCliente_Usu("0");
         }
               
            if(checkCompras.isSelected()){
                s.setCompras_Usu("1");    
         }else{
             s.setCompras_Usu("0");
         }
            
            if(checkDeduc.isSelected()){
                s.setDeducc_Usu("1");    
         }else{
             s.setDeducc_Usu("0");
         }   
            
            if(checkEgreso.isSelected()){
                s.setEgres_Usu("1");    
         }else{
             s.setEgres_Usu("0");
         }   
            
            if(checkEmplead.isSelected()){
                s.setEmpleado_Usu("1");    
         }else{
             s.setEmpleado_Usu("0");
         }
            
           if(checkHorario.isSelected()){
                s.setHorario_Usu("1");    
         }else{
             s.setHorario_Usu("0");
         }    
            
            if(checkIngresos.isSelected()){
                s.setIngres_Usu("1");    
         }else{
             s.setIngres_Usu("0");
         }
            
         if(checkInventario.isSelected()){
                s.setInvent_Usu("1");    
         }else{
             s.setInvent_Usu("0");
         }
         
          if(checkLocal.isSelected()){
                s.setLocal_Usu("1");    
         }else{
             s.setLocal_Usu("0");
         }
          
          if(checkPlanilla.isSelected()){
                s.setPlanilla_Usu("1");    
         }else{
             s.setPlanilla_Usu("0");
         }
          
          if(checkProductos.isSelected()){
                s.setProducto_Usu("1");    
         }else{
             s.setProducto_Usu("0");
         }
          
          if(checkProveedor.isSelected()){
                s.setProveedor_Usu("1");    
         }else{
             s.setProveedor_Usu("0");
         }
          
          if(checkSar.isSelected()){
                s.setSar_Usu("1");    
         }else{
             s.setSar_Usu("0");
         }
          
          if(checkVenta.isSelected()){
                s.setVentas_Usu("1");    
         }else{
             s.setVentas_Usu("0");
         }
         
           if(checkUsuarios.isSelected()){
                s.setUsuarios_Usu("1");    
         }else{
             s.setUsuarios_Usu("0");
         }
          
          s.setId_Usu(Integer.parseInt(this.LabelId.getText()));
          
          
            if(Funciones_Angel.isUpdateUsu(s)){
               // Funciones.setListar("");
            JOptionPane.showMessageDialog(this, "Usuario Actualizado");
            Funciones_Angel.setListarUsu("");
            
            }else{
                JOptionPane.showMessageDialog(this, "Fallo el Registro");
                
            }
            dispose();      
        
        
    }//GEN-LAST:event_GuardarActionPerformed

    private void checkCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCargosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkCargosActionPerformed

    private void checkIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkIngresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkIngresosActionPerformed

    private void textNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNombreFocusLost
            Sentencias s = new Sentencias();
            s.setEnv(LabelId.getText());
            Funciones.setListarUsuUpdate(LabelId.getText(), s);
            //JOptionPane.showMessageDialog(null, s.getEnv());
            
            if (s.getEnv().equals(textNombre.getText())) {
                
            
        } else {
                 s.setName(textNombre.getText());
       Funciones.setListarUsu(s);
        try {
        if (s.getNam1().equals(textNombre.getText())) {
            JOptionPane.showMessageDialog(null, "Este nombre de usuario ya existe");
            textNombre.setText(null);
        }else{
            
        }
        } catch (Exception e) {
        }
        }
            
        
      
    }//GEN-LAST:event_textNombreFocusLost

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        // TODO add your handling code here:
         checkBoni.setSelected(true);
            checkCargos.setSelected(true);
            checkCliente.setSelected(true);
            checkCompras.setSelected(true);
            checkDeduc.setSelected(true);
            checkEgreso.setSelected(true);
            checkEmplead.setSelected(true);
            checkHorario.setSelected(true);
            checkIngresos.setSelected(true);
            checkInventario.setSelected(true);
            checkLocal.setSelected(true);
            checkPlanilla.setSelected(true);
            checkProductos.setSelected(true);
            checkProveedor.setSelected(true);
            checkSar.setSelected(true);
            checkVenta.setSelected(true);
            checkUsuarios.setSelected(true);
      
    }//GEN-LAST:event_btnTodosActionPerformed

    private void textNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyTyped
        // TODO add your handling code here:
        textNombre.setText(textNombre.getText().replaceAll("( )+", " "));
        if (textNombre.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_SPACE) {
            evt.consume();          
        }

    }//GEN-LAST:event_textNombreKeyTyped

    private void TextContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextContraKeyTyped
        // TODO add your handling code here:
        TextContra.setText(TextContra.getText().replaceAll("( )+", " "));
        if (TextContra.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_SPACE) {
            evt.consume();          
        }

    }//GEN-LAST:event_TextContraKeyTyped
                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ACTUALIZAR_USUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ACTUALIZAR_USUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ACTUALIZAR_USUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ACTUALIZAR_USUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACTUALIZAR_USUARIOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    public static javax.swing.JLabel LabelId;
    public static javax.swing.JTextField TextContra;
    private javax.swing.JButton btnTodos;
    public static javax.swing.JCheckBox checkBoni;
    public static javax.swing.JCheckBox checkCargos;
    public static javax.swing.JCheckBox checkCliente;
    public static javax.swing.JCheckBox checkCompras;
    public static javax.swing.JCheckBox checkDeduc;
    public static javax.swing.JCheckBox checkEgreso;
    public static javax.swing.JCheckBox checkEmplead;
    public static javax.swing.JCheckBox checkHorario;
    public static javax.swing.JCheckBox checkIngresos;
    public static javax.swing.JCheckBox checkInventario;
    public static javax.swing.JCheckBox checkLocal;
    public static javax.swing.JCheckBox checkPlanilla;
    public static javax.swing.JCheckBox checkProductos;
    public static javax.swing.JCheckBox checkProveedor;
    public static javax.swing.JCheckBox checkSar;
    public static javax.swing.JCheckBox checkUsuarios;
    public static javax.swing.JCheckBox checkVenta;
    public static javax.swing.JComboBox comboTip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel nombreLabel;
    public static javax.swing.JLabel oculto;
    public static javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
