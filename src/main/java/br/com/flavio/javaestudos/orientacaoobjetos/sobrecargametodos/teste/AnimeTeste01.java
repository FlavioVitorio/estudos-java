package br.com.flavio.javaestudos.orientacaoobjetos.sobrecargametodos.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.sobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
   public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("shonnen", 1100, "one piece","açao");
        anime.imprime();
    }
}
