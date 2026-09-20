

package com.mycompany.historialdebusqueda;

/**
 *
 * @author Dell Latitude 5310
 */
public class HistorialDeBusqueda {

    public static void main(String[] args) {
        HistorialNavegacion historial = new HistorialNavegacion();

        historial.visitarPagina("www.google.com");
        historial.visitarPagina("www.wikipedia.org");
        historial.visitarPagina("www.youtube.com");
        historial.visitarPagina("www.github.com");
        historial.visitarPagina("www.stackoverflow.com");
        historial.visitarPagina("www.amazon.com");
        historial.visitarPagina("www.netflix.com");
        historial.visitarPagina("www.twitter.com");
        historial.visitarPagina("www.linkedin.com");
        historial.visitarPagina("www.instagram.com");

        System.out.println("Despues de visitar 10 paginas:");
        historial.mostrarHistorial();

        historial.visitarPagina("www.reddit.com");

        System.out.println("\nDespues de visitar una 11 pagina (debe eliminarse google.com):");
        historial.mostrarHistorial();
    }
}