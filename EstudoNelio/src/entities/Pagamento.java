package entities;

public class Pagamento {

	public String nome;
	public double salarioBruto;
	public double tax;
	
	public Pagamento(String nome, double salarioBruto, double tax) {
		this.nome = nome;
		this.salarioBruto =  salarioBruto;
		this.tax = tax;
	}

	public double salarioLiquido() {
		return salarioBruto - tax;

	}

	public void aumentarSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}

}
