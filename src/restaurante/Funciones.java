package restaurante;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import restaurante.Pedidos.PrimerPlato;
import restaurante.*;

public class Funciones {

    public void seleccionarProducto(Comida comida, DefaultListModel modelo) {
        int aux = 0;
        if (Principal.lista.size() > 0) {
            for (Comida c : Principal.lista) {
                if (c.getNombre().equals(comida.getNombre())) {
                    c.setCantidad(c.getCantidad() + 1);
                    break;
                } else {
                    aux++;
                }
                if (aux == Principal.lista.size()) {
                    comida.setCantidad(comida.getCantidad() + 1);
                    Principal.lista.add(comida);
                    break;
                }
            }
        } else {
            comida.setCantidad(comida.getCantidad() + 1);
            Principal.lista.add(comida);
        }
        this.cargarLista(modelo);
    }

    public void cargarLista(DefaultListModel modelo) {
        modelo.removeAllElements();
        for (Comida c : Principal.lista) {
            modelo.addElement(c.getCantidad() + "x   " + c.getNombre());
        }    
    }
    
    public void abrirMesas(){
        PrimerPlato p1 = new PrimerPlato();
        this.cargarLista(p1.getModelo());
        if (!Principal.atras) {
            Intro.principal.PanelSegundo.add(p1);
        }
        Principal.atras = false;
        Intro.principal.PanelPrimero.setVisible(false);
        Intro.principal.PanelSegundo.setVisible(true);
        p1.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) p1.getUI()).setNorthPane(null);
        p1.show();
    }
}
