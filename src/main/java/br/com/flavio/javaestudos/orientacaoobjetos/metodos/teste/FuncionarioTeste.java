package br.com.flavio.javaestudos.orientacaoobjetos.metodos.teste;

import br.com.flavio.javaestudos.orientacaoobjetos.metodos.dominio.Funcionario;
import br.com.flavio.javaestudos.orientacaoobjetos.metodos.dominio.ImprimeMediaSalarioFuncionario;

public class FuncionarioTeste {
    static void main() {

        Funcionario funcionario = new Funcionario();
        ImprimeMediaSalarioFuncionario imprimeMediaSalarioFuncionario = new ImprimeMediaSalarioFuncionario();

        funcionario.setNome("Paulo");
        funcionario.setIdade(27);
        double[] salario = {15066.5, 20324.7, 11023.4};
        funcionario.setSalarios(salario);
        funcionario.imprime();
        imprimeMediaSalarioFuncionario.imprimeMedia(salario);
    }
}
