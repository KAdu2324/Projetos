import java.util.Scanner;

public class EsudoIf {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int resposta = -10;

		

		while (resposta != 10) {
			System.out.println("informe o numero");
			resposta = in.nextInt();
		} if (resposta == 10) {
			System.out.println("acertou");
		} else {
			System.out.println("A resposta é menor que 10!");
		}
	}

		/*
		 * for (int i = 0; i <= 10; i++) { System.out.println("A variável i agora vale "
		 * + i); }
		 */

		/*
		 * Scanner in = new Scanner(System.in); int numero = -1; while (numero != 10) {
		 * // enquanto a variável não for 10, o trecho de código será repetido
		 * System.out.println("Digite um número: "); numero = in.nextInt(); if (numero
		 * == 10) { System.out.println("Você acertou!"); } else {
		 * System.out.println("Você errou :"); } }
		 */

	}
