package Loja;

public class Midia {
	int codigo;
	double preco;
	String nome;

	public Midia() {
		this(0, 0.0, "Nenhum");
	}

	public Midia(int c, double p, String n) {
		setCodigo(codigo);
		setPreco(preco);
		setName(nome);
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setPreco(double preco) {

	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public double getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	public String getNome() {
		return nome;
	}

}
