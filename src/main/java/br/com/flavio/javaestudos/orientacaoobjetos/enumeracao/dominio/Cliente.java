package br.com.flavio.javaestudos.orientacaoobjetos.enumeracao.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipodePagamento tipodePagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipodePagamento tipodePagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipodePagamento = tipodePagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoClienteint=" + tipoCliente.VALOR +
                ", tipodePagamento=" + tipodePagamento +
                '}';
    }
}
