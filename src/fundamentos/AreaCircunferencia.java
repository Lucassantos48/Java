package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {

        double raio = 3.4;
        final double pi = 3.14159; // isso torna o valor da variavel imutavel
        double resultado = (pi * raio) * raio;

        System.out.println("O valor é: " + resultado );

    }
}
