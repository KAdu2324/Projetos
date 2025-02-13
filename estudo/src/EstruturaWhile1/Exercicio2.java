package EstruturaWhile1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a  = sc.nextDouble();
		double b = sc.nextDouble();
		
		while(a != 0 && b != 0) {
			if(a > 0 && b > 0) {
				System.out.println("Primeiro");
			}else if(a < 0 && b > 0) {
				System.out.println("Segundo");
			}else if(a < 0 && b < 0 ) {
				System.out.println("Terceiro");
				
			}else {
				System.out.println("Quarto");
			}
			a = sc.nextDouble();
			b = sc.nextDouble();
		}
		
		
		
		sc.close();
	}
}
