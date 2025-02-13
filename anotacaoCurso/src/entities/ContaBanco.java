package entities;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String cliente;
	private float saldo;
	private boolean status;

	// metodos personalizados
	
	public void estadoAtual() {
		System.out.println("-----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Cliente: " + this.getCliente());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public void abrirConta(String t) {

		this.setTipo(t);
		this.setStatus(true);

		if (t == "CC") {
			this.setSaldo(50);
			System.out.println("Conta aberta com sucesso");
		} else if (t == "CP") {
			this.setSaldo(150);
			System.out.println("Conta aberta com sucesso");
		}
		
	}

	public void fechaConta() {

		if (this.getSaldo() > 0) {
			System.out.println("Não pode fechar Conta com dinheiro");

		} else if (this.getSaldo() < 0) {
			System.out.println("Conta em dinheiro");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}

	}

	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado com sucesso " + this.getCliente());
		} else {
			System.out.println("Impossivel deposita em uma conta fechada!");
		}

	}

	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getCliente());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println(" Impossivel sacra de uma conta fechada!");

		}
	}

	public void pagarMensal() {
		int v =0;
		if (this.getTipo()== "CC") {
			v = 12;
		} else if (this.getTipo()== "CP"){
			v = 20;
		}
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() -v);
			System.out.println("Mensalidade paga com sucesso por "+ this.getCliente());
		}else {
			System.out.println("Impossivel pagar uma conta fechada!");
		}

	}

	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
