package EstruturaCondicional1;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		
		if(numero < 0.0 || numero > 100.00) {
			System.out.println("Fora do intervalo");
		}else if(numero <= 25.0) {
			System.out.println("Intervalo (0,25]");
		}else if(numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}else if(numero <= 75.0) {
			System.out.println("Intervalo (50.75]");
		}else {
			System.out.println("Intervalo (75,100]");
		}
		sc.close();
		
	}
}
