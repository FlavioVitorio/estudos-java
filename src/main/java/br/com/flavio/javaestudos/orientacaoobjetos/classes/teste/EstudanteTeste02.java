package br.com.flavio.javaestudos.orientacaoobjetos.classes.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.classes.dominio.Estudante;

public class EstudanteTeste02 {
    static void main() {
        Estudante estudante=new Estudante();
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
