package br.com.flavio.javaestudos.orientacaoobjetos.interfaces.dominio;

public class DataBasicLoader implements DataLoader,DataRemover{

    @Override
    public void laod() {
        System.out.println("Carregando do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando dentro do banco");
    }
}
