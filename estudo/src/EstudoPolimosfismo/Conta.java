package EstudoPolimosfismo;

public class Conta {
	
	public String nome;
	public String cpf;
	private Double saldo;

	public Conta() {
		saldo = 0.0;
	}

	public Conta(String cpf, String nome, Double saldo) {
		this();
		this.cpf = cpf;
		this.nome = nome;
		
	}
	
	public Double getSaldo() {
		return saldo;
		
	}
	public void deposita(double valor) {
		saldo = saldo + valor;
		
	}
	public void sacar(double valor) {
		if(saldo < valor ) {
			
		}
		saldo = saldo - valor;
		
	}
}
