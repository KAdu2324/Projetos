package ExercicioMemoria;

import java.util.Iterator;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Produto[] lista = new Produto[n];

		for (int i = 0; i < lista.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			lista[i] = new Produto(nome, preco);
		}

		double soma = 0.0;

		for (int i = 0; i < n; i++) {
			soma += lista[i].getPreco();
		}

		double valorFinal = soma / n;

		System.out.printf("Valor aproximado dos itens %.2f%n", valorFinal);

		sc.close();
	}

}
