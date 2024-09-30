package classe;

public class Equals {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();

        usuario1.nome = "Mario";
        usuario1.email = "Mario@gmail.com";

        Usuario usuario2 = new Usuario();

        usuario2.nome = "Mario";
        usuario2.email = "Mario@gmail.com";

        System.out.println(usuario1 == usuario2);
        System.out.println(usuario1.equals(usuario2));

    }
}
