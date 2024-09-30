package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notas = new double[3];

        notas[0] = 7.9;
        notas[1] = 8;
        notas[2] = 9;

        System.out.println(Arrays.toString(notas));

        double total = 0;
        for(int i = 0; i < notas.length ; i++) {
            total += notas[i];
        }
        System.out.println(total / notas.length);
    }
}
