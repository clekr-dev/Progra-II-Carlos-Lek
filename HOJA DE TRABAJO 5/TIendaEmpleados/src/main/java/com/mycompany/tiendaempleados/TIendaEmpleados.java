

package com.mycompany.tiendaempleados;


import java.util.ArrayList;

public class TIendaEmpleados {

   
    public static ArrayList<Empleado> filtrarPorDepartamento(ArrayList<Empleado> empleados, String departamento) {
        ArrayList<Empleado> resultado = new ArrayList<>();

        for (Empleado e : empleados) {
            if (e.getDepartamento().equalsIgnoreCase(departamento) && e.getSalario() > 5000) {
                resultado.add(e);
            }
        }   

        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("Ana Lopez", "Ventas", 4500.00));
        empleados.add(new Empleado("Carlos Perez", "Ventas", 6200.00));
        empleados.add(new Empleado("Maria Gomez", "Sistemas", 7800.00));
        empleados.add(new Empleado("Luis Ramirez", "Ventas", 5300.00));
        empleados.add(new Empleado("Sofia Ruiz", "Sistemas", 4900.00));
        empleados.add(new Empleado("Jorge Castillo", "Contabilidad", 5100.00));

        System.out.println("--- Todos los empleados ---");
        for (Empleado e : empleados) {
            System.out.println(e);
        }

        ArrayList<Empleado> filtrados = filtrarPorDepartamento(empleados, "Ventas");

        System.out.println("\n--- Empleados de Ventas con salario mayor a Q5,000 ---");
        for (Empleado e : filtrados) {
            System.out.println(e);
        }
    }
}
