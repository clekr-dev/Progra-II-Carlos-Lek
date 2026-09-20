
package com.mycompany.fracturacion8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Fracturacion8 {

    
    public static HashMap<String, Double> generarResumenPorCliente(ArrayList<Factura> facturas) {
        HashMap<String, Double> resumen = new HashMap<>();

        for (Factura f : facturas) {
            String cliente = f.getCliente();
            double monto = f.getMonto();

            if (resumen.containsKey(cliente)) {
                // Ya existe: sumamos al total que ya tenía
                double totalActual = resumen.get(cliente);
                resumen.put(cliente, totalActual + monto);
            } else {
                // Primera factura de este cliente
                resumen.put(cliente, monto);
            }
        }

        return resumen;
    }

    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();

        facturas.add(new Factura(1, "Ana Lopez", 1200.00));
        facturas.add(new Factura(2, "Carlos Perez", 800.00));
        facturas.add(new Factura(3, "Ana Lopez", 500.00));
        facturas.add(new Factura(4, "Maria Gomez", 2200.00));
        facturas.add(new Factura(5, "Carlos Perez", 950.00));
        facturas.add(new Factura(6, "Ana Lopez", 300.00));
        facturas.add(new Factura(7, "Maria Gomez", 150.00));

        System.out.println("--- Todas las facturas ---");
        for (Factura f : facturas) {
            System.out.println(f);
        }

        HashMap<String, Double> resumen = generarResumenPorCliente(facturas);

        System.out.println("\n--- Resumen de monto total por cliente ---");
        for (Map.Entry<String, Double> entrada : resumen.entrySet()) {
            System.out.println(entrada.getKey() + ": Q" + String.format("%.2f", entrada.getValue()));
        }
    }
}
