package br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.servico;

import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.repositorio.Repositorio;

public class RepositorioBancoDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando Banco de Dados");
    }
}
