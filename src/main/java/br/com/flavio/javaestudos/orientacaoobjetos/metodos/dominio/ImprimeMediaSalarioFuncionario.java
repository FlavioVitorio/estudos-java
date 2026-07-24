package br.com.flavio.javaestudos.orientacaoobjetos.metodos.dominio;

public class ImprimeMediaSalarioFuncionario {
    private double soma;

    public void imprimeMedia(double... salarios) {
        if (salarios != null) {

            for (double temp : salarios) {
                soma += temp;
            }
            double media = soma / salarios.length;
            System.out.println("A media salarial dos salarios será de R$:" + media);
        }
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }
}
