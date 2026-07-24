package br.com.flavio.javaestudos.fundamentos.estruturasderepetiçao.desafios;

public class DesafioNumerosPares {
    static void main() {
        for (int i=0;i<=1000000;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
