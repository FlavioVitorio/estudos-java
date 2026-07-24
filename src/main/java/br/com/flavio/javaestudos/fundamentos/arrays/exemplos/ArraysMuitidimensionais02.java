package br.com.flavio.javaestudos.fundamentos.arrays.exemplos;

public class ArraysMuitidimensionais02 {
    static void main() {
        int[][] arrayMult=new int[2][];
        arrayMult[0]=new int[]{2,45};
        arrayMult[1]=new int[]{3,5,7};

        int [][] arrayMult02={{2,3},{3,5,8},{1,2,3,4,5,6}};
        for (int[] arrayBase:arrayMult02){
            System.out.println("\n---------------");
            for (int num:arrayBase){
                System.out.print(num+" ");
            }
        }
    }
}
