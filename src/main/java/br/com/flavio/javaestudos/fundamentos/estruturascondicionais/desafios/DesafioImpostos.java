package br.com.flavio.javaestudos.fundamentos.estruturascondicionais.desafios;

public class DesafioImpostos {
    static void main() {
        double salarioAnual=4566;
        double primeiraFaixa=2.5/100;
        double segundaFaixa=7.0/100;
        double terceiraFaixa=15.0/100;
        double valorImposto;
        if (salarioAnual<3000){
            valorImposto=salarioAnual*primeiraFaixa;
        }
        else if (salarioAnual>3001&&salarioAnual<7500) {
            valorImposto=salarioAnual*segundaFaixa;
        }
        else {
            valorImposto=salarioAnual*terceiraFaixa;
        }
        System.out.println("R$:"+valorImposto+" de impostos a pagar.");
    }

}
