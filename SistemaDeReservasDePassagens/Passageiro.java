package SistemaDeReservasDePassagens;

public class Passageiro {
    private String nome;
    private int identificador;


    public Passageiro(String nome, int identificador){
        this.identificador = identificador;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
