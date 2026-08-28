package br.com.flavio.javaestudos.orientacaoobjetos.heranca.dominio;

public class Funcionario  extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro de estatico fun");
    }
    {
        System.out.println("bloco de inicializaçao fun");
    }

    public void imprime(){
        super.imprime();
        System.out.println("R$:"+this.salario);
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("dentro do construtor fun");
    }

    public double getSalario() {
        return salario;
    }
    public void relatorio(){
        System.out.println("EU"+this.nome+" recebi o salario");
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
