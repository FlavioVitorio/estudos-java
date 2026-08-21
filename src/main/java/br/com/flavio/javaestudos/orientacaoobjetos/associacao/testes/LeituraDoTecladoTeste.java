package br.com.flavio.javaestudos.orientacaoobjetos.associacao.testes;

import java.util.Scanner;

public class LeituraDoTecladoTeste
{
    static void main() {
        Scanner entreda=new Scanner(System.in);
        System.out.println("digite seu nome:");
        String nome=entreda.nextLine();
        System.out.println("seu nome e :"+nome);

    }
}
