package br.com.flavio.javaestudos.fundamentos.arrays.exemplos;

public class ArraysMuitidimensionais {
    static void main() {
        int[][] meses = new int[2][3];
        meses[0][0] = 31;
        meses[0][1] = 28;
        meses[0][2] = 31;
        meses[1][0] = 31;
        meses[1][1] = 28;
        meses[1][2] = 31;
        for (int i = 0; i < meses.length; i++) {
            for (int j = 0; j < meses[i].length; j++) {
                System.out.println(meses[i][j]);
            }
        }
        System.out.println("-----------------------");
        for (int[] arrayBase : meses) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
