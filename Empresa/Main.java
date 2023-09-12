package Empresa;

import Empresa.Empresa;

/*Classe Empresa.Pessoa e Associação: Crie uma classe Empresa.Pessoa que represente uma pessoa com
atributos como nome, idade e endereço. Em seguida, crie uma classe Empresa.Empresa que contenha
funcionários, onde cada funcionário é uma instância da classe Empresa.Pessoa. Estabeleça uma associação
entre as classes Empresa.Pessoa e Empresa.Empresa.*/
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.adicionarFuncionarios(1,"Roger",18,"123");
        empresa.adicionarFuncionarios(2,"lala",19,"123");
        empresa.adicionarFuncionarios(3,"pow",16,"123");
        empresa.adicionarFuncionarios(4,"ester",17,"123");

    }
}
