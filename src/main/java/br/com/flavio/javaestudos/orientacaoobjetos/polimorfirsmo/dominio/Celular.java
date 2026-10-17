package br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio;

public class Celular extends Produto{
    public static final double IMPOSTO=0.20;
    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto do celular");
        return this.valor*IMPOSTO;
    }
}
