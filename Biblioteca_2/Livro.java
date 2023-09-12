package Biblioteca_2;


public class Livro {
    private String ano;
    private String autor;
    private String titulo;

    @Override
    public String toString() {
        return super.toString();
    }

    public Livro(String titulo, String autor, String ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAno() {
        return ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
}
