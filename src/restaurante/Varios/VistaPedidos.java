/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Varios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static restaurante.Intro.conexion;

/**
 *
 * @author klemavilanova
 */
public class VistaPedidos extends javax.swing.JInternalFrame {

    DefaultTableModel model = null;
    DefaultTableModel model2 = null;

    public VistaPedidos() {
        initComponents();
        try {
            this.cargarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(VistaPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarTabla() throws SQLException {
        model = (DefaultTableModel) jTable1.getModel();
        ResultSet rs = conexion.selectPedido();
        while (rs.next()) {
            model.addRow(new Object[]{rs.getInt("NPedido"), rs.getInt("NMesa"), rs.getFloat("Precio"), rs.getDate("Fecha")});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(900, 780));

        jPanel1.setMinimumSize(new java.awt.Dimension(900, 780));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 780));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Plato", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 358, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NPedido", "NMesa", "Precio", "Fecha"
            }
        ));
        jTable1.setAutoscrolls(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 330, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int nfila = jTable1.getSelectedRow();
        model2 = (DefaultTableModel) jTable2.getModel();
        model2.getDataVector().removeAllElements();
        ResultSet rs;
        for (int i = 1; i <= 4; i++) {
            try {
                rs = conexion.selectPlatos(i, nfila+1);
                while (rs.next()) {
                    model2.addRow(new Object[]{rs.getString("NombrePlato"), rs.getInt("Cantidad")});
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
