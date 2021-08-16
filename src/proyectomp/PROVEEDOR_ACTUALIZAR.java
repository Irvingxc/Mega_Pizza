/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomp;

import java.awt.Event;
import java.awt.event.KeyEvent;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import static proyectomp.ModificarBonificaciones.txtNombre;
import static proyectomp.PROVEEDOR_1.txtDireccion;
/**
 *
 * @author espin
 */
public class PROVEEDOR_ACTUALIZAR extends javax.swing.JFrame {

    /**
     * Creates new form PROVEEDOR
     */
    public PROVEEDOR_ACTUALIZAR() {
        initComponents();
        InputMap ctrl = txtNombre.getInputMap(JTextField.WHEN_FOCUSED); 
    ctrl.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    InputMap ctrl1 = txtEmail.getInputMap(JTextField.WHEN_FOCUSED); 
    ctrl1.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        InputMap ctr2 = txtContacto.getInputMap(JTextField.WHEN_FOCUSED); 
    ctr2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    InputMap ctrl3 = txtDireccion.getInputMap(JTextField.WHEN_FOCUSED); 
    ctrl3.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    txtDireccion.setLineWrap(true);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        txtRTN = new javax.swing.JFormattedTextField();
        txtCelContacto = new javax.swing.JFormattedTextField();
        txtTelefono = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        cmbTipo = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        try {
            txtRTN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtRTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 290, -1));

        try {
            txtCelContacto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCelContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 290, -1));

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 290, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ACTUALIZAR PROVEEDOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 280, 27));

        jLabel2.setText(" ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, -1));

        jLabel6.setText("Nombre");
        jLabel6.setName(""); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 50, -1));

        jLabel4.setText("Dirección");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 135, -1));

        jLabel5.setText("Teléfono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.setName("cmd_guardar"); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 107, 33));

        btnCancelar.setText("CANCELAR");
        btnCancelar.setName("cmd_cancelar"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 105, 33));

        txtNombre.setName("txt_nombre"); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 88, 288, -1));

        lblID.setText("1");
        lblID.setName("lbl_id"); // NOI18N
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 56, -1, -1));

        jLabel8.setText("RTN");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel9.setText("E-Mail");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        txtEmail.setName("txt_email"); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 288, -1));

        jLabel7.setText("Tipo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtDireccion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 290, -1));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Local", "Exterior" }));
        cmbTipo.setName("txt_tipo"); // NOI18N
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 288, -1));

        jLabel10.setText("Contacto");
        jLabel10.setName("txt_contacot"); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel11.setText("Teléfono Contacto");
        jLabel11.setName("txt_contacot"); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 130, -1));

        txtContacto.setName("txt_rtn"); // NOI18N
        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoKeyTyped(evt);
            }
        });
        jPanel1.add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 288, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 550));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(txtNombre.getText().length()==0 || 
                this.txtDireccion.getText().length()==0 ||
            this.txtTelefono.getText().length()==0 ||
            this.txtEmail.getText().length()==0 ||
            this.txtRTN.getText().length()==0 ||
            this.txtContacto.getText().length()==0 ||
            this.txtCelContacto.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Debe Ingresar Todos Los Datos", "Datos Incompletos", JOptionPane.ERROR_MESSAGE);
        
        }else{
            Sentencias_Henry u = new Sentencias_Henry();
            u.setNombre_Pro(this.txtNombre.getText());
            u.setDireccion_Pro(this.txtDireccion.getText());
            u.setTelefono_Pro(this.txtTelefono.getText());
            u.setEMail_Pro(this.txtEmail.getText());
            u.setRTN_Pro(this.txtRTN.getText());
            u.setTipo_Pro(this.cmbTipo.getSelectedItem().toString());
            u.setContacto_Pro(this.txtContacto.getText());
            u.setCel_Contacto_Pro(this.txtCelContacto.getText());
            
            u.setId_Pro(Integer.parseInt(this.lblID.getText()));
            
            if(Funciones_Henry.isUpdateProveedor(u)){
                Funciones_Henry.setListarProveedor("");
            dispose();
            JOptionPane.showMessageDialog(this, "Datos Actualizados con Exito");
            }else{
            JOptionPane.showMessageDialog(rootPane, "Este RTN ya esta registrado", "Error al actualizar", JOptionPane.ERROR_MESSAGE);  
            }        
       // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         int r;
				r = JOptionPane.showConfirmDialog(this, "¿Desea Cancelar el Registro?",
						"Confirmación", JOptionPane.OK_CANCEL_OPTION);
				if (r == JOptionPane.OK_OPTION) {
		 			this.dispose();
			}        
// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        txtNombre.setText(txtNombre.getText().replaceAll("( )+", " "));
        if (txtNombre.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_SPACE) {
            evt.consume();
        }
        char c = evt.getKeyChar();
         if(Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
         }
            int tam = txtNombre.getText().length();
        if(tam>=30){
            evt.consume();
        }  else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
                ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                ||(int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
                ||(int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=163
                ||(int)evt.getKeyChar()>=166 && (int)evt.getKeyChar()<=255){
             getToolkit().beep();
            evt.consume();
        }     
// TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        txtEmail.setText(txtEmail.getText().replaceAll("( )+", " "));
        if (txtEmail.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_SPACE) {
            evt.consume();
        }
        int tam = txtEmail.getText().length();
        if(tam>=50){
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyTyped
        txtContacto.setText(txtContacto.getText().replaceAll("( )+", " "));
        if (txtContacto.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_SPACE) {
            evt.consume();
        } 
        char c = evt.getKeyChar();
         if(Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
         }
            int tam = txtContacto.getText().length();
        if(tam>=30){
            evt.consume();
        }  else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
                ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                ||(int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
                ||(int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=163
                ||(int)evt.getKeyChar()>=166 && (int)evt.getKeyChar()<=255){
             getToolkit().beep();
            evt.consume();
        }         
// TODO add your handling code here:
    }//GEN-LAST:event_txtContactoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
        txtDireccion.setText(txtDireccion.getText().replaceAll("( )+", " "));
        if (txtDireccion.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_SPACE) {
            evt.consume();
        }
        int tam = txtDireccion.getText().length();
        if(tam>=250){
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

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
            java.util.logging.Logger.getLogger(PROVEEDOR_ACTUALIZAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROVEEDOR_ACTUALIZAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROVEEDOR_ACTUALIZAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROVEEDOR_ACTUALIZAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROVEEDOR_ACTUALIZAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    public static javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblID;
    public static javax.swing.JFormattedTextField txtCelContacto;
    public static javax.swing.JTextField txtContacto;
    public static javax.swing.JTextArea txtDireccion;
    public static javax.swing.JTextField txtEmail;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JFormattedTextField txtRTN;
    public static javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}