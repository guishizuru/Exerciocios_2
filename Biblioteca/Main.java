package Biblioteca;

import Biblioteca.Biblioteca;

public class Main {/*Crie uma classe Biblioteca.Livro com os seguintes atributos:
    Título
    Autor
    Ano de publicação
    Disponibilidade (um atributo booleano que indica se o livro está disponível para empréstimo)
    Crie uma classe Biblioteca.Biblioteca com os seguintes atributos:
    Nome da biblioteca
    Lista de livros (uma lista de objetos Biblioteca.Livro)
    Crie métodos para:
    Adicionar um livro à biblioteca.
    Realizar um empréstimo (marcar o livro como indisponível).
    Devolver um livro (marcar o livro como disponível).
    Exibir a lista de livros disponíveis na biblioteca.*/


    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();


        biblioteca.adicionarLivroALista("genios","Roger","2016",2);
        biblioteca.adicionarLivroALista("codigo limpo","jorge machado","2009",3);
        biblioteca.adicionarLivroALista("nescau", "juju salame","1560", 3);

        biblioteca.verificaLivroDisponivel("codigo limpo");
        biblioteca.realizarEmprestimo("codigo limpo",1);
        biblioteca.devolverLivroEmprestado("codigo limpo", 2);

        biblioteca.listaAtualizada();


    }
}