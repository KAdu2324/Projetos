package EstruturaCondicional6;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inicioHora = sc.nextInt();
		int fimHora = sc.nextInt();
		int total;
		
		if(inicioHora < fimHora) {
			total = fimHora - inicioHora;
		}else{
			total = 24 - inicioHora + fimHora;
		}
		System.out.println("o jogo durou " + total + " hora(s)");
		
		
		
		sc.close();
	}

}
