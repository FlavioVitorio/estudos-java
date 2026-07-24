package br.com.flavio.javaestudos.fundamentos.estruturascondicionais.exemplos;

public class OperadorTernario {
    static void main() {
        double salario=8000;
        String mensagemComprar="Eu vou comprar meu Minicraft por R$:99.";
        String mensagemNaoComprar="Ainda nao tenho condiçoes de comprar Minicraft ";
        String resulatdo=salario>3000? mensagemComprar:mensagemNaoComprar;
        System.out.println(resulatdo);
    }
}
