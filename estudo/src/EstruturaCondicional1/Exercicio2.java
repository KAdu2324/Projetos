package EstruturaCondicional1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Esse número é par");
		}else {
			System.out.println("Esse número é impar");
		}
	}

}
