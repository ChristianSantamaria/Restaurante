package restaurante;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import restaurante.Pedidos.ListaDeMesas;
import restaurante.Pedidos.PrimerPlato;
import restaurante.Varios.VistaMesas;
import restaurante.Varios.VistaPedidos;

public class Principal extends javax.swing.JInternalFrame {

    public static ArrayList<Pedido> TotalPedidos = new ArrayList<Pedido>();
    public static ArrayList<Comida> lista = new ArrayList<Comida>();

    public static Boolean atras = false;

    public static Pedido nuevoPedido = new Pedido();

    public Principal() {
        initComponents();
        cargarPedidos();
    }

    public JPanel getPanel2() {
        return PanelPrimero;
    }

    public void setPanel2(JPanel Panel2) {
        this.PanelPrimero = Panel2;
    }

    public void cargarPedidos() {

        File ar = new File("ListaPedidos.txt");
        Scanner sc;
        try {
            sc = new Scanner(ar);
            while (sc.hasNextLine()) {
                String textoPedido = sc.nextLine();
                cargarPedido(textoPedido);
            }
            sc.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger("No se ha podido encontrar el archivo");
        }
    }

    public void cargarPedido(String lineaPedido) {

        String[] atributosPedidos = lineaPedido.split("--");

        String[] primerPlato = atributosPedidos[1].split("\\*");
        Comida[] comidaPP = new Comida[primerPlato.length];

        for (int i = 0; i < primerPlato.length; i++) {
            int inicio = primerPlato[i].indexOf(".");
            int fin = inicio + 2;

            comidaPP[i] = new Comida(primerPlato[i].substring(0, inicio), 0f);
            comidaPP[i].setCantidad(Integer.parseInt(primerPlato[i].substring(inicio + 1, fin)));
        }

        String[] segundoPlato = atributosPedidos[2].split("\\*");
        Comida[] comidaSP = new Comida[segundoPlato.length];

        for (int i = 0; i < segundoPlato.length; i++) {
            int inicio = segundoPlato[i].indexOf(".");
            int fin = inicio + 2;

            comidaSP[i] = new Comida(segundoPlato[i].substring(0, inicio), 0f);
            comidaSP[i].setCantidad(Integer.parseInt(segundoPlato[i].substring(inicio + 1, fin)));
        }

        //
        String[] postre = atributosPedidos[3].split("\\*");

        Comida[] comidaPostre = new Comida[postre.length];

        for (int i = 0; i < postre.length; i++) {
            int inicio = postre[i].indexOf(".");
            int fin = inicio + 2;

            comidaPostre[i] = new Comida(postre[i].substring(0, inicio), 0f);
            comidaPostre[i].setCantidad(Integer.parseInt(postre[i].substring(inicio + 1, fin)));
        }

        String[] bebida = atributosPedidos[4].split("\\*");

        Comida[] comidaBebida = new Comida[bebida.length];

        for (int i = 0; i < bebida.length; i++) {
            int inicio = bebida[i].indexOf(".");
            int fin = inicio + 2;

            comidaBebida[i] = new Comida(bebida[i].substring(0, inicio), 0f);
            comidaBebida[i].setCantidad(Integer.parseInt(bebida[i].substring(inicio + 1, fin)));
        }

        Pedido PedidoCargado = new Pedido();
        //Mesa
        PedidoCargado.setN_mesa(Integer.parseInt(atributosPedidos[0]));
        //Primer plato
        ArrayList<Comida> AyudaPP = new ArrayList<Comida>();
        for (int i = 0; i < primerPlato.length; i++) {
            AyudaPP.add(comidaPP[i]);
        }
        PedidoCargado.setPrimerPlato(AyudaPP);

        //Segundo plato
        ArrayList<Comida> AyudaSP = new ArrayList<Comida>();
        for (int i = 0; i < segundoPlato.length; i++) {
            AyudaSP.add(comidaSP[i]);
        }
        PedidoCargado.setSegundoPlato(AyudaSP);

        //Postre
        ArrayList<Comida> AyudaPostre = new ArrayList<Comida>();
        for (int i = 0; i < postre.length; i++) {
            AyudaPostre.add(comidaPostre[i]);
        }
        PedidoCargado.setPostre(AyudaPostre);

        //Bebida
        ArrayList<Comida> AyudaBebida = new ArrayList<Comida>();
        for (int i = 0; i < bebida.length; i++) {
            AyudaBebida.add(comidaBebida[i]);
        }
        PedidoCargado.setBebida(AyudaBebida);
        PedidoCargado.setPrecioPedido(Float.parseFloat(atributosPedidos[5]));

        TotalPedidos.add(PedidoCargado);

    }

    public static void escribirPedidos() {

        File ar = new File("ListaPedidos.txt");
        Scanner sc;

        try {
            FileWriter escritor = new FileWriter(ar);
            sc = new Scanner(ar);
            escritor.write("");

            for (Pedido i : TotalPedidos) {
                escribirPed(ar);
            }
            escritor.close();
        } catch (IOException ex) {
            Logger.getLogger("No se ha podido encontrar el archivo");
        }

    }

    public static void escribirPed(File ar) throws IOException {
        FileWriter escritor = new FileWriter(ar);

        for (Pedido i : TotalPedidos) {
            String PedidoEscritor = "";
            int cont = 0;

            PedidoEscritor += i.getN_mesa() + "--";

            for (Comida j : i.primerPlato) {
                if (cont == 0) {
                    PedidoEscritor += j.getNombre() + "." + j.getCantidad();
                } else {
                    PedidoEscritor += "\\*" + j.getNombre() + "." + j.getCantidad();
                }
            }
            cont = 0;
            PedidoEscritor += "--";

            for (Comida j : i.segundoPlato) {
                if (cont == 0) {
                    PedidoEscritor += j.getNombre() + "." + j.getCantidad();
                } else {
                    PedidoEscritor += "\\*" + j.getNombre() + "." + j.getCantidad();
                }
            }
            cont = 0;
            PedidoEscritor += "--";

            for (Comida j : i.postre) {
                if (cont == 0) {
                    PedidoEscritor += j.getNombre() + "." + j.getCantidad();
                } else {
                    PedidoEscritor += "\\*" + j.getNombre() + "." + j.getCantidad();
                }
            }

            cont = 0;
            PedidoEscritor += "--";

            for (Comida j : i.bebida) {
                if (cont == 0) {
                    PedidoEscritor += j.getNombre() + "." + j.getCantidad();
                } else {
                    PedidoEscritor += "\\*" + j.getNombre() + "." + j.getCantidad();
                }
            }

            cont = 0;
            PedidoEscritor += "--" + i.precioPedido;
            escritor.write(PedidoEscritor + "\n");
            escritor.flush();
        }
    }

    public static void escribirBase(Pedido nuevoPed) throws SQLException {
        
        Intro.conexion.insertarPedidos(nuevoPed.getN_pedido(), nuevoPed.getN_mesa(), nuevoPed.getPrecioPedido());
        for (Comida j : nuevoPed.primerPlato) {
            Intro.conexion.insertarPlatos("PP", nuevoPed.getN_pedido(), j.getNombre(), j.getCantidad());
        }
        for (Comida j : nuevoPed.segundoPlato) {
            Intro.conexion.insertarPlatos("SP", nuevoPed.getN_pedido(), j.getNombre(), j.getCantidad());
        }
        for (Comida j : nuevoPed.postre) {
            Intro.conexion.insertarPlatos("POSTRE", nuevoPed.getN_pedido(), j.getNombre(), j.getCantidad());
        }
        for (Comida j : nuevoPed.bebida) {
            Intro.conexion.insertarPlatos("BEBIDA", nuevoPed.getN_pedido(), j.getNombre(), j.getCantidad());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        PanelPrimero = new javax.swing.JPanel();
        PanelSegundo = new javax.swing.JPanel();
        PanelTercero = new javax.swing.JPanel();
        PanelCuarto = new javax.swing.JPanel();
        PanelQuinto = new javax.swing.JPanel();
        PanelSexto = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(900, 770));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(51, 51, 51));
        Panel.setOpaque(false);
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 3, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/Titulo.png"))); // NOI18N
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 480, 110));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/FontAwesome_f0f5(0)_200.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-3);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 180, -1));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/FontAwesome_f0ea(0)_200.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setIconTextGap(-3);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 180, -1));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/Home.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setIconTextGap(-3);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 180, -1));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelPrimero.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout PanelPrimeroLayout = new javax.swing.GroupLayout(PanelPrimero);
        PanelPrimero.setLayout(PanelPrimeroLayout);
        PanelPrimeroLayout.setHorizontalGroup(
            PanelPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        PanelPrimeroLayout.setVerticalGroup(
            PanelPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        getContentPane().add(PanelPrimero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 900, 780));

        PanelSegundo.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout PanelSegundoLayout = new javax.swing.GroupLayout(PanelSegundo);
        PanelSegundo.setLayout(PanelSegundoLayout);
        PanelSegundoLayout.setHorizontalGroup(
            PanelSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        PanelSegundoLayout.setVerticalGroup(
            PanelSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        getContentPane().add(PanelSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 900, 780));

        PanelTercero.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout PanelTerceroLayout = new javax.swing.GroupLayout(PanelTercero);
        PanelTercero.setLayout(PanelTerceroLayout);
        PanelTerceroLayout.setHorizontalGroup(
            PanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        PanelTerceroLayout.setVerticalGroup(
            PanelTerceroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        getContentPane().add(PanelTercero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 900, 780));

        PanelCuarto.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout PanelCuartoLayout = new javax.swing.GroupLayout(PanelCuarto);
        PanelCuarto.setLayout(PanelCuartoLayout);
        PanelCuartoLayout.setHorizontalGroup(
            PanelCuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        PanelCuartoLayout.setVerticalGroup(
            PanelCuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        getContentPane().add(PanelCuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 900, 780));

        PanelQuinto.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout PanelQuintoLayout = new javax.swing.GroupLayout(PanelQuinto);
        PanelQuinto.setLayout(PanelQuintoLayout);
        PanelQuintoLayout.setHorizontalGroup(
            PanelQuintoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        PanelQuintoLayout.setVerticalGroup(
            PanelQuintoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        getContentPane().add(PanelQuinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 900, 780));

        PanelSexto.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout PanelSextoLayout = new javax.swing.GroupLayout(PanelSexto);
        PanelSexto.setLayout(PanelSextoLayout);
        PanelSextoLayout.setHorizontalGroup(
            PanelSextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        PanelSextoLayout.setVerticalGroup(
            PanelSextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        getContentPane().add(PanelSexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 900, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ListaDeMesas p1 = new ListaDeMesas();
        Panel.setVisible(false);
        if (Intro.principal.PanelPrimero.getComponentCount() == 0) {
            PanelPrimero.add(p1);
        }
        PanelPrimero.setVisible(true);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        VistaMesas p1 = new VistaMesas();
        Panel.setVisible(false);
        if (Intro.principal.PanelPrimero.getComponentCount() == 0) {
            PanelPrimero.add(p1);
        }
        PanelPrimero.setVisible(true);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.show();    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        VistaPedidos p1 = new VistaPedidos();
        Panel.setVisible(false);
        if (Intro.principal.PanelPrimero.getComponentCount() == 0) {
            PanelPrimero.add(p1);
        }
        PanelPrimero.setVisible(true);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.show();
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane Panel;
    public javax.swing.JPanel PanelCuarto;
    public javax.swing.JPanel PanelPrimero;
    public javax.swing.JPanel PanelQuinto;
    public javax.swing.JPanel PanelSegundo;
    public javax.swing.JPanel PanelSexto;
    public javax.swing.JPanel PanelTercero;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
