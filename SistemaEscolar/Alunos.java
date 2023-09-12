package SistemaEscolar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Alunos {
    private String nome;
    private int idade;
    private String matricula;
    private Map<Disciplina, List<Double>> notas;

    public Alunos(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.notas = new HashMap<>();
    }

    public void matricularEmDisciplina(Disciplina disciplina) {
        notas.put(disciplina, new ArrayList<>());
    }

    public void lancarNota(Disciplina disciplina, double nota) {
        if (notas.containsKey(disciplina)) {
            notas.get(disciplina).add(nota);
        }
    }


    public double calcularMedia(Disciplina disciplina) {
        if (notas.containsKey(disciplina)) {
            List<Double> notasDaDisciplina = notas.get(disciplina);
            if (!notasDaDisciplina.isEmpty()) {
                double soma = 0;
                for (double nota : notasDaDisciplina) {
                    soma += nota;
                }
                return soma / notasDaDisciplina.size();
            }
        }
        return 0; // Retorna 0 se não houver notas ou a disciplina não existir
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

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Map<Disciplina, List<Double>> getNotas() {
        return notas;
    }

    public void setNotas(Map<Disciplina, List<Double>> notas) {
        this.notas = notas;
    }

    public String getMatricula() {
        return matricula;
    }
// Getters e setters para outros atributos
}