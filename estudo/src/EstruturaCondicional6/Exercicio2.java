package EstruturaCondicional6;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String resultado = (n % 2 == 0) ? "PAR" : "IMPAR";
		System.out.println(resultado);

		sc.close();
	}

}
