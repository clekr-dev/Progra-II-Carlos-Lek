
package com.mycompany.historialdebusqueda;

import java.util.ArrayList;

public class HistorialNavegacion {
    private static final int LIMITE = 10;
    private final ArrayList<String> historial;

    public HistorialNavegacion() {
        this.historial = new ArrayList<>();
    }

    // Añade una URL al historial; si supera el límite, elimina la más antigua
    public void visitarPagina(String url) {
        historial.add(url);

        if (historial.size() > LIMITE) {
            historial.remove(0);
        }
    }

    // Devuelve el historial completo
    public ArrayList<String> getHistorial() {
        return historial;
    }

    // Muestra el historial en consola
    public void mostrarHistorial() {
        System.out.println("--- Historial de navegacion (" + historial.size() + " paginas) ---");
        for (int i = 0; i < historial.size(); i++) {
            System.out.println((i + 1) + ". " + historial.get(i));
        }
    }
}