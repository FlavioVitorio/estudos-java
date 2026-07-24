package br.com.flavio.javaestudos.fundamentos.estruturasderepetiçao.exemplos;

public class Break {
    static void main() {
        for (int i=0;i<=30;i++){
            if (i>25){
                break;
            }
            System.out.println(i);
        }
    }
}
