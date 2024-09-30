import java.util.HashSet;
import java.util.Set;

public class Conjunto {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("O tamanho é: " + conjunto.size());
        System.out.println("Foi apagado: " + conjunto.remove("Teste"));
        System.out.println("O tamanho é: " + conjunto.size());
        System.out.println("Contém o item: " + conjunto.contains('x'));

        Set numero = new HashSet();
        numero.add(1);
        numero.add(2);
        numero.add(3);

        System.out.println(numero);
        System.out.println(conjunto);

        conjunto.addAll(numero);
        System.out.println(conjunto);
    }
}
