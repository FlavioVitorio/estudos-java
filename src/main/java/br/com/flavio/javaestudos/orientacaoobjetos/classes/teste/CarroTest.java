package br.com.flavio.javaestudos.orientacaoobjetos.classes.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.classes.dominio.Carro;

public class CarroTest {
    static void main() {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "fusca preto";
        carro01.ano = 1996;
        carro01.modelo = "fusca 1.6";

        carro02.nome = "honda civic";
        carro02.ano = 2021;
        carro02.modelo = "civic hibrido 1.4";

        System.out.println("Nome:" + carro01.nome + "| Ano:" + carro01.ano + "| Modelo:" + carro01.modelo);
        System.out.println("Nome:" + carro02.nome + "| Ano:" + carro02.ano + "|    Modelo:" + carro02.modelo);
    }
}
