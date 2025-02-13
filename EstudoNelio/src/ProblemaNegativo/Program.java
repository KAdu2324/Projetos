package ProblemaNegativo;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qauntos numeros você vai digitar? ");
		int n = sc.nextInt();
		int[] lista = new int[n];
		
		for(int i=0; i<lista.length; i++) {
			System.out.println("Digite um numero: ");
			lista[i] = sc.nextInt();
		}
		System.out.println("Numeros negativos: ");
		
		for(int i=0; i<lista.length; i++) {
			if( lista[i] < 0) {
				System.out.printf("%d\n" , lista[i]);
			}
		}
		
		
		
		sc.close();
		
		
	}

}
