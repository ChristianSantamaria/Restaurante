/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author kevin
 */
public class Comida {
    private String nombre;
    private Float precio;
    private int cantidad = 0;
    private String cat;

    public Comida(String nombre, Float precio, String cat) {
        this.nombre = nombre;
        this.precio = precio;
        this.cat = cat;
    }
    
    public Comida(String nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCat() {
        return cat;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Comida{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
}
