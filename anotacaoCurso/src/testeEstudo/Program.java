package testeEstudo;

public class Program {

	public static void main(String[] args) {

		Carro gol = new Carro();

		gol.modelo = "corsa";
		gol.marca = "Nissan ";
		gol.cor = "verde";
		gol.ligar();
		
		Carro celta = new Carro();

		celta.modelo = "ferrari";
		celta.marca = "honda ";
		celta.cor = "rosa";
		celta.desligar();

		System.out.println("eu tenho um " + gol.modelo + " da marca: " + gol.marca + " da cor: " + gol.cor);
		System.out.println("eu tenho um " + celta.modelo + " da marca: " + celta.marca + " da cor: " + celta.cor);
	}

}
