package br.com.flavio.javaestudos.orientacaoobjetos.associacao.testes;

import br.com.flavio.javaestudos.orientacaoobjetos.associacao.dominio.Escola;
import br.com.flavio.javaestudos.orientacaoobjetos.associacao.dominio.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("kakashi");
        Professor professor02= new Professor("jiraya");
        Professor[] professores = {professor,professor02};
        Escola escola = new Escola("JK", professores);
        escola.imprime();


    }
}
