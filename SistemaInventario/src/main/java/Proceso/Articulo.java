package Proceso;

import java.util.Vector;
import Proceso.ListaInventario;

public class Articulo {

    private String nombre;
    private int cantidad;
    private String tamaño;

    public Articulo() {

    }

    public Articulo(String nombre, int cantidad, String tamaño) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
