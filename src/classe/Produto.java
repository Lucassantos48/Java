package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial, double precoInicial, double descontoFinal){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoFinal;

    }

    double ProdutoComDesconto(){
        return preco * (1 - desconto );
    }
}
