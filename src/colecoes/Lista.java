package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

       ArrayList<Usuario> lista = new ArrayList<>();

       Usuario usuario = new Usuario("Lucas");

       lista.add(usuario);
       lista.add(new Usuario("Marcos"));
       lista.add(new Usuario("Luana"));
       lista.add(new Usuario("Luan"));
       lista.add(new Usuario("Bruno"));
       lista.add(new Usuario("Marcio"));

       for (Usuario nomes: lista){
           System.out.println(nomes.toString());
       }




    }
}
