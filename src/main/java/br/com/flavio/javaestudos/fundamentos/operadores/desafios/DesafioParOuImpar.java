package br.com.flavio.javaestudos.fundamentos.operadores.desafios;

public class DesafioParOuImpar {
   public static void main(String[] args) {
        int numero=20;
        int verificacaoImparOuPar=numero%2;
        if(verificacaoImparOuPar==0){
            System.out.println("O numero:"+numero+" é par");
        }
        else{
            System.out.println("O numero:"+numero+" é impar");
        }
    }
}
