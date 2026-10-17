package br.com.flavio.javaestudos.orientacaoobjetos.exception.exception.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.exception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;
public class LoginInvalidoTeste {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
    private static void logar() throws LoginInvalidoException{
        Scanner scanner=new Scanner(System.in);
        String nome="Kakaroto";
        String senha="ssj4";

        System.out.println("usuario:");
        String nomedigitado=scanner.nextLine();
        System.out.println("senha:");
        String senhadigitado=scanner.nextLine();
        if (!nome.equals(nomedigitado)|| !senha.equals(senhadigitado)){
            throw new LoginInvalidoException("Usuario ou senha invalidos");

        }
        System.out.println("Usuario logado com sucesso");
    }
}
