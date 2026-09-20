

package com.mycompany.tiendaproductos;


import java.util.ArrayList;

public class TiendaProductos {

    public static void aumentarPrecioBajoStock(ArrayList<Producto> productos, double porcentaje) {
        for (Producto p : productos) {
            if (p.getStock() < 10) {
                double nuevoPrecio = p.getPrecio() + (p.getPrecio() * porcentaje / 100);
                p.setPrecio(nuevoPrecio);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto(1, "Teclado", 150.00, 5));
        productos.add(new Producto(2, "Mouse", 80.00, 25));
        productos.add(new Producto(3, "Monitor", 900.00, 3));
        productos.add(new Producto(4, "Audifonos", 120.00, 15));
        productos.add(new Producto(5, "Webcam", 200.00, 8));

        System.out.println("--- Antes del aumento ---");
        for (Producto p : productos) {
            System.out.println(p);
        }

        aumentarPrecioBajoStock(productos, 20);

        System.out.println("\n--- Despues del aumento ---");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}

