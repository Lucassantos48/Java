package colecoes;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoOrganizado {
    public static void main(String[] args) {

        Set<String> lista = new HashSet<>();
        lista.add("Ana");
        lista.add("Lucas");
        lista.add("João");
        lista.add("Maria");

        for (String nomes: lista){
            System.out.println(nomes);
        }


    }
}
