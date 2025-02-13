package EstruturaCondicional;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // para ler o valor de entrada que esotu passando pelo teclado 
		
		int codigo = sc.nextInt(); // amazernando o valor que vim da entradad no codigo
		int quantidade = sc.nextInt();
		
		double total;
		
		if( codigo == 1) {
			total = quantidade * 4.00;
		}else if( codigo == 2) {
			total = quantidade * 4.50;
		}else if (codigo == 3) {
			total = quantidade * 5.00;
		}else if (codigo == 4) {
			total = quantidade * 2.00;
		}else if (codigo == 5) {
			total = quantidade * 1.50;
		}
		else {
			total = quantidade * 1.5;
		}
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}
