package br.com.flavio.javaestudos.orientacaoobjetos.metodos.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.metodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(40, 5);
        System.out.println(resultado);
        calculadora.imprimeDivisaoDeDoisNumeros(4,0);
    }
}
