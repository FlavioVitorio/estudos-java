package br.com.flavio.javaestudos.orientacaoobjetos.classes.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.classes.dominio.Estudante;

public class EstudanteTest {
    static void main() {
        Estudante estudante=new Estudante();
        estudante.nome="vitor";
        estudante.idade=23;
        estudante.sexo='M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade+" anos");
        System.out.println(estudante.sexo);
    }
    }
