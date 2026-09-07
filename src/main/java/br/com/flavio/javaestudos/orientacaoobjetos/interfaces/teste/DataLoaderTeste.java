package br.com.flavio.javaestudos.orientacaoobjetos.interfaces.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.interfaces.dominio.DataBasicLoader;
import br.com.flavio.javaestudos.orientacaoobjetos.interfaces.dominio.FileLoader;

public class DataLoaderTeste {
    public static void main(String[] args) {
        DataBasicLoader dataBasicLoader=new DataBasicLoader();
        FileLoader fileLoader=new FileLoader();
        dataBasicLoader.laod();
        dataBasicLoader.remove();
        fileLoader.laod();
        fileLoader.remove();
        dataBasicLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
