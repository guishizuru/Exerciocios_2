package SistemaEscolar;
/*Modelagem de Sistema Escolar (Avançado): Crie classes para representar alunos, professores,
disciplinas e um sistema escolar. Implemente métodos para matricular alunos em disciplinas,
lançar notas e calcular médias.*/
public class Main {
    public static void main(String[] args) {
        SistemaEscolar sistema = new SistemaEscolar();

        // Criar alunos, professores e disciplinas
        Alunos aluno1 = new Alunos("João", 16, "A123");
        Alunos aluno2 = new Alunos("Maria", 17, "B456");
 //       Professores professor1 = new Professores("Prof. Silva", "Matemática");
        Disciplina matematica = new Disciplina("Matemática");

        // Adicionar alunos, professores e disciplinas ao sistema
        sistema.adicionarAluno(aluno1);
        sistema.adicionarAluno(aluno2);
//       sistema.adicionarProfessor(professor1);
        sistema.adicionarDisciplina(matematica);

        // Matricular alunos em disciplinas
        aluno1.matricularEmDisciplina(matematica);
         aluno2.matricularEmDisciplina(matematica);

            // Lançar notas
        aluno1.lancarNota(matematica, 7.5);
        aluno1.lancarNota(matematica, 8.0);
        aluno2.lancarNota(matematica, 9.0);

            // Calcular médias
        double mediaAluno1 = aluno1.calcularMedia(matematica);
        double mediaAluno2 = aluno2.calcularMedia(matematica);

        System.out.println("Média de " + aluno1.getNome() + " em Matemática: " + mediaAluno1);
        System.out.println("Média de " + aluno2.getNome() + " em Matemática: " + mediaAluno2);
        }
    }
