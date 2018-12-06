package Proceso;

import java.util.ArrayList;

public class ListaInventario {

    public ArrayList<Articulo> listaArticulos;

    public ListaInventario() {
        this.listaArticulos = new ArrayList();
    }

    public void añadirPersona(Articulo articulo) {
        this.listaArticulos.add(articulo);
    }

    public int buscarPersona(String nombre) {

        boolean encontrado = false;
        int indice = -1;

        for (Articulo listaArticulo : listaArticulos) {
            if (listaArticulo.getNombre().equals(nombre)) {
                indice = listaArticulos.indexOf(listaArticulo);
                //encontrado = true;
                break;
            }
        }

        return indice;
    }

    public Articulo obtenerPersona(int index) {
        return this.listaArticulos.get(index);
    }

}
