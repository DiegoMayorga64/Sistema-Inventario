package Proceso;

import java.util.Vector;
import Proceso.ListaArticulosConsumidos;

public class Pedido {

    private String producto;
    private String tamaño;

    public Pedido(String producto, String tamaño) {
        this.producto = producto;
        this.tamaño = tamaño;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

}
