package br.com.flavio.javaestudos.fundamentos.estruturasderepetiçao.exemplos;

public class Break {
   public static void main(String[] args) {
        for (int i=0;i<=30;i++){
            if (i>25){
                break;
            }
            System.out.println(i);
        }
    }
}
