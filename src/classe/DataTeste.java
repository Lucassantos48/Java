package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data data = new Data();
        data.ano = 2021;

        var data2 = new Data(2,9,2024);

        String dataFormatada = data.obterDataFormatada();

        System.out.println(dataFormatada);
        System.out.println(data2.obterDataFormatada());

        data.imprimirDataFormatada();
        data2.imprimirDataFormatada();


    }
}
