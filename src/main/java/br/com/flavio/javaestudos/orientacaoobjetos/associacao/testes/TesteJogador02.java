package br.com.flavio.javaestudos.orientacaoobjetos.associacao.testes;

import br.com.flavio.javaestudos.orientacaoobjetos.associacao.dominio.Jogador;
import br.com.flavio.javaestudos.orientacaoobjetos.associacao.dominio.Time;

public class TesteJogador02 {
    static void main() {
        Jogador jogador01=new Jogador("Ronaldo");
        Time time=new Time("Vasco");

        jogador01.setTime(time);

        jogador01.imprime();
    }
}
