package colecoes;

import java.util.*;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuario = new HashMap<>();

        usuario.put(1, "Lucas");
        usuario.put(2, "Julia");
        usuario.put(3, "Ricardo");
        usuario.put(4, "Larissa");

        System.out.println(usuario.size());
        System.out.println(usuario.isEmpty());
        System.out.println(usuario.keySet());
        System.out.println(usuario.values());
        System.out.println(usuario.entrySet());

        for(int chaves: usuario.keySet()){
            System.out.println(chaves);
        }

        for(String valor: usuario.values()){
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuario.entrySet()){
            System.out.println(registro);
        }
    }
}
