

package com.mycompany.ventasdiarias6;


import java.util.ArrayList;

public class VentasDiarias6 {

    // Calcula el promedio de todas las ventas
    public static double calcularPromedio(ArrayList<Double> ventas) {
        double suma = 0;
        for (double v : ventas) {
            suma += v;
        }
        return suma / ventas.size();
    }

    // Encuentra el valor máximo de la lista
    public static double calcularMaximo(ArrayList<Double> ventas) {
        double max = ventas.get(0);
        for (double v : ventas) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    // Encuentra el valor mínimo de la lista
    public static double calcularMinimo(ArrayList<Double> ventas) {
        double min = ventas.get(0);
        for (double v : ventas) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    // Cuenta cuántos días las ventas superaron el promedio
    public static int contarDiasSobrePromedio(ArrayList<Double> ventas, double promedio) {
        int contador = 0;
        for (double v : ventas) {
            if (v > promedio) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        ArrayList<Double> ventas = new ArrayList<>();

        ventas.add(1200.00);
        ventas.add(950.50);
        ventas.add(1800.00);
        ventas.add(700.25);
        ventas.add(2100.00);
        ventas.add(1300.00);
        ventas.add(890.00);
        ventas.add(1500.75);
        ventas.add(600.00);
        ventas.add(2400.00);
        ventas.add(1100.00);
        ventas.add(980.00);
        ventas.add(1750.00);
        ventas.add(1250.50);
        ventas.add(830.00);
        ventas.add(2000.00);
        ventas.add(1400.00);
        ventas.add(760.00);
        ventas.add(1950.00);
        ventas.add(1050.00);
        ventas.add(1600.00);
        ventas.add(920.00);
        ventas.add(2200.00);
        ventas.add(1150.00);
        ventas.add(870.00);
        ventas.add(1700.00);
        ventas.add(1000.00);
        ventas.add(1450.00);
        ventas.add(790.00);
        ventas.add(2050.00);

        System.out.println("--- Ventas del mes ---");
        for (int i = 0; i < ventas.size(); i++) {
            System.out.println("Dia " + (i + 1) + ": Q" + String.format("%.2f", ventas.get(i)));
        }

        double promedio = calcularPromedio(ventas);
        double maximo = calcularMaximo(ventas);
        double minimo = calcularMinimo(ventas);
        int diasSobrePromedio = contarDiasSobrePromedio(ventas, promedio);

        System.out.println("\n--- Resumen del mes ---");
        System.out.println("Promedio mensual: Q" + String.format("%.2f", promedio));
        System.out.println("Venta maxima: Q" + String.format("%.2f", maximo));
        System.out.println("Venta minima: Q" + String.format("%.2f", minimo));
        System.out.println("Dias con ventas sobre el promedio: " + diasSobrePromedio);
    }
}
