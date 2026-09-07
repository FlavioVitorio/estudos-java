package br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.servico;

import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio.Alface;
import br.com.flavio.javaestudos.orientacaoobjetos.polimorfirsmo.dominio.Pc;

public class CalculadoraImposto {
    public static void calcularImpostoPc(Pc pc){
        System.out.println("calculo imposto pc");
        double imposto = pc.calcularImposto();
        System.out.println("pc:"+pc.getNome());
        System.out.println("valor:"+pc.getValor());
        System.out.println("valor a ser pago:"+imposto);
    }

    public static void calcularImpostoAlface(Alface alface){
        System.out.println("--------------------------");
        System.out.println("calculo imposto pc");
        double imposto = alface.calcularImposto();
        System.out.println("Alface:"+alface.getNome());
        System.out.println("valor:"+alface.getValor());
        System.out.println("valor a ser pago:"+imposto);
    }
}
