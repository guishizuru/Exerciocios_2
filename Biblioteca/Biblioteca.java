package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> listaDeLivro = new ArrayList<>();

    public void adicionarLivroALista(String titulo, String autor, String ano, int quantidade){
        Livro livro = new Livro(titulo,autor,ano, quantidade);
        listaDeLivro.add(livro);
    }
    public void verificaLivroDisponivel(String nomeDoLivro){

        for (Livro livro : listaDeLivro) {
            if (nomeDoLivro.equals(livro.getTitulo())) {
                if (livro.getQuantidade() > 0) {
                    System.out.println( livro.getTitulo() + " está disponivel");
                    //   livroDispovel = true;
                } else {
                    System.out.println("indisponivel");
                }
            }
        }
    }
    public void realizarEmprestimo(String nomeDoLivro, int valoremprestado){
        for (Livro livro: listaDeLivro) {
            if(nomeDoLivro.equals(livro.getTitulo())){
                if(livro.getQuantidade() > 0){
                    livro.setQuantidade( livro.getQuantidade() - valoremprestado);
                    System.out.println("O livro " + livro.getTitulo()  + " foi emprestado, ainda restam :" + livro.getQuantidade());
                }else {
                    System.out.println("Infelizmente ja emprestamos todos os livros.");
                }
            }
        }
    }public void devolverLivroEmprestado(String nomeDoLivro, int quantidadeDeLivrosParaDevolver){
        for(Livro livro : listaDeLivro){
            if(nomeDoLivro.equals(livro.getTitulo())){
                if(livro.getQuantidade() >= 0){
                    livro.setQuantidade( livro.getQuantidade() + quantidadeDeLivrosParaDevolver);
                    System.out.println("Você devolveu : " + quantidadeDeLivrosParaDevolver  +
                            " livros," + "do" + livro.getTitulo() + " quantidade de livros disponiveis é " + livro.getQuantidade());
                }else {
                    System.out.println("Infelizmente nao temos livros disponiveis ! ");
                }
            }
        }
    }public void listaAtualizada(){
        int contador =1;
        System.out.println("LISTA ATUALIZADA :");
        for (Livro livro: listaDeLivro) {
            System.out.println(" LIVRO " + contador + " - " +
                    livro.getTitulo() + " quantidade " + livro.getQuantidade());

             contador ++;
        }
    }


}
