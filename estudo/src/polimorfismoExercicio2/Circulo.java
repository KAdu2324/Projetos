package polimorfismoExercicio2;

public class Circulo implements Forma {
	private  double raio;

	
	public Circulo(double raio) {
		this.raio = raio;
	}
	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(raio,2);
	}

}
