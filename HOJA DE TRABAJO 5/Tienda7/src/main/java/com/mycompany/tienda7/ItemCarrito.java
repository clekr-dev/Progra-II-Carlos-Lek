
package com.mycompany.tienda7;


public class ItemCarrito {
    private String producto;
    private int cantidad;
    private double precioUnitario;

    public ItemCarrito(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    // Calcula el subtotal de este ítem (cantidad * precio unitario)
    public double getSubtotal() {
        return cantidad * precioUnitario;
    }

    @Override
    public String toString() {
        return "ItemCarrito{" +
                "producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + String.format("%.2f", precioUnitario) +
                ", subtotal=" + String.format("%.2f", getSubtotal()) +
                '}';
    }
}

