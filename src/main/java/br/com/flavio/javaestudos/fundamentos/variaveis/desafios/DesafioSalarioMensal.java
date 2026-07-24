package br.com.flavio.javaestudos.fundamentos.variaveis.desafios;

public class DesafioSalarioMensal {
    static void main() {
        double salarioMensal=1618;
        double salarioAnual=salarioMensal*12;
        double calculoDaSobra=salarioAnual*30/100;
        double sobraSeGastar=salarioAnual-calculoDaSobra;
        System.out.println("Se você gastar 30% de R$:"+salarioAnual+",vai sobrar R$:"+sobraSeGastar);
    }
}
