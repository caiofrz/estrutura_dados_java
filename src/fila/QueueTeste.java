package fila;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTeste {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>(); 

        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println(fila);
        System.out.println(fila.isEmpty());
        System.out.println(fila.size());
        System.out.println(fila.peek());
        System.out.println(fila.remove());
        System.out.println(fila);
    }
}
