package teste;

import fila.Fila;

public class FilaTeste {
    public static void main(String[] args) {
        
        Fila<Integer> fila = new Fila<>();

        fila.adiciona(1);
        fila.adiciona(2);
        fila.adiciona(3);

        System.out.println(fila);
        System.out.println(fila.estaVazia());
        System.out.println(fila.desenfileira());
        System.out.println(fila);
        
    }
}
