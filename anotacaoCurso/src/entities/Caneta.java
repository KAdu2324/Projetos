
package entities;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	

	public void status() {
		System.out.println("Modelo:  " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Esta tampada: " + this.tampada);
	}
public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! não posso rabiscar");
		} else {
			System.out.println("Estou Rabiscando");
		}
	}

	protected void tampar() {
		this.tampada = true;
	}

	protected void destampar() {
		this.tampada = false;

	}
	
	

}
  
	/*
	 * package entities; public class Caneta {
	 * 
	 * public String modelo; public String cor; public float potencia; public
	 * boolean aprovado;
	 * 
	 * 
	 * 
	 * public void status() {
	 * 
	 * System.out.println("Modelo:  " + this.modelo );
	 * System.out.println("Cor do carro: "+ this.cor);
	 * System.out.println("Potencia do Carro:  "+ this.cor); } public void
	 * aprovado() { if(this.aprovado == true) {
	 * System.out.println("Ficha Aprovada!"); } else {
	 * System.out.println("Score baixo");
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * @Override public String toString() { return "Modelo do Carro: " + modelo +
	 * ", cor: " + cor + ", potencia: " + potencia ; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */