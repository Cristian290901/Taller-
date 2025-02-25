/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Papeleria;

/**
 *
 * @author User
 */
public class ProductoPapeleria extends Producto {

    private String categoria;

    public ProductoPapeleria(String nombre, double precio, int cantidad, String categoria) {
        super(nombre, precio, cantidad);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Categoría: " + categoria);
    }
}
