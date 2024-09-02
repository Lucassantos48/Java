package fundamentos;

public class Temperatura {
    public static void main(String[] args) {

        double fahrenheit = 86;
        final int valor = 32;
        double calculo = (fahrenheit - valor) * 5 / 9;
        double temp = calculo;

        System.out.println(fahrenheit + " fahrenheit, são: " + temp +"°C");

    }
}
