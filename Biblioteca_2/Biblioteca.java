package Biblioteca_2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> listaDeLivros = new ArrayList<>();


    public void adicionarLivros(String ano,String autor, String titulo){
        Livro livro = new Livro(ano, autor, titulo);
        listaDeLivros.add(livro);
    }
    public void removerLivro(String titulo){
        Livro livroParaRemover = null;
        for (Livro livro : listaDeLivros) {
            if (livro.getTitulo().equals(titulo)) {
                livroParaRemover = livro;
                break;
            }
        }

            if (livroParaRemover != null) {
                listaDeLivros.remove(livroParaRemover);
                System.out.println("Livro removido, com sucesso");
            } else {
                System.out.println("Livro nao encontrado " + titulo);
            }

    }
    public void listarLivros(){
        for(Livro livro : listaDeLivros){
            System.out.println("Livro :"  +  " titulo - " + livro.getTitulo() + " ano - " + livro.getAno() + " autor - " + livro.getAutor());
        }
    }
}
