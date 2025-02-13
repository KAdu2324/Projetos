package estudo;

public class Program {

	public static void main(String[] args) {
		
		CadastroProvider Dados = new CadastroProvider();
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId("1");
		pessoa.setNome("Eduardo");
		pessoa.setSobrenome("Carlos");
		pessoa.setCpfCnpj("237.492.897-89");
		pessoa.setProfissao("Desenvolvedor");
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setId("2");
		pessoa1.setNome("Eduardo");
		pessoa1.setSobrenome("Carlos");
		pessoa1.setCpfCnpj("237.492.897-89");
		pessoa1.setProfissao("Desenvolvedor");	
		
		Dados.cadastrar(pessoa);
		Dados.cadastrar(pessoa1);
	
		System.out.printf("Nome:%s\nSobreNome:%s\n", pessoa.getNome(),pessoa.getSobrenome());
		
		Pessoa pessoaAtualizada = new Pessoa();
		
		pessoaAtualizada.setId("2");
		pessoaAtualizada.setNome("João");
		pessoaAtualizada.setSobrenome("Gomes");
		pessoaAtualizada.setCpfCnpj("237.492.897-89");
		pessoaAtualizada.setProfissao("Desenvolvedor");
		
		Dados.atualizar("1", pessoaAtualizada);
		System.out.printf("Nome:%s\nSobreNome:%s\n", pessoaAtualizada.getNome(),pessoaAtualizada.getSobrenome());
		
		Dados.deletar("2");
		
	}

}
