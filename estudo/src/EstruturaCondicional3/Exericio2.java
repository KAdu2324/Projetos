package EstruturaCondicional3;

import java.util.Scanner;

public class Exericio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if( numero % 2 == 0) {
			System.out.println("PAR");
			
		}else {
			System.out.println("Impar");
		}
		sc.close();
	}

}
