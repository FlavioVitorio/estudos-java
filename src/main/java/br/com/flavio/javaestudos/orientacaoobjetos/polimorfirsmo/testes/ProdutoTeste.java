package br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.testes;

import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio.Alface;
import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio.Celular;
import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio.Pc;
import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.servico.CalculadoraImposto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Pc pc=new Pc("lenovo",2500);
        Alface alface=new Alface("Americana",10);
        Celular celular=new Celular("iphone 20",20000);
        CalculadoraImposto.calcularImposto(pc);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(alface);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(celular);

    }
}
