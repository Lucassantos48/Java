package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {

        //Informações do funcionario

        //tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long potosAcumulados = 3_234_845_223L;

        //tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //  tipo booleano
        boolean ferias = true;

        //tipo caracteres
        char status = 'A'; // 'A'TIVO

        System.out.println("O funcionario trabalha na empresa há: " + anosDeEmpresa * 365 + " dias");
        System.out.println(numeroDeVoos / 2);
        System.out.println(potosAcumulados / vendasAcumuladas);
        System.out.println(id + ": Salário, " + salario);
        System.out.println("Está de ferias: " + ferias);
        System.out.println("Status: " + status);
    }
}
