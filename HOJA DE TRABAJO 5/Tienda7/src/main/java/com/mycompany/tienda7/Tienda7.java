
package com.mycompany.tienda7;


public class Tienda7 {

   public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        carrito.agregarItem("Teclado", 1, 150.00);
        carrito.agregarItem("Mouse", 2, 80.00);
        carrito.agregarItem("Monitor", 1, 900.00);

        System.out.println("--- Carrito inicial ---");
        carrito.mostrarCarrito();
        System.out.println("Total: Q" + String.format("%.2f", carrito.calcularTotal()));

        // Agregamos otro Teclado: debe SUMAR cantidad, no duplicar el ítem
        carrito.agregarItem("Teclado", 1, 150.00);

        System.out.println("\n--- Despues de agregar otro Teclado ---");
        carrito.mostrarCarrito();
        System.out.println("Total: Q" + String.format("%.2f", carrito.calcularTotal()));

        // Eliminamos el Mouse
        carrito.eliminarItem("Mouse");

        System.out.println("\n--- Despues de eliminar el Mouse ---");
        carrito.mostrarCarrito();
        System.out.println("Total: Q" + String.format("%.2f", carrito.calcularTotal()));

        // Vaciamos el carrito
        carrito.vaciarCarrito();

        System.out.println("\n--- Despues de vaciar el carrito ---");
        carrito.mostrarCarrito();
        System.out.println("Total: Q" + String.format("%.2f", carrito.calcularTotal()));
    }
}

