package br.com.flavio.javaestudos.orientacaoobjetos.associacao.testes;

import br.com.flavio.javaestudos.orientacaoobjetos.associacao.dominio.*;

public class ProejetoSeminario {
    public static void main(String[] args) {
        Local local = new Local("Goinia");

        Aluno aluno = new Aluno("joao",19);

        Aluno aluno02 = new Aluno("carlos", 20);

        Professor01 professor = new Professor01("kakashi", "shunin");

        Aluno[] alunos = {aluno, aluno02};

        Seminario seminario = new Seminario("Abilidades de chackra", alunos, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
