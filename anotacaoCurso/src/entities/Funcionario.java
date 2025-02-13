package entities;

public class Funcionario {	
	
	public String nome;
	public Double valorPoHora;
	public int horas;
	
	public double total() {
	return valorPoHora * horas ;
	}

}
