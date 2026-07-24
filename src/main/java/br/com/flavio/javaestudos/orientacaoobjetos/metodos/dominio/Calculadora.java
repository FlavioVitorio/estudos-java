package br.com.flavio.javaestudos.orientacaoobjetos.metodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 20);
    }

    public void multiplicaDoisNumeros(int num, int num2) {
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num / num2;
    }

    public void imprimeDivisaoDeDoisNumeros(double num, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0.");
            return;
        }
        System.out.println(num / num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 20;
        System.out.println("Dentro de alterarDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int temp : numeros) {
            soma += temp;

        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int temp : numeros) {
            soma += temp;

        }
        System.out.println(soma);
    }
}
