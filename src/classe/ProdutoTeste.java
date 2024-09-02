package classe;

public class ProdutoTeste {
    public static void main(String[] args) {


        Produto p1 = new Produto("Computador", 2500.89,0.25  );

        //p1.nome = "Computador";
        //p1.preco = 2500.89;
        //p1.desconto = 0.25;

        double precoFinal = p1.ProdutoComDesconto();

        System.out.println("Produto: " + p1.nome);
        System.out.println("Preço: " + p1.preco);
        System.out.println("Desconto: " + precoFinal);
    }
}
