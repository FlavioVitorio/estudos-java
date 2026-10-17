package br.com.flavio.javaestudos.orientacaoobjetos.exception.exception.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.exception.exception.dominio.Funcionario;
import br.com.flavio.javaestudos.orientacaoobjetos.exception.exception.dominio.Pessoa;

public class SobreEscritaComExcepitionTeste {
    public static void main(String[] args) {

        Pessoa pessoa=new Pessoa();
        Funcionario funcionario=new Funcionario();
        funcionario.salvar();
    }
}
