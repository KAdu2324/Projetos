package polimorfismoExercicio2;

public class Main {

	public static void main(String[] args) {
		Forma [] formas = new Forma[2];
		
		formas[0] = new Circulo(5);
		formas[1] = new Retangulo(4, 6);
		
		for( Forma forma : formas){
			System.out.println("àrea: " +forma.Area());
		}
	}
}
