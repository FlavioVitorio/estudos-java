package br.com.flavio.javaestudos.orientacaoobjetos.modificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("------------------");
        episodios = new int[5];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }


    public Anime() {
        for (int episodios : episodios) {
            System.out.println(episodios);
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

