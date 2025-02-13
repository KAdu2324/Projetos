import entities.Tabuada;

public class TabuadaPrgram {

	public static void main(String[] args) {
		
		int valor = 2;
		

		Tabuada x = new Tabuada();

		int[][] tabuada = x.tabuada(valor);

		for (int i = 0; i < tabuada.length; i++) {
			System.out.println(tabuada[i][0] + ", " + tabuada[i][1] + ", " + tabuada[i][2]);

		}

	}
}
