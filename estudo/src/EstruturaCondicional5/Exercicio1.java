package EstruturaCondicional5;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		String resultado = (numero < 0) ? "NEGATIVO" : "NÃO NEGATIVO";
		System.out.println(resultado);
	}

}
