package LojaDeProdutos;

public class Clientes {
    private String nomeCliente;

    public Clientes(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public void setNome(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNome() {
        return nomeCliente;
    }
}
