package br.com.flavio.javaestudos.orientacaoobjetos.exception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste {
    public static void main(String[] args) {
    novoArquivo();
    }
    private static void novoArquivo(){
        File file=new File("arquivo\\teste.txt");
        try {
            boolean iscriado = file.createNewFile();
            System.out.println("Arquivo criado:"+iscriado);

        }catch (IOException e){
        e.printStackTrace();
    }
}
}
