package lista_encadeada;

public class No<T> {

  private T val;
  private  No<T> next;

  public No(T element, No<T> next) {
    this.val= element;
    this.next = next;
  }

  public No(T element) {
    this.val = element;
    this.next = null;
  }

  @Override
  public String toString() {
    return "No{" +
            "element=" + val +
            ", next=" + next +
            '}';
  }

  public T getVal() {
    return val;
  }

  public void setVal(T val) {
    this.val = val;
  }

  public No<T> getNext() {
    return next;
  }

  public void setNext(No<T> next) {
    this.next = next;
  }



}
