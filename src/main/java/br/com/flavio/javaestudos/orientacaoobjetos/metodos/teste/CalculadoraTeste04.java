package br.com.flavio.javaestudos.orientacaoobjetos.metodos.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.metodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    static void main() {
        Calculadora calculadora=new Calculadora();
        int num1=34;
        int num2=56;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println(num1);
        System.out.println(num2 );
    }
}
