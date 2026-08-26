package br.com.flavio.javaestudos.orientacaoobjetos.associacao.testes;

import br.com.flavio.javaestudos.orientacaoobjetos.associacao.dominio.Jogador;
import br.com.flavio.javaestudos.orientacaoobjetos.associacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador=new Jogador("Romario");
        Time time=new Time("Flamengo");

        Jogador[] jogadores={jogador};
        jogador.setTime(time);
        time.setJogadors(jogadores);
        System.out.println("---Jogador----");
        jogador.imprime();
        System.out.println("---Time----");
        time.imprime();
    }
}
