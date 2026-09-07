package br.com.flavio.javaestudos.orientacaoobjetos.classesabstratas.testes;

import br.com.flavio.javaestudos.orientacaoobjetos.classesabstratas.dominio.Desenvolvedor;
import br.com.flavio.javaestudos.orientacaoobjetos.classesabstratas.dominio.Funcionario;
import br.com.flavio.javaestudos.orientacaoobjetos.classesabstratas.dominio.Gerente;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente=new Gerente("Zeus",10000);
        Desenvolvedor desenvolvedor=new Desenvolvedor("Zorin",13000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
