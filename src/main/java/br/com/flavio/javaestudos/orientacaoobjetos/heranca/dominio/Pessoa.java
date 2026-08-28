package br.com.flavio.javaestudos.orientacaoobjetos.heranca.dominio;

public class Pessoa {
  protected String nome;
  protected String cpf;
  protected Endereco endereco;

  static {
        System.out.println("Dentro de estatico");
    }
    {
        System.out.println("bloco de inicializaçao");
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println("CPF:"+this.cpf);
        System.out.println(this.endereco.getRua()+" CEP:"+this.endereco.getCep());
    }

    public Pessoa(String nome) {
    System.out.println("Dentro do costrutor");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
