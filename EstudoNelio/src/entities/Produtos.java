package entities;

public class Produtos {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	// constutor padrão 
	public Produtos() {
		
	}
	//Construtor parametrizado
	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	//construtor opcional 
	public Produtos(String nome, double preco) { 
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
		
	}

	public double totalValorEmEstoque() {
		return preco * quantidade;

	}

	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " Unidades, Total: $ "
				+ String.format("%.2f", totalValorEmEstoque());

	}
}
