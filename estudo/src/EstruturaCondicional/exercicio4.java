package EstruturaCondicional;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int horInicial = sc.nextInt();		
		 int horaFinal = sc.nextInt();
		 
		 int duracao;
		 if(horInicial < horaFinal) {
			 duracao = horaFinal - horInicial;
		 }else {
			 duracao = 24 - horInicial + horaFinal;
		 }
		 System.out.println("o jogo durou " + duracao + "horas(s)");
		 
	}

}
