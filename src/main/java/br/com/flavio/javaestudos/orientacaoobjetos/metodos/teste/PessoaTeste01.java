package br.com.flavio.javaestudos.orientacaoobjetos.metodos.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.metodos.dominio.Pessoa;

public class PessoaTeste01 {
   public static void main(String[] args) {
        Pessoa pessoa=new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(34);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
