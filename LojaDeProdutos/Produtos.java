package LojaDeProdutos;

public class Produtos {
    private int id;
    private String nome;
    private double valor;

    public Produtos(int id, String nome, double valor){
        this.id = id;
        this.valor = valor;
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
