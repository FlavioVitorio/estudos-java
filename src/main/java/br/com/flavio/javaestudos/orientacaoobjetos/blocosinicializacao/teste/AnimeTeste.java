package br.com.flavio.javaestudos.orientacaoobjetos.blocosinicializacao.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.blocosinicializacao.dominio.Anime;

public class AnimeTeste {
   public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio);
        }
    }
}
