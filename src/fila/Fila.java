package fila;

import arrays.ListaGenerics;

public class Fila<T> extends ListaGenerics<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        this.adiciona(elemento);
    }

    public T espiar() {
        if (this.estaVazia()) {return null;}
        return this.elementos[0];
    }

    public T desenfileira() {
        if (this.estaVazia()) {return null;}

        T elementoASerRemovido = this.elementos[0];
        this.remove(0);
        return elementoASerRemovido;
    }
}
