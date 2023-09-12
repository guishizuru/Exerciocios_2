package LojaDeProdutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    List<Produtos> listaDeProdutos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adicionarProdutos(int id, String nome, double valor) {
        Produtos produtos = new Produtos(id, nome, valor);
        listaDeProdutos.add(produtos);
    }


    public void escolherProdutoParaCompra() {
        double armazenarValor = 0;
        for (int i = 0; i < listaDeProdutos.size(); i++) {

            System.out.println("Escolha qual produto deseja da lista :");
            String nome = scanner.next();

            System.out.println("Escolha a quantidade disponivel :");
            double quantidade = scanner.nextFloat();

            for (Produtos produtos : listaDeProdutos) {
                if (produtos.getNome().equals(nome)) {
                    double resultadaDaCompra = produtos.getValor() * quantidade;

                    armazenarValor += resultadaDaCompra;

                    System.out.println("Deseja escolher mais algum produto");
                    String resposta = scanner.next();

                    if (!resposta.equals("sim")) {

                        break;
                    }
                }
            }
            System.out.println("Resultado : " + armazenarValor);
            System.out.println("Deseja continuar comprando? (sim/não)");
            String respostaFinal = scanner.next();

            if (!respostaFinal.equals("sim")) {
                break;
            }
        }
    }
}

