package br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.servico;

import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio.Alface;
import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio.Pc;
import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio.Produto;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Impostos");
        double imposto = produto.calcularImposto();
        System.out.println("Produto :"+produto.getNome());
        System.out.println("Produto :"+produto.getValor());
        System.out.println("imposto a ser pago:"+imposto);

        if (produto instanceof Alface){
        System.out.println("Data de validade:"+((Alface)produto).getDataValidade());}
    }
}
