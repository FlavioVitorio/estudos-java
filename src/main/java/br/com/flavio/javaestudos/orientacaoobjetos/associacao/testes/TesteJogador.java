package br.com.flavio.javaestudos.orientacaoobjetos.associacao.testes;

import br.com.flavio.javaestudos.orientacaoobjetos.associacao.dominio.Jogador;

public class TesteJogador {
    public static void main(String[] args) {
        Jogador jogador01=new Jogador("Ronaldo");
        Jogador jogador02=new Jogador("Romario");
        Jogador jogador03=new Jogador("O Bruxo");
        Jogador[] jogadores={jogador01,jogador02,jogador03};
        for (Jogador logador : jogadores) {
            logador.imprime();
        }


    }

}
