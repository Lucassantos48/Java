package colecoes;

import java.util.HashMap;
import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Lucas"));
        usuarios.add(new Usuario("Carlos"));
        usuarios.add(new Usuario("João"));
        usuarios.add(new Usuario("Maria"));

        System.out.println(usuarios.contains(new Usuario("Maria")));

    }
}
