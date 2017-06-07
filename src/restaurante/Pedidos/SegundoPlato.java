/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Pedidos;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import restaurante.Comida;
import restaurante.Funciones;
import restaurante.Intro;
import restaurante.Principal;

/**
 *
 * @author christian
 */
public class SegundoPlato extends javax.swing.JInternalFrame {

    /**
     * Creates new form SegundoPlato
     */
    public SegundoPlato() {
        initComponents();
    }
    String cat = "segundo";
    Comida comida1 = new Comida("Alitas de pollo", 4.50f, cat);
    Comida comida2 = new Comida("Chuletillas de cerdo", 6.25f, cat);
    Comida comida3 = new Comida("Salmon", 5.30f, cat);
    Comida comida4 = new Comida("Gnocchis de patata", 4.75f, cat);    
    Comida comida5 = new Comida("Trucha a la navarra", 6.00f, cat);
    Comida comida6 = new Comida("Fritatta", 4.35f, cat);
    Funciones a = new Funciones();
    
    public DefaultListModel getModelo() {
        return modelo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        list = new javax.swing.JScrollPane();
        modelo=new DefaultListModel();
        jList1 = new javax.swing.JList<>();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(900, 770));

        Panel.setBackground(new java.awt.Color(51, 51, 51));
        Panel.setPreferredSize(new java.awt.Dimension(900, 780));
        Panel.setRequestFocusEnabled(false);
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setText("Atras");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, -1, 50));

        jButton9.setText("Siguiente");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Panel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, -1, 50));

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, -1, -1));

        jButton1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida2/AlitasDePollo.png"))); // NOI18N
        jButton1.setText("Alitas de pollo");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(-3);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida2/AlitasDePolloG.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 240));

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida2/cooltext233371189375663.png"))); // NOI18N
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 570, 100));

        jButton2.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida2/ChuletasDeCerdo.png"))); // NOI18N
        jButton2.setText("Chuletillas de cerdo");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-3);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida2/ChuletasDeCerdoG.png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 210, 240));

        jButton3.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida2/Salmon.png"))); // NOI18N
        jButton3.setText("Salmon");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(-3);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida2/SalmonG.png"))); // NOI18N
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 210, 240));

        jButton6.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida2/Frittata.png"))); // NOI18N
        jButton6.setText("Frittata");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setIconTextGap(-3);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida2/FrittataG.png"))); // NOI18N
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 210, 240));

        jButton5.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida2/TruchaALaNavarra.png"))); // NOI18N
        jButton5.setText("Trucha a la Navarra");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setIconTextGap(-3);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida2/TruchaALaNavarraG.png"))); // NOI18N
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Panel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 210, 240));

        jButton4.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida2/GnocchisDePatata.png"))); // NOI18N
        jButton4.setText("Gnocchis de patata");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setIconTextGap(-3);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Comida2/GnocchisDePatataG.png"))); // NOI18N
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Panel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 210, 240));

        list.setBorder(null);

        jList1.setBackground(new java.awt.Color(51, 51, 51));
        jList1.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(modelo);
        list.setViewportView(jList1);

        Panel.add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 170, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        a.seleccionarProducto(comida4, modelo);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        a.seleccionarProducto(comida5, modelo);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        a.seleccionarProducto(comida6, modelo);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        a.seleccionarProducto(comida3, modelo);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        a.seleccionarProducto(comida2, modelo);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        a.seleccionarProducto(comida1, modelo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String value = jList1.getSelectedValue().substring(5, jList1.getSelectedValue().length());
        for (Comida c : Principal.lista) {
            String cnombre = c.getNombre();
            if (value.equals(cnombre)) {
                c.setCantidad(c.getCantidad() - 1);
                if (c.getCantidad() == 0) {
                    Principal.lista.remove(c);
                }
                break;
            }
        }
        modelo.removeAllElements();
        for (Comida c : Principal.lista) {
            modelo.addElement(c.getCantidad() + "x   " + c.getNombre());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Bebidas p1 = new Bebidas();
        a.cargarLista(p1.getModelo());
        Intro.principal.PanelTercero.setVisible(false);
        if (Intro.principal.PanelCuarto.getComponentCount() == 0){
            Intro.principal.PanelCuarto.add(p1);
        }
        Intro.principal.PanelCuarto.setVisible(true);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.show();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        PrimerPlato p1 = new PrimerPlato();
        a.cargarLista(p1.getModelo());
        Principal.atras = true;
        Intro.principal.PanelTercero.setVisible(false);
        Intro.principal.PanelSegundo.remove(0);
        Intro.principal.PanelSegundo.add(p1);
        Intro.principal.PanelSegundo.setVisible(true);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.show();
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private static DefaultListModel modelo;
    private javax.swing.JScrollPane list;
    // End of variables declaration//GEN-END:variables
}
