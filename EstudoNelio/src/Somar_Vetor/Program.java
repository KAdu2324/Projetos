package Somar_Vetor;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double soma, media;
		System.out.println("Qauntos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] lista = new double[n];

		for (int i = 0; i < lista.length; i++) {
			System.out.println("Digite um numero: ");
			lista[i] = sc.nextDouble();
		}
		soma = 0;

		for (int i = 0; i < n; i++) {
			soma += lista[i];
		}
		media = soma / n;

		System.out.println("Valores = ");

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f", lista[i]);
		}

		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);
		sc.close();
	}

}
