package EstruturaCondicional7;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String resultado = (n < 0) ? "Negativo" : "não negativo";
		
		System.out.println(resultado);

		sc.close();
	}
}
