package Banco;

public class Titular {
    private String numeroDaConta;
    private String nomeDoTitular;
    private float saldoDaConta;
    private float chequeEspecial;


    public Titular(String numeroDaConta, String nomeDoTitular, float saldoDaConta, float chequeEspecial){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldoDaConta = saldoDaConta;
        this.chequeEspecial = chequeEspecial;
    }

    public float getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldoDaConta(float saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
