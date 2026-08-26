package br.com.flavio.javaestudos.fundamentos.estruturascondicionais.exemplos;

public class If {
   public static void main(String[] args) {
        int idade=15;
        boolean isPermitidoEntrar=idade>=18;
        if (isPermitidoEntrar){
            System.out.println("Entrada permitida");
        }
        if (!isPermitidoEntrar){
            System.out.println("Entrada negada");
        }
    }
}
