package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Ler o valor inserido pelo teclado
		
		int n = sc.nextInt(); //informo que n vai receber o valor sc do tipo int
		
		if(n < 0 ) {
			System.out.println("Esse número é negativo ");
		}else {
			System.out.println("Esse numero não é negativo");
		}
		
	}
}
