package polimorfismoExercicio2;

public class Retangulo implements Forma {
	
	public double altura;
	public double largura;
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return largura * altura;
	}

}
