package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    /*
    passos de algoritmo:
    - 1) pedir as 4 notas ao usuário
    - 2) calcular a média final
    - 3) converter essa média final para conceito
    - 4) verificar se recebe bolsa do curso de inglês
    - 5) se recebe a bolsa, verificar para qual turma (se é par ou ímpar)
    - 6) imprimir resultados no terminal

    principais variáveis:
    - as 4 notas: double
    - média final: double
    - conceito final: String
    - recebeBolsa = boolean
    - turmaBolsa = String
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        // nota1
        System.out.print("Digite a nota do 1º bimestre: ");
        double nota1 = leitor.nextDouble();

        // nota2
        System.out.print("Digite a nota do 2º bimestre: ");
        double nota2 = leitor.nextDouble();

        // nota3
        System.out.print("Digite a nota do 3º bimestre: ");
        double nota3 = leitor.nextDouble();

        // nota4
        System.out.print("Digite a nota do 4º bimestre: ");
        double nota4 = leitor.nextDouble();

        // média final
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        media = Math.round(media * 10.0) / 10.0;

        // conceito final
        String conceito;
        if(media >= 9) {
            conceito = "A";
        } else if (media >= 8 && media < 9) {
            conceito = "B";
        } else if (media >= 6 && media < 8) {
            conceito = "C";
        } else {
            conceito = "D";
        }

        // bolsa
        boolean bolsa = false;
        String turmaBolsa = "Nenhuma";
        if(media > 9.2) {
            bolsa = true;

            // turma do curso de inglês
            double verificaBolsa = (media - (int) media) * 10;
            verificaBolsa = Math.round(verificaBolsa);

            if(verificaBolsa % 2 == 0) {
                // par
                turmaBolsa = "Turma A";
            } else {
                // ímpar
                turmaBolsa = "Turma B";
            }
        }

        // mostrar resultados no terminal
        System.out.println("Média Final: " + media);
        System.out.println("Conceito Final: " + conceito);
        System.out.println("Recebe Bolsa? " + (bolsa ? "Sim" : "Não"));
        System.out.println("Turma do Curso de Inglês: " + turmaBolsa);
    }
}
