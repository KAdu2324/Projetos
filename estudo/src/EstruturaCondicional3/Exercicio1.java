package EstruturaCondicional3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("NEGATIVO");
		}else {
		System.out.println("NÃO NEGATIVO");
		}
		sc.close();
	}

}
