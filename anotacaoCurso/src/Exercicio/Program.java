package Exercicio;

import Exercicio.entities.Tabuada;

public class Program {

	public static void main(String[] args) {

		/*
		 * Tabuada x = new Tabuada();
		 * 
		 * int valor =2;
		 * 
		 * int[][] Tabuada = x.tabuada(valor); for(int i=0; i<Tabuada.length; i++) {
		 * System.out.println(Tabuada[i][0] + ", " + Tabuada[i][1] + ", " +
		 * Tabuada[i][2]);
		 * 
		 * }
		 */

		/*
		 * Tabuada x = new Tabuada(); int resultado = 10; int[] obterDobrosAteMil =
		 * x.obterDobrosAteMil(resultado); for (int i = 0; i <=
		 * obterDobrosAteMil.length; i++) { }
		 */
		
		Tabuada x = new Tabuada();
		int valor = 8;
		int[] obterDobrosAteMil = x.obterDobrosAteDez(valor);
		for (int i = 0; i <= obterDobrosAteMil.length; i++) {
		}
		
	}

}
