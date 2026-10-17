package br.com.flavio.javaestudos.orientacaoobjetos.exception.runtime.teste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        try {
            System.out.println("abrindo arquivo");
            throw new RuntimeException();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando arquivo");
        }
    }
}
