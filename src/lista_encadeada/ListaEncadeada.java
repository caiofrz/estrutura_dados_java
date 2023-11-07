package lista_encadeada;

import java.util.ArrayList;
import java.util.List;

public class ListaEncadeada<T> {

  private No<T> start;
  private No<T> lastNode;
  private int size = 0;

  public void adiciona(T element){
    No<T> node = new No<T>(element);

    if (this.size == 0){
      this.start = node;
    } else {
      this.lastNode.setNext(node);
    }
    this.lastNode = node;
    this.size++;
  }

  public void limpar(){

  }

  @Override
  public String toString() {
//    return "ListaEncadeada{" +
//            "start=" + start +
//            '}';
    if (this.size == 0) return "[]";
    No<T> current = this.start;
    List<T> lista = new ArrayList<>();

    for (int i = 0; i < this.size; i++) {
      lista.add(current.getVal());
      current = current.getNext();
    }
    return lista.toString();
  }
}
