/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomp;

import java.awt.Event;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import static proyectomp.CARGOS_REGISTRO.TxtSue;
import static proyectomp.CARGOS_REGISTRO.txtFun;
import static proyectomp.CARGOS_REGISTRO.txtNombre;
import static proyectomp.LOCAL_REGISTRO.tblLocal;
import static proyectomp.MOSTRARCARGO.tblCa;
import static proyectomp.Seleccionar_Bonificacioin.tblBoni;

/**
 *
 * @author Calix
 */
public class SELECCIONAR_DEDUCCION extends javax.swing.JFrame {

    /**
     * Creates new form SELECCIONAR_DEDUCCION
     */
    public SELECCIONAR_DEDUCCION() {
        initComponents();
        this.setResizable(false);
        tblDedu.setSelectionMode(NORMAL);
        InputMap map3 = txtValor.getInputMap(JTextField.WHEN_FOCUSED); 
    map3.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        tblDedu.getTableHeader().setReorderingAllowed(false);
        this.setLocationRelativeTo(null);
                  java.util.Date fecha = new java.util.Date();
               SimpleDateFormat formato = new SimpleDateFormat("yyy-MM-dd");
               lblSistemaFecha.setText(formato.format(fecha));
        Funciones.setListarDEDU("");
        
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
        txtValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDedu = new javax.swing.JTable();
        btbSelect = new javax.swing.JButton();
        lblSistemaFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        pagooo = new javax.swing.JLabel();
        idPlanilla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Valor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 150, -1));

        tblDedu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDedu);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 520, 182));

        btbSelect.setText("SELECCIONAR");
        btbSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbSelectActionPerformed(evt);
            }
        });
        jPanel1.add(btbSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, 46));
        jPanel1.add(lblSistemaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 200, 23, 23));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 400));

        lbl.setText("1");
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        pagooo.setText("jLabel1");
        jPanel1.add(pagooo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 234, -1, -1));

        idPlanilla.setText("jLabel1");
        jPanel1.add(idPlanilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 266, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbSelectActionPerformed
select();
        
//       int fila = tblDedu.getSelectedRow();
////        lblIdE.setText(tblDedu.getValueAt(fila, 0).toString());
//          
//        
//        Sentencias s = new Sentencias();
//        s.setId_Egr(Integer.parseInt(tblDedu.getValueAt(fila, 0).toString()));
//        s.setFK_Empleado(Integer.parseInt(this.lbl.getText()));
//        s.setFecha_Egr(this.lblSistemaFecha.getText());
//        s.setFK_Planilla(Integer.parseInt(this.idPlanilla.getText()));
//        
//        int a= JOptionPane.showConfirmDialog(null, "esta seguro que desea guardar esta deduccion", "mostrar", JOptionPane.YES_NO_OPTION);
//        if (a==JOptionPane.YES_NO_OPTION) {
//            
//        
//        
//        
//        
//        if(Funciones.isRegistery_dedu_planilla(s)){
//            
//            JOptionPane.showMessageDialog(this, "Funciono");
//            
//            //b.setId_Emp(Integer.parseInt(this.lbl.getText()));
 //          Funciones.setListarJoinDedu(lbl.getText(), idPlanilla.getText());
           Funciones.sumarColumn();
          Funciones.sumarTotalAPagar();
//           dispose();
//            
//        }else{
//            JOptionPane.showMessageDialog(this, "Nada");
//            
//            
//        }
//        }else{
//            JOptionPane.showMessageDialog(null, "No se realizo el borrado");
//        }
//       
    }//GEN-LAST:event_btbSelectActionPerformed

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
 txtValor.setText(txtValor.getText().replaceAll("( )+", " "));
        
  char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();      
        
        int tam = txtValor.getText().length();
        if(tam>=6){
            evt.consume();
        } 
    }//GEN-LAST:event_txtValorKeyTyped
private void select(){
         int fila = tblDedu.getSelectedRow(); 
                   String Id, nombre, precio, cantidad, total;
           DefaultTableModel modelo = (DefaultTableModel) tblDedu.getModel();
           Id= tblDedu.getValueAt(fila, 0).toString();
           nombre= tblDedu.getValueAt(fila, 1).toString();
          // precio= tblBoni.getValueAt(fila, 2).toString();
           cantidad = txtValor.getText();
           int a =0;
       
        
       if (txtValor.getText().length()==0){
//                this.sexo.getSelectedItem().equals(0)||
//                this.TxtSue.getText().length()==0||
//                this.txtFun.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Seleccione una cantidad");
            
        } else {
           
           for (int i = 0; i < DETALLE_PLANILLAS.tbldedu.getRowCount(); i++) {
               String val = DETALLE_PLANILLAS.tbldedu.getValueAt(i, 0).toString();
               if (Id.equals(val)) {
                   a=1;
               }
               
           }
           if (a>0) {
               JOptionPane.showMessageDialog(null, "Esta bonificacion ya fue seleccionada");
               
           } else {
               DefaultTableModel m = (DefaultTableModel)DETALLE_PLANILLAS.tbldedu.getModel();
   
           
           String filla[] = {Id, nombre, cantidad};
           m.addRow(filla);
           }
      }
    }
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
            java.util.logging.Logger.getLogger(SELECCIONAR_DEDUCCION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SELECCIONAR_DEDUCCION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SELECCIONAR_DEDUCCION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SELECCIONAR_DEDUCCION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SELECCIONAR_DEDUCCION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbSelect;
    public static javax.swing.JLabel idPlanilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbl;
    public static javax.swing.JLabel lblSistemaFecha;
    public static javax.swing.JLabel pagooo;
    public static javax.swing.JTable tblDedu;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
