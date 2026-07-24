package br.com.flavio.javaestudos.orientacaoobjetos.metodos.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.metodos.dominio.Estudante;
import br.com.flavio.javaestudos.orientacaoobjetos.metodos.dominio.ImpressoraEstudante;

public class EstudanteTeste {
    static void main() {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante imprimir=new ImpressoraEstudante();

        estudante.nome = "joão";
        estudante.idade = 25;
        estudante.sexo = 'M';

        estudante02.nome = "maria";
        estudante02.idade = 27;
        estudante02.sexo = 'F';

        imprimir.imprime(estudante);
        imprimir.imprime(estudante02);

    }
}
