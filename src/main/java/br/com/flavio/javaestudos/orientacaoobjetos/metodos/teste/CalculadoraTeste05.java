package br.com.flavio.javaestudos.orientacaoobjetos.metodos.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.metodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        int[] array = {1, 3, 5, 6, 9, 9};
        calculadora.somaArray(array);

        calculadora.somaVarArgs(2, 4, 5, 6, 7, 7);
    }
}
