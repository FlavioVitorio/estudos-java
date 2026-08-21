package br.com.flavio.javaestudos.orientacaoobjetos.modificadorestatico.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.modificadorestatico.dominio.Carro;

public class TesteCarro {
    static void main() {
        Carro carro01=new Carro("Ferrari",350);
        Carro carro02=new Carro("BMW",270);
        Carro carro03=new Carro("Audi",260);
        Carro.setVelocidadeLimite(230);

        carro01.imprime();
        carro02.imprime();
        carro03.imprime();
    }
}
