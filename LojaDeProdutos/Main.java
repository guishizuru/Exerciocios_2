package LojaDeProdutos;


/*Modelagem de Loja Online (Avançado): Crie classes para representar produtos,
clientes e pedidos em uma loja online. Implemente métodos para adicionar produtos ao carrinho,
fazer um pedido e calcular o total.*/
public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        loja.adicionarProdutos(1,"bolacha",10.00);
        loja.adicionarProdutos(2,"arroz",12.00);
        loja.adicionarProdutos(3,"feijao",11.00);
        loja.adicionarProdutos(4,"alface",12.00);

        loja.escolherProdutoParaCompra();

    }
}
