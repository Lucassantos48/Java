package classe;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.500);
        Comida c2 = new Comida("Feijão", 0.400);

        Pessoa p1 = new Pessoa("Lucas", 99.56);

        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());
        p1.comer(c2);
        System.out.println(p1.apresentar());




    }
}
