/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tallermc;

import Papeleria.Inventario;
import Papeleria.ProductoPapeleria;

/**
 *
 * @author User
 */
public class MainPapeleria {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        ProductoPapeleria cuaderno = new ProductoPapeleria("Cuaderno", 3.00, 100, "Papeles");
        ProductoPapeleria lapiz = new ProductoPapeleria("Lapiz", 0.50, 200, "Escritorio");

        inventario.agregarProducto(cuaderno);
        inventario.agregarProducto(lapiz);

        inventario.mostrarInventario();
    }
}
