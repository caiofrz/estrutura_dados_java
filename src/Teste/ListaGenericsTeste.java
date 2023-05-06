package Teste;

import arrays.ListaGenerics;

public class ListaGenericsTeste {
    public static void main(String[] args) {
        ListaGenerics<Integer> lista = new ListaGenerics<>(5);
        // lista.adiciona("string1");
        lista.adiciona(1);
    }
}
