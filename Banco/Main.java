package Banco;
/*Crie uma classe ContaBancaria com os seguintes atributos:

        Número da conta
        Nome do titular
        Saldo
        Crie métodos para:

        Depositar uma quantia na conta.
        Sacar uma quantia da conta (verificando se há saldo suficiente).
        Exibir o saldo atual.*/
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.adicionarTitular("123","Roger Guedes",100,1000);
        banco.adicionarTitular("456","Lucas Lucco",1100,1000);
        banco.adicionarTitular("678","Luan Botelho",1400,1000);

      //  banco.sacarQuantiaDaConta("123",100);
        banco.sacarComChequeEspecial("123",200);

    }
}
