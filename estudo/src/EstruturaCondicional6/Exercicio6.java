package EstruturaCondicional6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		if(n < 0.0 || n > 100.0) {
			System.out.println("Fora de intervalo");
		}else if(n <= 25.0) {
			System.out.println("Intevalo (0,25]");
		}else if(n <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}else if(n <= 75.0) {
			System.out.println("Intevalo (50,75]");
		}else {
			System.out.println("Intervalo (75,100]");
		}
		
		
		sc.close();
	}

}
