package br.com.flavio.javaestudos.fundamentos.estruturasderepetiçao.exemplos;

public class While {
   public static void main(String[] args) {
        int i = 4;
        while (i < 10) {
            System.out.println(i);
            ++i;
        }
        do {
            System.out.println("executando");
        } while (i < 10);
      }
    }
