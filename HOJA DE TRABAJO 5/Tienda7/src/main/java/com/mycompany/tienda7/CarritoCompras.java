
package com.mycompany.tienda7;

import java.util.ArrayList;

public class CarritoCompras {
    private final ArrayList<ItemCarrito> items;

    public CarritoCompras() {
        this.items = new ArrayList<>();
    }

    // Agrega un producto; si ya existe, incrementa la cantidad en vez de duplicar
    public void agregarItem(String producto, int cantidad, double precioUnitario) {
        for (ItemCarrito item : items) {
            if (item.getProducto().equalsIgnoreCase(producto)) {
                item.setCantidad(item.getCantidad() + cantidad);
                return;
            }
        }
        // Si no existe, se agrega como ítem nuevo
        items.add(new ItemCarrito(producto, cantidad, precioUnitario));
    }

    // Elimina un producto del carrito por nombre
    public void eliminarItem(String producto) {
        items.removeIf(item -> item.getProducto().equalsIgnoreCase(producto));
    }

    // Vacía el carrito por completo
    public void vaciarCarrito() {
        items.clear();
    }

    // Calcula el total sumando el subtotal de todos los ítems
    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public ArrayList<ItemCarrito> getItems() {
        return items;
    }

    public void mostrarCarrito() {
        System.out.println("--- Carrito de compras (" + items.size() + " productos) ---");
        for (ItemCarrito item : items) {
            System.out.println(item);
        }
    }
}

