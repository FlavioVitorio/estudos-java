package br.com.flavio.javaestudos.orientacaoobjetos.heranca.testes;

import br.com.flavio.javaestudos.orientacaoobjetos.heranca.dominio.Endereco;
import br.com.flavio.javaestudos.orientacaoobjetos.heranca.dominio.Funcionario;
import br.com.flavio.javaestudos.orientacaoobjetos.heranca.dominio.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Endereco endereco=new Endereco();
        endereco.setRua("rua 23");
        endereco.setCep("46466-342");
        Pessoa pessoa=new Pessoa("luizin");
        pessoa.setEndereco(endereco);

        pessoa.setCpf("123.456.789-32");
        pessoa.imprime();

        Funcionario funcionario=new Funcionario("Goku");


        funcionario.setCpf("123.456.789-32");

        funcionario.setSalario(5000.5);

        funcionario.setEndereco(endereco);

        funcionario.imprime();
    }
}
