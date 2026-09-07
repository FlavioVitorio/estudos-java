package br.com.flavio.javaestudos.orientacaoobjetos.interfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SZIE=10;
    void laod();
    default void checkPermission(){
        System.out.println("Fazendo checagem dos dados");
    }

}
