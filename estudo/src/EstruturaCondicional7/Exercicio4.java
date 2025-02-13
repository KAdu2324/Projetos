package EstruturaCondicional7;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicio = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int quantidade;
		
		if(horaInicio < horaFinal) {
			quantidade = horaFinal - horaInicio;
		}else {
			quantidade = 24 - horaInicio + horaFinal;
		}
		System.out.println("O jogo durou " + quantidade +"hora(s)");
		
		
		sc.close();
	}

}
