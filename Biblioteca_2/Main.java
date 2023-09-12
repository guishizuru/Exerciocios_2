package Biblioteca_2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivros("1989","robert jusaf","além da vida");
        biblioteca.adicionarLivros("1943","robert jusaf","a sorte do além");
        biblioteca.adicionarLivros("1979","robert jusaf","além dada");

        biblioteca.removerLivro("além da vida");
        biblioteca.listarLivros();

    }
}
