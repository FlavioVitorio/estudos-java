package br.com.flavio.javaestudos.orientacaoobjetos.metodos.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.metodos.dominio.Estudante;

public class EstudanteTeste02 {
    static void main() {
        Estudante estudante=new Estudante();
        Estudante estudante02 = new Estudante();

        estudante.nome = "joão";
        estudante.idade = 25;
        estudante.sexo = 'M';

        estudante02.nome = "maria";
        estudante02.idade = 27;
        estudante02.sexo = 'F';

        estudante.imprime();
        estudante02.imprime();
    }
}
