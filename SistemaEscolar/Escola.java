package SistemaEscolar;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    List<Alunos> listaDeAlunos = new ArrayList<>();
    List<Disciplina> listaDisciplinas = new ArrayList<>();
//    Map<Alunos, Disciplina> mapaIdades = new HashMap<>();


    public void adicionarAluno(String nome, int idade, String anoDaEscola, Disciplina disciplina){
        Alunos alunos = new Alunos(nome,idade,anoDaEscola);
        listaDeAlunos.add(alunos);
    }

    public Disciplina adicionarDisciplinas(String materia){
        Disciplina  disciplina = new Disciplina(materia);
        listaDisciplinas.add(disciplina);
        return disciplina;
    }

    public void Disciplinas(){}



}
