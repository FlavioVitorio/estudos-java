package br.com.flavio.javaestudos.fundamentos.operadores.exemplos;

public class OperadoresLogicos {
    static void main() {
        int idade=25;
        double salario=3922.4;
        boolean isDentroDaLeiMaiorQueTRinta=idade>=30&&salario>=4612;
        boolean isDentroDaLeiOuMenorQueTrinta=idade<30||salario>=3381;
        System.out.println("isDentroDaLeiMaiorQueTRinta:"+isDentroDaLeiMaiorQueTRinta);
        System.out.println("isDentroDaLeiOuMenorQueTrinta:"+isDentroDaLeiOuMenorQueTrinta);

        double valorContaCorrente=500;
        double valorContaPoupanca=4000;
        int valorNotebook=3500;
        boolean isNotebookCompravel=valorContaCorrente>valorNotebook||valorContaPoupanca>valorNotebook;
        System.out.println("isNotebookCompravel:"+isNotebookCompravel);
    }
}
