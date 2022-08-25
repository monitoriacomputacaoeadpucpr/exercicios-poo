package exercicio03;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Olá. Vamos calcular essa média medonha!? \n");
		System.out.println("Digite seu nome: ");
		String nome = leitor.next();
		
		System.out.println("Ok! Agora vamos ao que interessa...\n");
		
		System.out.println("Digite a nota do primeiro bimestre: ");
		float n1 = leitor.nextFloat();
		
		System.out.println("Digite a nota do segundo bimestre: ");
		float n2 = leitor.nextFloat();
		
		System.out.println("Digite a nota do seu terceiro bimestre: ");
		float n3 = leitor.nextFloat();
		
		System.out.println("Digite a nota do quarto bimestre: ");
		float n4 = leitor.nextFloat();
		
		leitor.close();

		
		float media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println(nome + ", sua média é " + media);
	}

}
