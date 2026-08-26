package br.com.flavio.javaestudos.orientacaoobjetos.associacao.testes;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Software precisão do fututo");
        System.out.println("digite sua pergunta e responderei sim ou nao");
        String pergunta=entrada.nextLine();
        if (pergunta.charAt(0)==' '){
            System.out.println("Sim");
        }else {
            System.out.println("Não");
        }
    }
}
