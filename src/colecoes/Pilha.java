package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        // Firt in - last out
        livros.add("Livro 1");
        livros.push("Livro 2");
        livros.push("Livro 3");

        System.out.println(livros.peek());
        System.out.println(livros.size());
        System.out.println(livros.isEmpty());


    }
}
