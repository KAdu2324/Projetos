package polimorfismoExercicio1;

public class Main {
	public static void main(String[] args) {
		
		
		
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		
		somAnimal(c);
		System.out.println("dog: "+ c.nomeDog());
		somAnimal(g);
		
		
	}
	public static void somAnimal(Animal c) {
		System.out.println(c.som(" "));
	}
	
}
