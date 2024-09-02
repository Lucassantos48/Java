package estruturasDeControle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String valor = "";

        do {
            System.out.println("Acerte as palavras: ");
            System.out.println("Quer Sair: ");
            valor = entrada.nextLine();
        } while (!valor.equalsIgnoreCase("sair"));

        System.out.println("Obrigado!");
        entrada.close();
    }
}
