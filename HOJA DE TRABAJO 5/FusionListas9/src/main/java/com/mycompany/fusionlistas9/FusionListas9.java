

package com.mycompany.fusionlistas9;

import java.util.ArrayList;

public class FusionListas9 {

    public static ArrayList<Integer> combinarListasOrdenadas(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> resultado = new ArrayList<>();

        int i = 0; // puntero para lista1
        int j = 0; // puntero para lista2

        // Mientras ambas listas tengan elementos por comparar
        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) <= lista2.get(j)) {
                resultado.add(lista1.get(i));
                i++;
            } else {
                resultado.add(lista2.get(j));
                j++;
            }
        }

        // Si a lista1 le quedaron elementos, se agregan todos (ya están ordenados)
        while (i < lista1.size()) {
            resultado.add(lista1.get(i));
            i++;
        }

        // Si a lista2 le quedaron elementos, se agregan todos (ya están ordenados)
        while (j < lista2.size()) {
            resultado.add(lista2.get(j));
            j++;
        }

        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(2);
        lista1.add(5);
        lista1.add(8);
        lista1.add(12);
        lista1.add(20);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(3);
        lista2.add(9);
        lista2.add(10);
        lista2.add(15);
        lista2.add(25);

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);

        ArrayList<Integer> combinada = combinarListasOrdenadas(lista1, lista2);

        System.out.println("Lista combinada: " + combinada);
    }
}
