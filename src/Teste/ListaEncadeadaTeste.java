package teste;

import lista_encadeada.ListaEncadeada;

public class ListaEncadeadaTeste {
  public static void main(String[] args) {
    ListaEncadeada<Integer> lista = new ListaEncadeada<>();

    lista.adiciona(1);
    lista.adiciona(2);
    lista.adiciona(4);
    lista.adiciona(3);
    System.out.println(lista.toString());
  }
}
