package ExercicioContaBancaria;

public class Conta {
	
	private int conta;
	private String nome;
	private double saldo;

	public Conta(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	
	public Conta(int conta, String nome, double depositoInicial) {
		this.conta = conta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public void deposito(double quantia) {
		this.saldo += quantia;
	}

	public void sacar(double quantia) {
		this.saldo -= quantia + 5.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String toString() {
		return "Numero da conta: "+ conta + ", Cliente: " + nome + " Saldo: $ " + saldo;

	}

}
