package br.com.flavio.javaestudos.orientacaoobjetos.enumeracao.testes;

import br.com.flavio.javaestudos.orientacaoobjetos.enumeracao.dominio.Cliente;
import br.com.flavio.javaestudos.orientacaoobjetos.enumeracao.dominio.TipoCliente;
import br.com.flavio.javaestudos.orientacaoobjetos.enumeracao.dominio.TipodePagamento;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente=new Cliente("Minato",TipoCliente.PESSOA_JURIDICA,TipodePagamento.CREDITO);
        Cliente cliente2=new Cliente("Naruto",TipoCliente.PESSOA_FISICA,TipodePagamento.DEBITO);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipodePagamento.CREDITO.calcularDesconto(100));

    }
}
