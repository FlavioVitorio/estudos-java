package br.com.flavio.javaestudos.fundamentos.variaveis.exemplos;

public class Casting {
    static void main() {
        int numero=(int) 10000000000L;
        float decimal=(float)12.21234567898765432;
        double x=10.6;
        int y=(int)x;
        System.out.println(numero);
        System.out.println(decimal);
        System.out.println(y);
    }
}
