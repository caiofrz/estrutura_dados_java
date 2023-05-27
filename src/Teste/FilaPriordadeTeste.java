package teste;

import fila.FilaPrioridade;

public class FilaPriordadeTeste {
    public static void main(String[] args) {
		FilaPrioridade<Paciente> fila = new FilaPrioridade<>();
		
		fila.enfileira(new Paciente("A", 2));
		fila.enfileira(new Paciente("C", 1));
		fila.enfileira(new Paciente("B", 3));

		System.out.println(fila); 
		System.out.println(fila.desenfileira());
		System.out.println(fila);
    }
}
