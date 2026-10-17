package br.com.flavio.javaestudos.orientacaoobjetos.exception.runtime.teste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        divisao(5, 0);

    }

    private static int divisao(int a, int b) {
        if (b==0) {
            throw new IllegalArgumentException("Arqumento 0 invalido");
        }
        return a/b;

    }
}
