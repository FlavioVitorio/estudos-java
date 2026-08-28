package br.com.flavio.javaestudos.fundamentos.estruturasderepetiçao.exemplos;

public class Continue {
    static void main() {
        double valor=20000;
        for (int parcela =(int) valor; parcela >=1; parcela--) {
            double valorParcela=valor/parcela;
            if (valorParcela<1000){
                continue;
            }
            System.out.println("parcela " +parcela+ " R$:" + valorParcela);
        }
    }
}
