package br.com.flavio.javaestudos.fundamentos.variaveis.desafios;

public class DesafioDeConversao {
    static void main() {
        double valorMetro=26.6;
        double valorCentimetro=valorMetro*100;

        int anos=20;
        int dias=anos*365;
        System.out.println(valorMetro+" metros tem "+valorCentimetro+" centimetros");
        System.out.println(anos+" anos tem "+dias+" dias");
    }
}
