package br.com.flavio.javaestudos.fundamentos.estruturasderepetiçao.desafios;

public class DesafioParcelas {
    static void main() {
        double valorCarro = 50000.0;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("parcela " + parcela + " R$:" + valorParcela);
        }
    }
}
