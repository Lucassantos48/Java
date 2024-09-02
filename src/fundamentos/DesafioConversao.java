package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro sálrio: ");
        String valor1 = entrada.next().replace(",", ".");

        System.out.println("Digite o segundo sálrio: ");
        String valor2 = entrada.next().replace(",", ".");

        System.out.println("Digite o terceiro sálrio: ");
        String valor3 = entrada.next().replace(",", ".");

        Double salalario1 = Double.parseDouble(valor1);
        Double salalario2 = Double.parseDouble(valor2);
        Double salalario3 = Double.parseDouble(valor3);
        Double media = (salalario1 + salalario2 + salalario3) / 3;

        System.out.println("A média dos sálarios é: " + media);


        entrada.close();

    }
}
