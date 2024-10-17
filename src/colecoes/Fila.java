package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //offer e add adicionam elementos na fila
        //A diferença acontece no momento que a fila está cheia

        fila.add("Ana"); // Retorna false
        fila.offer("Bia"); // Lança uma exceção
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");

        //A diferença acontece no momento que a fila está vazia
        System.out.println(fila.peek()); // Retorna null se a fila estiver vazia
        System.out.println(fila.peek()); // Lança uma exceção se a fila estiver vazia
        System.out.println(fila.element());
        System.out.println(fila.element());


    }
}
