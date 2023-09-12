package Empresa;

public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa (int id,String nome, int idade,String endereco){
        this.nome = nome;
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
