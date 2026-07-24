package br.com.flavio.javaestudos.orientacaoobjetos.metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade+" anos");
        if (salarios != null) {
            for (double salario : salarios) {
                System.out.println("R$:" + salario);
            }
        }
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }
}
