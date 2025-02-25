/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Papeleria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Inventario {

    List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarInventario() {
        for (Producto producto : productos) {
            producto.mostrarDetalles();
            System.out.println("-------------------------");
        }
    }

}
