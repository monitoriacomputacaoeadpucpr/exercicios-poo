package exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    /*
    passos do algoritmo:
    - 1) pedir que o usuário digite um número inteiro
    - 2) criar e percorrer um intervalo de inteiros de 0 a 10
    - 3) imprimir no terminal, para cada item no intervalo, uma linha da tabuada
     */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        for(int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
