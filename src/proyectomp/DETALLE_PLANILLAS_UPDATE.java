/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomp;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static proyectomp.DETALLE_PLANILLAS.lblId;
import static proyectomp.DETALLE_PLANILLAS.lblIdD;
import static proyectomp.DETALLE_PLANILLAS.tblMostrarEmp;
import static proyectomp.MOSTRARCARGO.tblCa;
import static proyectomp.MostrarPlanillas.tbl;

/**
 *
 * @author Calix
 */
public class DETALLE_PLANILLAS_UPDATE extends javax.swing.JFrame {

    /**
     * Creates new form DETALLE_PLANILLAS
     */
    public DETALLE_PLANILLAS_UPDATE() {
        initComponents();
        tblBoni.setSelectionMode(NORMAL);
        tbldedu.setSelectionMode(NORMAL);
        tblMostrarEmp.setSelectionMode(NORMAL);
        pagoooo.setVisible(false);
                this.setLocationRelativeTo(null);
        tblBoni.getTableHeader().setReorderingAllowed(false);
        tbldedu.getTableHeader().setReorderingAllowed(false);
        tblMostrarEmp.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        lbltlt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMostrarEmp = new javax.swing.JTable();
        btnEmp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbldedu = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBoni = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        btnDeleteDedu = new javax.swing.JButton();
        btnDeleteBoni = new javax.swing.JButton();
        lblSue = new javax.swing.JLabel();
        lblCa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTotalBoni = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblPago = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnDedu = new javax.swing.JButton();
        btnBoni = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblIdD = new javax.swing.JLabel();
        pagoooo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setText("Quitar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, -1, -1));

        lbltlt.setText("0");
        jPanel1.add(lbltlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 580, 80, -1));

        tblMostrarEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Detalle", "Id", "Empleado", "Apellido", "Cargo", "Sueldo", "Bonificacion", "Deduccion", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMostrarEmp);
        if (tblMostrarEmp.getColumnModel().getColumnCount() > 0) {
            tblMostrarEmp.getColumnModel().getColumn(1).setMinWidth(0);
            tblMostrarEmp.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblMostrarEmp.getColumnModel().getColumn(1).setMaxWidth(0);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 710, 110));

        btnEmp.setText("BUSCAR");
        btnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Seleccione un empleado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("DETALLE PLANILLA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 11, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Deducciones");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Bonificaciones");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        tbldedu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbldedu);
        if (tbldedu.getColumnModel().getColumnCount() > 0) {
            tbldedu.getColumnModel().getColumn(2).setResizable(false);
        }

        tblBoni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblBoni);

        jLabel8.setText("DEDUCCIONES");

        jLabel9.setText("BONIFICACIONES");

        lblId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblIdKeyReleased(evt);
            }
        });

        btnDeleteDedu.setText("ELIMINAR");
        btnDeleteDedu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDeduActionPerformed(evt);
            }
        });

        btnDeleteBoni.setText("ELIMINAR");
        btnDeleteBoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBoniActionPerformed(evt);
            }
        });

        jLabel5.setText("Total a Pagar");

        lblTotalBoni.setText("0");

        lblTotal.setText("0");

        lblPago.setText("0");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSue, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(245, 245, 245))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lblPago, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDeleteBoni)
                                    .addComponent(btnDeleteDedu)
                                    .addComponent(lblCa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 23, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalBoni, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(lblCa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(btnDeleteDedu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnDeleteBoni))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalBoni)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblPago))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 710, 330));

        btnDedu.setText("BUSCAR");
        btnDedu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeduActionPerformed(evt);
            }
        });
        jPanel1.add(btnDedu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        btnBoni.setText("BUSCAR");
        btnBoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoniActionPerformed(evt);
            }
        });
        jPanel1.add(btnBoni, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Id_Planilla");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 116, -1, -1));

        lblIdD.setText("1");
        jPanel1.add(lblIdD, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 119, 70, -1));

        pagoooo.setText("jLabel4");
        jPanel1.add(pagoooo, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 451, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 940));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
 Funciones.setListarDetalleUpdate(lblIdD.getText());  
        int a =0;
        for(int i=0; i< tblMostrarEmp.getRowCount(); i++){
            if(tblMostrarEmp.getValueAt(i,0).toString().equals(lblId.getText())){
                a+=1;
              //JOptionPane.showMessageDialog(null, "Ya esta registrado");
            }
        }
        if(a>0){
      
       JOptionPane.showMessageDialog(null, "Ya esta registrado");
        }else{
             Sentencias s = new Sentencias();
       s.setFK_Empleado(Integer.parseInt(this.lblId.getText()));
       s.setFK_Planilla(Integer.parseInt(this.lblIdD.getText()));
       s.setTotal_A_Pagar(Double.parseDouble(this.lblPago.getText()));
       s.setTotalBoni(Double.parseDouble(this.lblTotalBoni.getText()));
       s.setTotalDedu(Double.parseDouble(this.lblTotal.getText()));
            if (Funciones.isRegisterDEP(s)) {
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente la planilla");
                Funciones.setListarDetalleUpdate(lblIdD.getText());
                Funciones.setListarJoinPLANILLA();
                Funciones.sumarPLANILLAUPDATE();
                limpiar();
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Fallo");
            }
//        Sentencias s = new Sentencias();
//       s.setFK_Empleado(Integer.parseInt(this.lblId.getText()));
//       s.setFK_Planilla(Integer.parseInt(this.lblIdD.getText()));
//       s.setTotal_A_Pagar(Double.parseDouble(this.lblPago.getText()));
//       s.setTotalBoni(Double.parseDouble(this.lblTotalBoni.getText()));
//       s.setTotalDedu(Double.parseDouble(this.lblTotal.getText()));
//       
//       
//        if (Funciones.isRegisterDEP(s)) {
//            JOptionPane.showMessageDialog(this, "DETALLE DE PLANILLA A SIDO CREADO");
//            Funciones.setListarDetalleUpdate(lblIdD.getText());
//            Funciones.setListarJoinPLANILLA();
//            Funciones.sumarPLANILLAUPDATE();
//            Funciones.eliminarDUPDATE();
//            Funciones.eliminarUPDATE();
//            limpiar();
//            
//            
//            
//            }else{
//                JOptionPane.showMessageDialog(this, "No se pudo realizar la operacion");
//                
//            }
        }
      //  dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void limpiar(){
       // JOptionPane.showMessageDialog(null, "Ya esta registrado");
             DefaultTableModel modelo = (DefaultTableModel)this.tbldedu.getModel();
             while(modelo.getRowCount() > 0 ){
                modelo.removeRow(0);
                
            }
              DefaultTableModel modelo1 = (DefaultTableModel)this.tblBoni.getModel();
             while(modelo1.getRowCount() > 0 ){
                modelo1.removeRow(0);
                
            }
             lblId.setText("");
             lblCa.setText("");
             lblApellido.setText("");
             lblNombre.setText("");
             lblSue.setText("");
             lblTotal.setText("0");
             lblTotalBoni.setText("0");
             lblPago.setText("0");
        
    
}
    private void btnDeduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeduActionPerformed
if(lblId.getText().length()==0 || 
                
                this.lblNombre.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un empleado");
        }else{        
        SELECCIONAR_DEDUCCION_UPDATE S = new SELECCIONAR_DEDUCCION_UPDATE();
        SELECCIONAR_DEDUCCION_UPDATE.lbl.setText(this.lblId.getText());
        SELECCIONAR_DEDUCCION_UPDATE.pagooo.setText(this.pagoooo.getText());
        SELECCIONAR_DEDUCCION_UPDATE.idPlanilla.setText(this.lblIdD.getText());
       S.setVisible(true);
}
    }//GEN-LAST:event_btnDeduActionPerformed

    private void lblIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblIdKeyReleased
      
    }//GEN-LAST:event_lblIdKeyReleased

    private void btnBoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoniActionPerformed
        if(lblId.getText().length()==0 || 
                
                this.lblNombre.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un empleado");
        }else{ 
        Seleccionar_Bonificacioin_Update S = new Seleccionar_Bonificacioin_Update();
        Seleccionar_Bonificacioin_Update.LBLEMP.setText(this.lblId.getText());
         Seleccionar_Bonificacioin_Update.pagooo.setText(this.pagoooo.getText());
        Seleccionar_Bonificacioin_Update.idPlanilla.setText(this.lblIdD.getText());
       S.setVisible(true);
        }
    }//GEN-LAST:event_btnBoniActionPerformed

    private void btnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpActionPerformed
        // TODO add your handling code here:
        MostarEmpleadosPlanilla_Update M = new MostarEmpleadosPlanilla_Update();
       M.setVisible(true);
    }//GEN-LAST:event_btnEmpActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int fila = tblMostrarEmp.getSelectedRow();
        
        Sentencias s = new Sentencias();
        s.setId_Detalle_Pla(Integer.parseInt(tblMostrarEmp.getValueAt(fila, 8).toString()));
        
        
        
        int a= JOptionPane.showConfirmDialog(null, "esta seguro", "mostrar", JOptionPane.YES_NO_OPTION);
        if (a==JOptionPane.YES_NO_OPTION) {
            
        
        
//            if (Funciones.isDeleteDEP(s)) {
//                JOptionPane.showMessageDialog(this, "Da bien");
//                
//                
//            }
        
        if(Funciones.isDeleteDEP(s)){
            s.setId_Egr(Integer.parseInt(lblIdD.getText()));
        s.setFK_Empleado(Integer.parseInt(tblMostrarEmp.getValueAt(fila, 0).toString()));
        Funciones.Delete_dedu_planilla(s);
        
         s.setId_Boni(Integer.parseInt(lblIdD.getText()));
        s.setFK_Empleado(Integer.parseInt(tblMostrarEmp.getValueAt(fila, 0).toString()));
        Funciones.Delete_boni_planilla(s);
            
            
        
            
            JOptionPane.showMessageDialog(this, "Empleado elmiminado de la planilla");
            Funciones.setListarJoinPLANILLA();
            Funciones.setListarDetalleUpdate(lblIdD.getText());
            Funciones.sumarPLANILLAUPDATE();
        }else{
            JOptionPane.showMessageDialog(this, "Nada");
            
            
        }
        }else{
            JOptionPane.showMessageDialog(null, "No se realizo el borrado");
        }// TOD
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDeleteBoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBoniActionPerformed
        int fila = tblBoni.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel) tblBoni.getModel();
       m.removeRow(fila);
//   int fila = tblBoni.getSelectedRow();
//        Sentencias s = new Sentencias();
//        s.setId_Boni(Integer.parseInt(lblIdD.getText()));
//        s.setFK_Empleado(Integer.parseInt(lblId.getText()));
//        s.setFK_Planilla(Integer.parseInt(tblBoni.getValueAt(fila, 0).toString()));
//        if(Funciones.Delete_boni_planilla_U(s)){
//            JOptionPane.showMessageDialog(null, "Bonificacion eliminado correctamente");
//            Funciones.setListarJoinBoniUpdate(lblId.getText(), lblIdD.getText());
           Funciones.sumarColumnBoniUpdate();
          Funciones.sumarTotalAPagarUpdate();
//            
//        }  
    }//GEN-LAST:event_btnDeleteBoniActionPerformed

    private void btnDeleteDeduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDeduActionPerformed
        int fila = tbldedu.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel) tbldedu.getModel();
             m.removeRow(fila);//        int fila = tbldedu.getSelectedRow();
//        
//        Sentencias s = new Sentencias();
//        s.setId_Egr(Integer.parseInt(lblIdD.getText()));
//        s.setFK_Empleado(Integer.parseInt(lblId.getText()));
//        s.setFK_Planilla(Integer.parseInt(tbldedu.getValueAt(fila, 0).toString()));
//        if(Funciones.Delete_dedu_planilla_U(s)){
//            JOptionPane.showMessageDialog(null, "Deduccion eliminado correctamente");
//            Funciones.setListarJoinDeduUpdate(lblId.getText(), lblIdD.getText());
            Funciones.sumarColumnUpdate();
           Funciones.sumarTotalAPagarUpdate();
//            
//        }
        
    }//GEN-LAST:event_btnDeleteDeduActionPerformed

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
            java.util.logging.Logger.getLogger(DETALLE_PLANILLAS_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DETALLE_PLANILLAS_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DETALLE_PLANILLAS_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DETALLE_PLANILLAS_UPDATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DETALLE_PLANILLAS_UPDATE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    public static javax.swing.JButton btnBoni;
    public static javax.swing.JButton btnDedu;
    public static javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteBoni;
    private javax.swing.JButton btnDeleteDedu;
    public static javax.swing.JButton btnEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JLabel lblApellido;
    public static javax.swing.JLabel lblCa;
    public static javax.swing.JLabel lblId;
    public static javax.swing.JLabel lblIdD;
    public static javax.swing.JLabel lblNombre;
    public static javax.swing.JLabel lblPago;
    public static javax.swing.JLabel lblSue;
    public static javax.swing.JLabel lblTotal;
    public static javax.swing.JLabel lblTotalBoni;
    public static javax.swing.JLabel lbltlt;
    public static javax.swing.JLabel pagoooo;
    public static javax.swing.JTable tblBoni;
    public static javax.swing.JTable tblMostrarEmp;
    public static javax.swing.JTable tbldedu;
    // End of variables declaration//GEN-END:variables
}