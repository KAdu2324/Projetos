package Exercicio;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Pessoa pessoa1 = new Pessoa();
//		System.out.println("Informe seu nome: ");
//		pessoa1.nome = sc.nextLine();
//		System.out.println("Informe sua idade: ");
//		pessoa1.idade = sc.nextInt();
//		System.out.println("Informe sua altura");
//		pessoa1.altura = sc.nextDouble();
//		
//		pessoa1.exibirInformacoes();
//		
		System.out.println();
		System.out.println("Informe seu nome: ");
		String nomePessoa2 = sc.nextLine();
		System.out.println();
		System.out.println("Informe sua idade: ");
		System.out.println();
		int IdedePessoa2 = sc.nextInt();
		System.out.println("Informe sua altura");
		System.out.println();
		double altura = sc.nextDouble();
		
		Pessoa pessoa2 = new Pessoa(nomePessoa2, IdedePessoa2, altura);
		
		pessoa2.exibirInformacoes();
		
		sc.close();
		
		
	}

}
