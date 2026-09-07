package br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio;

public class Pc extends Produto {
    public static final double IMPOSTO=0.15;
    public Pc(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto pc");
        return this.valor*IMPOSTO;
    }
}
