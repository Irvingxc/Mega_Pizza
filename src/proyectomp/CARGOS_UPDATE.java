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
import static proyectomp.CARGOS_REGISTRO.TxtSue;
import static proyectomp.CARGOS_REGISTRO.txtFun;
import static proyectomp.CARGOS_REGISTRO.txtNombre;

/**
 *
 * @author Calix
 */
public class CARGOS_UPDATE extends javax.swing.JFrame {

    /**
     * Creates new form CARGOS
     
     */
    
    public CARGOS_UPDATE() {
        
        initComponents();
           InputMap map2 = txtNombre.getInputMap(JTextField.WHEN_FOCUSED); 
    map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    InputMap maps = TxtSue1.getInputMap(JTextField.WHEN_FOCUSED); 
    maps.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    InputMap map3 = txtFun.getInputMap(JTextField.WHEN_FOCUSED); 
    map3.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        this.setLocationRelativeTo(null);
       this.txtFun.setLineWrap(true);
        this.setLocationRelativeTo(null);
       
      
		cmdTipo.addItem("Administrativo");
		cmdTipo.addItem("Operativo");
                cmdTipo.addItem("Tecnico");
                cmdTipo.addItem("Servicios");
                
         
       // this.lblId.setText(Funciones.extraerIdMax());
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
        jLabel7 = new javax.swing.JLabel();
        lblTit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmdTipo = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtSue1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFun = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("L");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, 100));

        lblTit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTit.setText("ACTUALIZAR CARGO");
        jPanel1.add(lblTit, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 4, -1, -1));

        jLabel2.setText("Tipo Cargo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 62, -1, -1));

        cmdTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTipoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 59, 231, -1));

        jLabel1.setText("Nombre Cargo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 93, -1, -1));

        jLabel3.setText("Sueldo Cargo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 131, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 90, 231, -1));

        jLabel4.setText("Funciones");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 166, -1, -1));

        TxtSue1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtSue1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtSue1KeyTyped(evt);
            }
        });
        jPanel1.add(TxtSue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 128, 231, -1));

        txtFun.setColumns(20);
        txtFun.setRows(5);
        txtFun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFunKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFunKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtFun);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 166, 231, -1));

        btnGuardar.setText("ACTUALIZAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 280, 108, 34));

        lblId.setText("1");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 34, 81, -1));

        jLabel5.setText("Id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 34, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 340));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        
        if(txtNombre.getText().length()==0 || 
                this.cmdTipo.getSelectedItem().equals(0)||
                this.TxtSue1.getText().length()==0||
                this.txtFun.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
        }else{
            Sentencias s = new Sentencias();
            String tipo = Funciones.setListarCargoUpdate(lblId.getText());
            String Nombre = Funciones.setListarCargoUpdate2(lblId.getText());
            if (Nombre.equals(txtNombre.getText())&& tipo.equals(cmdTipo.getSelectedItem().toString())) {
              //  JOptionPane.showMessageDialog(null, "Hay va");
                // Sentencias u = new Sentencias();
            s.setTipo_ca(CARGOS_UPDATE.cmdTipo.getSelectedItem().toString());
            s.setNombre_ca(CARGOS_UPDATE.txtNombre.getText());
            s.setSueldos_ca(Double.parseDouble(CARGOS_UPDATE.TxtSue1.getText()));
            s.setFunciones_ca(CARGOS_UPDATE.txtFun.getText());
            s.setId_ca(Integer.parseInt(CARGOS_UPDATE.lblId.getText()));
            
            if(Funciones.isUpdate(s)){
                Funciones.setListar("");
            JOptionPane.showMessageDialog(null, "Datos Actualizados con Exito");
            dispose();
            
            }else{
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                
            }
            }else{
            
           Funciones.setListarCargoUpdate(s);
            
            dispose();
            }
            
        }
                
                
    }//GEN-LAST:event_btnGuardarActionPerformed
          
    private void cmdTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTipoActionPerformed
        
    }//GEN-LAST:event_cmdTipoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowClosing

    private void TxtSue1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSue1KeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();      
        
        int tam = TxtSue1.getText().length();
        if(tam>=8){
            evt.consume();
        }       
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSue1KeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
txtNombre.setText(txtNombre.getText().replaceAll("( )+", " "));        // TODO add your handling code here:
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
            
            
        
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtFunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFunKeyTyped
txtFun.setText(txtFun.getText().replaceAll("( )+", " "));         // TODO add your handling code here:
        
            int tam = txtFun.getText().length();
        if(tam>=300){
            evt.consume();
       
        }
            
            
        
    }//GEN-LAST:event_txtFunKeyTyped

    private void txtFunKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFunKeyPressed
if (evt.getKeyCode() == KeyEvent.VK_TAB) {
                    if (evt.getModifiers() > 0) {
                        txtFun.transferFocusBackward();
                    } else {
                        txtFun.transferFocus();
                    }
                    evt.consume();
                }        // TODO add your handling code here:
    }//GEN-LAST:event_txtFunKeyPressed

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
            java.util.logging.Logger.getLogger(CARGOS_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CARGOS_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CARGOS_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CARGOS_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CARGOS_UPDATE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField TxtSue1;
    private javax.swing.JButton btnGuardar;
    public static javax.swing.JComboBox<String> cmdTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblId;
    private javax.swing.JLabel lblTit;
    public static javax.swing.JTextArea txtFun;
    public static javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
