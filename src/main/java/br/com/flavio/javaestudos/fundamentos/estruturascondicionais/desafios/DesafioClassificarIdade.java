package br.com.flavio.javaestudos.fundamentos.estruturascondicionais.desafios;

public class DesafioClassificarIdade {
    static void main() {
        int idade=19;
        if (idade<11){
            System.out.println("Voce é criança");
        }
         else if (idade>=11&&idade<18) {
            System.out.println("Voce é adolescente");
        }
         else {
            System.out.println("Voce é adulto");
        }
    }
}
