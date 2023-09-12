package Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private String ano;
    private int quantidade;

    public Livro(String titulo, String autor, String ano, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.quantidade = quantidade;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
