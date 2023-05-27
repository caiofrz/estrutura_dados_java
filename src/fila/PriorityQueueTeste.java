package fila;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import teste.Paciente;

public class PriorityQueueTeste {
    public static void main(String[] args) {
        
        Queue<Paciente> filaComPrioridade = new PriorityQueue<>(
            // new Comparator<Paciente>() {
            //     @Override
            //     public int compare(Paciente paciente1, Paciente paciente2) {
            //         return Integer.valueOf(paciente1.getPrioridade()).compareTo(paciente2.getPrioridade());
            //     }
            // }
        );
    
        filaComPrioridade.add(new Paciente("A", 2));
        filaComPrioridade.add(new Paciente("B", 1));
    
        System.out.println(filaComPrioridade);
    }
}
