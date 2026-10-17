package br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.testes;

import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.repositorio.Repositorio;
import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.servico.RepositorioBancoDados;

public class RepositorioTeste {
    public static void main(String[] args) {
    Repositorio repositorio =new RepositorioBancoDados();
    repositorio.salvar();

    }
}
