/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomp;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *  
 * @author angel
 */
public class VENTANA_PRINCIPAL extends javax.swing.JFrame {

    /**
     * Creates new form VENTANA_PRINCIPAL
     */
    public VENTANA_PRINCIPAL() {
        initComponents();
        
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
        jButton1 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLocal = new javax.swing.JButton();
        btnCargos = new javax.swing.JButton();
        btnEmpleado = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnPlanill = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnProducto = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnSar = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnIngreso = new javax.swing.JButton();
        btnEgresos = new javax.swing.JButton();
        btnMejores = new javax.swing.JButton();
        btnBoni = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("ayuda");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 620, -1, -1));

        jButton12.setText("SALIR DEL SISTEMA");
        jButton12.setMaximumSize(new java.awt.Dimension(200, 50));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 550, 200, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("BIENVENIDO A SU SISTEMA DE FACTURACION Y VENTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        btnLocal.setText("LOCAL");
        btnLocal.setMaximumSize(new java.awt.Dimension(200, 50));
        btnLocal.setOpaque(false);
        btnLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalActionPerformed(evt);
            }
        });
        jPanel2.add(btnLocal);

        btnCargos.setText("CARGOS");
        btnCargos.setMaximumSize(new java.awt.Dimension(200, 50));
        btnCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargosActionPerformed(evt);
            }
        });
        jPanel2.add(btnCargos);

        btnEmpleado.setText("EMPLEADOS");
        btnEmpleado.setMaximumSize(new java.awt.Dimension(200, 50));
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(btnEmpleado);

        btnUsuario.setText("USUARIOS");
        btnUsuario.setMaximumSize(new java.awt.Dimension(200, 50));
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnUsuario);

        btnPlanill.setText("PLANILLA");
        btnPlanill.setMaximumSize(new java.awt.Dimension(200, 50));
        btnPlanill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanillActionPerformed(evt);
            }
        });
        jPanel2.add(btnPlanill);

        btnInventario.setText("INVENTARIO");
        btnInventario.setMaximumSize(new java.awt.Dimension(200, 50));
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnInventario);

        btnProveedor.setText("PROVEEDORES");
        btnProveedor.setMaximumSize(new java.awt.Dimension(200, 50));
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(btnProveedor);

        btnCompras.setText("COMPRAS");
        btnCompras.setMaximumSize(new java.awt.Dimension(200, 50));
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });
        jPanel2.add(btnCompras);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, 400));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        btnProducto.setText("PRODUCTOS");
        btnProducto.setMaximumSize(new java.awt.Dimension(200, 50));
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jPanel4.add(btnProducto);

        btnCliente.setText("CLIENTES");
        btnCliente.setMaximumSize(new java.awt.Dimension(200, 50));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel4.add(btnCliente);

        btnSar.setText("SAR");
        btnSar.setMaximumSize(new java.awt.Dimension(200, 50));
        btnSar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSarActionPerformed(evt);
            }
        });
        jPanel4.add(btnSar);

        btnVentas.setText("VENTAS");
        btnVentas.setMaximumSize(new java.awt.Dimension(200, 50));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jPanel4.add(btnVentas);

        btnIngreso.setText("INGRESOS");
        btnIngreso.setMaximumSize(new java.awt.Dimension(200, 50));
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });
        jPanel4.add(btnIngreso);

        btnEgresos.setText("EGRESOS");
        btnEgresos.setMaximumSize(new java.awt.Dimension(200, 50));
        btnEgresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEgresosActionPerformed(evt);
            }
        });
        jPanel4.add(btnEgresos);

        btnMejores.setText("MEJORES");
        btnMejores.setMaximumSize(new java.awt.Dimension(200, 50));
        btnMejores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMejoresActionPerformed(evt);
            }
        });
        jPanel4.add(btnMejores);

        btnBoni.setText("REPORTE VENTAS");
        btnBoni.setMaximumSize(new java.awt.Dimension(200, 50));
        btnBoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoniActionPerformed(evt);
            }
        });
        jPanel4.add(btnBoni);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 100, 200, 420));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2019-05-07 at 11.41.00 AM_1.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 690));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private int verificar;

    public int getVerificar() {
        return verificar;
    }

    public void setVerificar(int verificar) {
        this.verificar = verificar;
    }
    
    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        MOSTRAR_PRODUCTOS M = new MOSTRAR_PRODUCTOS();
          if (getVerificar()==1) {
            M.jButton2.setVisible(false);
        }else{
            M.jButton2.setVisible(true);
        }
        M.setVisible(true);
        
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        // TODO add your handling code here:
       Mostrar_Compras CM = new Mostrar_Compras();
//         if (getVerificar()==1) {
//            CM.jButton3.setVisible(false);
//        }else{
//            CM.jButton3.setVisible(true);
//        }
        CM.setVisible(true);
        
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnEgresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEgresosActionPerformed
        // TODO add your handling code here:
        mostrar_Egresoso ME = new mostrar_Egresoso();
        ME.setVisible(true);
        
    }//GEN-LAST:event_btnEgresosActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        int r;
				r = JOptionPane.showConfirmDialog(this, "¿Seguro Que Desea Salir del Sistema?",
						"Confirmación", JOptionPane.OK_CANCEL_OPTION);
				if (r == JOptionPane.OK_OPTION) {
		 			this.dispose();
                                        LOGIN L = new LOGIN();
                                        L.setVisible(true);
			}
       
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalActionPerformed
         LOCAL_REGISTRO L= new LOCAL_REGISTRO();
           if (getVerificar()==1) {
            L.btnBorarr.setVisible(false);
        }else{
            L.btnBorarr.setVisible(true);
        }
        L.setVisible(true);
        
    }//GEN-LAST:event_btnLocalActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        Mostrar_Clientes m = new Mostrar_Clientes();
          if (getVerificar()==1) {
            m.jButton3.setVisible(false);
        }else{
            m.jButton3.setVisible(true);
        }
        m.setVisible(true);
        
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        EMPLEADOS E = new EMPLEADOS();
        if (getVerificar()==1) {
            E.jButton3.setVisible(false);
        }else{
            E.jButton3.setVisible(true);
        }
        E.setVisible(true);
        
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        USUARIOS U = new USUARIOS();
         if (getVerificar()==1) {
            U.jButton2.setVisible(false);
        }else{
            U.jButton2.setVisible(true);
        }
        U.setVisible(true);
        
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnPlanillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanillActionPerformed
        // TODO add your handling code here:
        MostrarPlanillas P = new MostrarPlanillas();
        if (getVerificar()==1) {
            P.jButton3.setVisible(false);
        }else{
            P.jButton3.setVisible(true);
        }
        P.setVisible(true);
    }//GEN-LAST:event_btnPlanillActionPerformed

    private void btnCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargosActionPerformed
        MOSTRARCARGO q = new MOSTRARCARGO();
         if (getVerificar()==1) {
            q.btnEliminar.setVisible(false);
        }else{
            q.btnEliminar.setVisible(true);
        }
        q.setVisible(true);
        
    }//GEN-LAST:event_btnCargosActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        VENTA V = new VENTA();
                V.setVisible(true);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnSarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSarActionPerformed
        // TODO add your handling code here:
        SAR S = new SAR();
          if (getVerificar()==1) {
            S.btnBorarr.setVisible(false);
        }else{
            S.btnBorarr.setVisible(true);
        }
        S.setVisible(true);
    }//GEN-LAST:event_btnSarActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        // TODO add your handling code here:
        Mostrar_Inventario I = new Mostrar_Inventario();
          if (getVerificar()==1) {
            I.jButton3.setVisible(false);
        }else{
            I.jButton3.setVisible(true);
        }
        I.setVisible(true);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        mostrar_Ingresos s = new mostrar_Ingresos();
        s.setVisible(true);
    }//GEN-LAST:event_btnIngresoActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        // TODO add your handling code here:
        PROVEEDOR P = new PROVEEDOR();
          if (getVerificar()==1) {
            P.btnBorrar.setVisible(false);
        }else{
            P.btnBorrar.setVisible(true);
        }
        P.setVisible(true);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnMejoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMejoresActionPerformed
MayorDeAlgo s = new MayorDeAlgo();
s.setVisible(true);
    }//GEN-LAST:event_btnMejoresActionPerformed

    public void abrirarchivo(String archivo){

     try {

            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

     }

}                         
    
    private void btnBoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoniActionPerformed
        MostrarVentas n = new MostrarVentas();
        n.setVisible(true);
    }//GEN-LAST:event_btnBoniActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            abrirarchivo("C:\\11_MEGAPIZZA\\src\\imagenes/ayuda.chm");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VENTANA_PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VENTANA_PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VENTANA_PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VENTANA_PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENTANA_PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnBoni;
    public static javax.swing.JButton btnCargos;
    public static javax.swing.JButton btnCliente;
    public static javax.swing.JButton btnCompras;
    public static javax.swing.JButton btnEgresos;
    public static javax.swing.JButton btnEmpleado;
    public static javax.swing.JButton btnIngreso;
    public static javax.swing.JButton btnInventario;
    public static javax.swing.JButton btnLocal;
    public static javax.swing.JButton btnMejores;
    public static javax.swing.JButton btnPlanill;
    public static javax.swing.JButton btnProducto;
    public static javax.swing.JButton btnProveedor;
    public static javax.swing.JButton btnSar;
    public static javax.swing.JButton btnUsuario;
    public static javax.swing.JButton btnVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
