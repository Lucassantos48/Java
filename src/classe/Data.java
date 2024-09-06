package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    Data(){
        this(1,1,1970); // Somente em construtores
    }

    String obterDataFormatada(){
        final String formato = "%d/%d/%d";
        return String.format(formato, dia, mes, ano);
    }

    void imprimirDataFormatada(){
        System.out.println(this.obterDataFormatada());
    }
}
