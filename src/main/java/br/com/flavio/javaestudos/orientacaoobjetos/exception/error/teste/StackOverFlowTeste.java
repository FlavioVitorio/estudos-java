package br.com.flavio.javaestudos.orientacaoobjetos.exception.error.teste;

public class StackOverFlowTeste {
    public static void main(String[] args) {
        recusividade();

    }
    public static void recusividade(){
        recusividade();
    }

}
