package entities;

public class Tabuada {
	public int[][] tabuada(int valor) {
		
		int linhas = valor * 10;
	    int colunas = 4;
	    
	    int[][] tabela = new int[linhas][colunas];
	    
	    int index = 0;
	    for (int i = 1; i <= valor; i++) {
	        for (int j = 1; j <= 10; j++) {
	            tabela[index][0] = i;
	            tabela[index][1] = j;
	            tabela[index][2] = i * j;
	            index++;
	        }
	    }
	    
	    return tabela;
	}
}
	


