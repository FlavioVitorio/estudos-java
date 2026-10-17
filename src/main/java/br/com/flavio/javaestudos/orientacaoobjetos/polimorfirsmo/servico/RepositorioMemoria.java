package br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.servico;

import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na Memoria");
    }
}
