package br.com.flavio.javaestudos.fundamentos.arrays.exemplos;

public class Arrays02 {
    static void main() {
        String [] nomes=new String[3];
        nomes[0]="naruto";
        nomes[1]="goku";
        nomes[2]="luffy";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
