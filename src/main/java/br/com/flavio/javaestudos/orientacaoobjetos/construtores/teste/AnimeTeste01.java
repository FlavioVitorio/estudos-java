package br.com.flavio.javaestudos.orientacaoobjetos.construtores.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.construtores.dominio.Anime;

public class AnimeTeste01 {
   public static void main(String[] args) {
        Anime anime = new Anime("shonnen", 1100, "one piece","açao","mappa");
        anime.imprime();
    }
}
