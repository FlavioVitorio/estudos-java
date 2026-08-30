package br.com.flavio.javaestudos.orientacaoobjetos.modificadorfinal.testes;

import br.com.flavio.javaestudos.orientacaoobjetos.modificadorfinal.dominio.Audi;
import br.com.flavio.javaestudos.orientacaoobjetos.modificadorfinal.dominio.Carro;
import br.com.flavio.javaestudos.orientacaoobjetos.modificadorfinal.dominio.Comprador;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(Carro.COMPRADOR);
        carro.COMPRADOR.setNome("jão");
        System.out.println(carro.COMPRADOR);
        Audi audi = new Audi();
        audi.setNome("audi 22");
        audi.imprime();
    }
}
