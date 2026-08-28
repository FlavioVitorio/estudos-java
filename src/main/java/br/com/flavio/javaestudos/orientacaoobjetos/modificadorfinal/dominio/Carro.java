package br.com.flavio.javaestudos.orientacaoobjetos.modificadorfinal.dominio;

public final class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 300;
    public static final Comprador COMPRADOR=new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
