package Biblioteca_2;

public class Autor {
    private String nome;
    private String ano;

    @Override
    public String toString() {
        return super.toString();
    }

    public Autor(String nome, String ano){
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
