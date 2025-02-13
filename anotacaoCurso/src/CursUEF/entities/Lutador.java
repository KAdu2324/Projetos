package CursUEF.entities;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitoria;
	private int derrotas;
	private int empates;

	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitoria = vitoria;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria ();
	}

	public String getCategoria() {
		return categoria;
	}
	
	private void setCategoria() {
		
		if(this.getPeso() < 52.2) {
			this.categoria = " Invalido";
		}else if (this.getPeso() <= 70.3) {
			this.categoria = " Leve";
		}else if(this.getPeso() <= 83.9) {
			this.categoria = " Medio ";
		}else if(this.getPeso() <=120.2) {
			this.categoria = " Pesado";
		}else {
			this.categoria = "Inválido ";
		}
	}

	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public void apresentar() {
		System.out.println("-------------------------------------------------------");
		System.out.println("CHEGOU A HORA Apresentamos o lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " Anos e " + this.getAltura()+ "m de altura");
		System.out.println("Pesando "+ this.getPeso() + "Kg");
		System.out.println(this.getVitoria() +  ": Vitorias " );
		System.out.println(this.getDerrotas()+ ": Derrotas");
		System.out.println(this.getEmpates()+ ": Empates! ");
		
	}

	public void status() {
		System.out.println("--------------------Status-------------------");
		System.out.println(this.getNome() + " é um peso "+ this.getCategoria());
		System.out.println("Ganhou: " + this.getVitoria() + " Vezes");
		System.out.println("Perdeu: " + this.getDerrotas() + " Vezes");
		System.out.println("Empatou: " + this.getEmpates() + " Vezes");
	}

	public void ganharLuta() {
		this.setVitoria(this.getVitoria() + 1);

	}

	public void perdeLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+ 1);

	}
	

}
