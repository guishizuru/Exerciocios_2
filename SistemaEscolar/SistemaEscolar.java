package SistemaEscolar;

import java.util.ArrayList;
import java.util.List;

class SistemaEscolar {
    private List<Alunos> alunos;
    private List<SistemaEscolar> professores;
    private List<Disciplina> disciplinas;

    public SistemaEscolar() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        disciplinas = new ArrayList<>();
    }

    public void adicionarAluno(Alunos aluno) {
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professores professor) {
  //      professores.add(professor);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    // Outros métodos para gerenciar o sistema escolar
}