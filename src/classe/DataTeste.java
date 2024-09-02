package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data data = new Data();

        Data data2 = new Data(2,9,2024);


        String dataFormatada = data.obterDataFormatada();
        String dataFormatada2 = data2.obterDataFormatada();

        System.out.println(dataFormatada);
        System.out.println(dataFormatada2);


    }
}
