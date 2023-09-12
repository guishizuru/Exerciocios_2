package Empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
   private Pessoa nome;
   private Pessoa idade;
   private Pessoa endereco;

    List<Pessoa> funcionarios = new ArrayList<>();

    public void adicionarFuncionarios(int id, String nome, int idade ,String endereco){
        Pessoa pessoa = new Pessoa(id,nome,idade,endereco);
        funcionarios.add(pessoa);
        System.out.println("Funcionario adicionado :" + pessoa.getId() + "" + pessoa.getNome() + " " + pessoa.getIdade() + " " + pessoa.getEndereco());
    }
}