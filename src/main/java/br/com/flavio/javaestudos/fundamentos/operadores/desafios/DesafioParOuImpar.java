package br.com.flavio.javaestudos.fundamentos.operadores.desafios;

public class DesafioParOuImpar {
    static void main() {
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
