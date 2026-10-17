package br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio;

public class Alface extends Produto{
    public static final double IMPOSTO=0.02;
    private String dataValidade;
    public Alface(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto da alface");
        return this.valor*IMPOSTO;

    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
