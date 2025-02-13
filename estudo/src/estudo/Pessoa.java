package estudo;

public class Pessoa {
	
	private String id;
	
	private String nome;

	private String sobrenome;

	private String dataNascimento;

	private String idade;

	private String sexo;

	private String profissao;

	private String cpfCnpj;

	private String escolaridade;

	private String salario;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String sobrenome, String dataNascimento, String idade, String sexo, String profissao,
			String cpfCnpj, String escolaridade, String salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.sexo = sexo;
		this.profissao = profissao;
		this.cpfCnpj = cpfCnpj;
		this.escolaridade = escolaridade;
		this.salario = salario;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", dataNascimento=" + dataNascimento
				+ ", idade=" + idade + ", sexo=" + sexo + ", profissao=" + profissao + ", cpfCnpj=" + cpfCnpj
				+ ", escolaridade=" + escolaridade + ", salario=" + salario + "]";
	}

	

}
