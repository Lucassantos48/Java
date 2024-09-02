package estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeNotas = 0;
        double notaAtual = 0;
        double totalNotas = 0;


        while ( notaAtual != -1){
            System.out.println("Informe a nota (ou -1 para sair): ");
            notaAtual = entrada.nextDouble();

            if(notaAtual >= 0 && notaAtual <= 10 ){
                totalNotas += notaAtual;
                quantidadeNotas ++;

            } else if (notaAtual != -1) {
                System.out.println("Nota inválida!");
            }
        }

        double media = totalNotas / quantidadeNotas;
        System.out.println("A média é: " + media);
        entrada.close();
    }
}
