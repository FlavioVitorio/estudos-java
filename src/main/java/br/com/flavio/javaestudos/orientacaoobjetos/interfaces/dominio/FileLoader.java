package br.com.flavio.javaestudos.orientacaoobjetos.interfaces.dominio;

public class FileLoader implements DataLoader,DataRemover {
    @Override
    public void laod() {
        System.out.println("Carregando um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("removendo arquivo");
    }
    @Override
    public void checkPermission() {
        System.out.println("checando dentro do banco");
    }
}
