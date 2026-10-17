package br.com.flavio.javaestudos.orientacaoobjetos.exception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste1 {
    public static void main(String[] args)throws IOException {
    novoArquivo();
    }
    private static void novoArquivo() throws IOException{
        File file=new File("arquivo\\teste.txt");
        try {
            boolean iscriado = file.createNewFile();
            System.out.println("Arquivo criado:"+iscriado);

        }catch (IOException e){
        e.printStackTrace();
        throw new RuntimeException("Problema em criar arquivo");
    }
}
}
