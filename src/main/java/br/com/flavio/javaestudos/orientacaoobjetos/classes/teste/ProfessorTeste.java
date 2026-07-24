package br.com.flavio.javaestudos.orientacaoobjetos.classes.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.classes.dominio.Professor;

public class ProfessorTeste {
    static void main() {
        Professor professor = new Professor();
        professor.nome = "gojo";
        professor.idade = 24;
        professor.sexo = 'M';
        System.out.println(professor.idade + " anos-> " + professor.nome + "-> " + professor.sexo);
    }
}
