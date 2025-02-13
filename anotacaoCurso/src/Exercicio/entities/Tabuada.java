package Exercicio.entities;

import java.util.ArrayList;
import java.util.List;

public class Tabuada {

	public int [][] tabuada(int valor){
		
		int colunas = valor * 10;
		int linhas = 4;
		int result = 0;
		
		int [][] tabuada = new  int [colunas][linhas];
		
		for(int i=1; i<=valor; i++) {
			for(int j=1; j <= 10; i++) {
				tabuada[result][0] = i;
				tabuada[result][1] = j;
				tabuada[result][2] = i * j;
				result++;
				
			}
		}
		return tabuada;
	}
	
	public int[] obterDobrosAteMil(int valor) {
		
		int obterDobros = valor;
		int[] obter =new int[obterDobros];
				
		do {
			System.out.println(obterDobros);
			obterDobros = obterDobros * 2;
		} while ( obterDobros < 1000);
		
		System.out.println(obterDobros);
		
		return obter;
	}
	public int[] obterDobrosAteDez(int valor) {
		
		List<Integer> dobrosAteDez1 = new ArrayList<>();
		
		int  dobrosAteDez = valor;
		int [] obter = new int [dobrosAteDez];
		
		while (valor <=10) {
			dobrosAteDez1.add(valor * 2);
			valor++;
		}
		System.out.println(dobrosAteDez);
		
		
		
		
		
		return obter;
		
	}
	
	
	
}
