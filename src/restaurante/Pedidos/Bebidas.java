package restaurante.Pedidos;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import restaurante.Comida;
import restaurante.Funciones;
import restaurante.Intro;
import restaurante.Principal;

public class Bebidas extends javax.swing.JInternalFrame {

    public Bebidas() {
        initComponents();
    }
    String cat = "bebida";
    Comida comida1 = new Comida("Agua", 1f, cat);
    Comida comida2 = new Comida("Coca Cola", 2.5f, cat);
    Comida comida3 = new Comida("Fanta", 2f, cat);
    Comida comida4 = new Comida("Nestea", 2f, cat);
    Comida comida5 = new Comida("7up", 1.5f, cat);
    Comida comida6 = new Comida("Vino", 3.5f, cat);
    Funciones a = new Funciones();
    
    public DefaultListModel getModelo() {
        return modelo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        list = new javax.swing.JScrollPane();
        modelo=new DefaultListModel();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 770));

        Panel.setBackground(new java.awt.Color(51, 51, 51));
        Panel.setPreferredSize(new java.awt.Dimension(900, 770));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setText("Siguiente");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Panel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, -1, 50));

        jButton8.setText("Atras");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, -1, 50));

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, -1, -1));

        jButton4.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Bebidas/Nestea.png"))); // NOI18N
        jButton4.setText("Nestea");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setIconTextGap(-3);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Bebidas/NesteaG.png"))); // NOI18N
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Panel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 210, 240));

        jButton1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Bebidas/Agua.png"))); // NOI18N
        jButton1.setText("Agua");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(-3);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Bebidas/AguaG.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 240));

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Bebidas/cooltext233511918247090.png"))); // NOI18N
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 290, 100));

        jButton3.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Bebidas/Fanta.png"))); // NOI18N
        jButton3.setText("Fanta");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(-3);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Bebidas/FantaG.png"))); // NOI18N
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 210, 240));

        jButton6.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Bebidas/Vino.png"))); // NOI18N
        jButton6.setText("Vino");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setIconTextGap(-3);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Bebidas/VinoG.png"))); // NOI18N
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 210, 240));

        jButton5.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Bebidas/SevenUp.png"))); // NOI18N
        jButton5.setText("7up");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setIconTextGap(-3);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Bebidas/SevenUpG.png"))); // NOI18N
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Panel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 210, 240));

        list.setBorder(null);

        jList1.setBackground(new java.awt.Color(51, 51, 51));
        jList1.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(modelo);
        list.setViewportView(jList1);

        Panel.add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 170, 410));

        jButton2.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Bebidas/CocaCola.png"))); // NOI18N
        jButton2.setText("Coca Cola");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-3);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Mesas/Bebidas/CocaColaG.png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 210, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Postre p1 = new Postre();
        a.cargarLista(p1.getModelo());
        Intro.principal.PanelCuarto.setVisible(false);
        if (Intro.principal.PanelQuinto.getComponentCount() == 0){
            Intro.principal.PanelQuinto.add(p1);
        }
        Intro.principal.PanelQuinto.setVisible(true);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.show();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        SegundoPlato p1 = new SegundoPlato();
        a.cargarLista(p1.getModelo());
        Principal.atras = true;
        Intro.principal.PanelCuarto.setVisible(false);
        Intro.principal.PanelTercero.remove(0);
        Intro.principal.PanelTercero.add(p1);
        Intro.principal.PanelTercero.setVisible(true);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.show();
    }//GEN-LAST:event_jButton8ActionPerformed

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
    private DefaultListModel modelo;
    private javax.swing.JScrollPane list;
    // End of variables declaration//GEN-END:variables
}
