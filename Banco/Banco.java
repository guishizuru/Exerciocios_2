package Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    List<Titular> listaDeTitulares = new ArrayList<>();


    public void adicionarTitular(String numeroDaConta,String nomeDoTitular,float saldoDaConta, float chequeEspecial){
        Titular titular = new Titular(numeroDaConta,nomeDoTitular,saldoDaConta,chequeEspecial);
        listaDeTitulares.add(titular);
    }

    public void sacarQuantiaDaConta(String numeroDaConta, float valorDeSaque){
        for (Titular titular:listaDeTitulares) {
            if (titular.getNumeroDaConta().equals(numeroDaConta)) {
                if(titular.getSaldoDaConta() > 0) {
                    titular.setSaldoDaConta(titular.getSaldoDaConta() - valorDeSaque);
                    System.out.println( "saldo : " + titular.getSaldoDaConta());
                }else {
                    System.out.println("Saldo indisponivel !");
                }
            }
        }
    }
    public void sacarComChequeEspecial (String numeroDaConta, float valorDeSaque) {
        for (Titular titular : listaDeTitulares) {

            if (titular.getNumeroDaConta().equals(numeroDaConta)) {
                float saldoAtual = titular.getSaldoDaConta();
                float chequeEspecial = titular.getChequeEspecial();

                if (saldoAtual >= valorDeSaque) {
                    // Se o saldo atual for suficiente, faça o saque normalmente
                    saldoAtual -= valorDeSaque;
                } else if (saldoAtual + chequeEspecial >= valorDeSaque) {
                    // Se o saldo + cheque especial for suficiente, use o cheque especial
                    chequeEspecial -= (valorDeSaque - saldoAtual);
                    saldoAtual = 0;
                } else {
                    // Não há saldo nem cheque especial suficientes para o saque
                    System.out.println("Saldo insuficiente para o saque.");
                    return; // Sair do método
                }
                titular.setSaldoDaConta(saldoAtual);
                titular.setChequeEspecial(chequeEspecial);

                System.out.println("Saque realizado. Novo saldo: " + saldoAtual +
                        " Cheque especial sendo utilizado restam : " + chequeEspecial);

            }
        }

    }

}
