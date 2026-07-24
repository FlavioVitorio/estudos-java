package br.com.flavio.javaestudos.fundamentos.arrays.exemplos;

public class Foreach {
    static void main() {
        int[] numero=new int[5];
        int[] numerosJuntos={1,2,3,4,5};
        int[] numeros02=new int[]{1,2,3,4,5};
        for (int i = 0; i < numerosJuntos.length; i++) {
            System.out.println(numerosJuntos[i]);
        }
        for(int j:numeros02){
            System.out.println(j);
        }
    }
}
