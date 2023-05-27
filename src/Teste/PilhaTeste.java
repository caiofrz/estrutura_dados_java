package teste;

import pilha.Pilha;

public class PilhaTeste {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.adiciona(1);
        pilha.adiciona(2);
        pilha.adiciona(3);

        System.out.println(pilha);
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.desempilha());
        System.out.println(pilha);
        
    }
}
