package br.com.flavio.javaestudos.orientacaoobjetos.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[20];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {
        for (int episodios : this.episodios) {
            System.out.println(episodios);
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

