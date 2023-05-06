package pilha;

import arrays.ListaGenerics;

public class Pilha<T> extends ListaGenerics<T>{

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public Pilha() {
        super();
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

	public T topo(){
		
		if (this.estaVazia()){
			return null;
		} 
		
		return this.elementos[tamanho-1];
	}
	
	public T desempilha(){
		
		if (this.estaVazia()){
			return null;
		}		
		return this.elementos[--tamanho];
	}
}
