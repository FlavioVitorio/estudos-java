package br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.testes;

import br.com.flavio.javaestudos.orientacaoobjetos.metodos.dominio.Calculadora;
import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio.Alface;
import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio.Celular;
import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio.Pc;
import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio.Produto;
import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Pc pc=new Pc("lenovo",2500);
        Alface alface=new Alface("Americana",10);
        alface.setDataValidade("19/12/24");
        CalculadoraImposto.calcularImposto(alface);



    }
}
