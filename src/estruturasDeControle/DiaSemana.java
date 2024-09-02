package estruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String dia = entrada.next();

        if(dia.equalsIgnoreCase("domingo")){
            System.out.println("domingo: 0");
        }else if (dia.equalsIgnoreCase("segunda")){
            System.out.println("Segunda: 1");
        }else if (dia.equalsIgnoreCase("terça")){
            System.out.println("Terça-Feira: 2");
        }else if (dia.equalsIgnoreCase("Quarta")){
            System.out.println("Quarta-Feira: 3");
        }else if (dia.equalsIgnoreCase("Quinta")){
            System.out.println("Quinta-Feira: 4");
        }else if (dia.equalsIgnoreCase("Sexta")){
            System.out.println("Sexta-feira: 6");
        }else if (dia.equalsIgnoreCase("sabado")){
            System.out.println("Sábado: 7");
        } else{
            System.out.println("Dia inválido!");
        }


        entrada.close();
    }
}
