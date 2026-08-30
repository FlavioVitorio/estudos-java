package br.com.flavio.javaestudos.orientacaoobjetos.modificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 300;
    public static final Comprador COMPRADOR=new Comprador();

    public String getNome() {
        return nome;
    }
    public final void imprime(){
        System.out.println(this.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
