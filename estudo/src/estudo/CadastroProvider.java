package estudo;

import java.util.ArrayList;
import java.util.List;

public class CadastroProvider implements CadastroController {

	List<Pessoa> dadosPessoa = new ArrayList<>();

	@Override
	public void cadastrar(Pessoa pessoa) {
		for (Pessoa pessoaCadastrada : dadosPessoa) {
			if (pessoaCadastrada.getCpfCnpj().equals(pessoa.getCpfCnpj())) {
				System.out.println("Cpf cadastrado");
				break;
			}
			
		}
		dadosPessoa.add(pessoa);
	}

	@Override
	public void atualizar(String id, Pessoa pessoa) {
		for(int i = 0; i < dadosPessoa.size(); i++ ) {
			Pessoa pessoaAtualizada = dadosPessoa.get(i);
			if(pessoaAtualizada.getId().equals(id)) {
				dadosPessoa.set(i, pessoa);
				System.out.println("Pessoa Atualizada");
			}
		}
	}

	@Override
	public void deletar(String id) {
		for(int i = 0; i < dadosPessoa.size(); i++) {
			Pessoa excluirPessoa = dadosPessoa.get(i);
			if(excluirPessoa.getId().equals(id)) {
				dadosPessoa.remove(i);
				System.out.println("Pessoa Deletada");
			}
		}

	}

	@Override
	public void buscarPorIdentificador(String id) {
			for(Pessoa pessoa : dadosPessoa) {
				if(pessoa.getId().equals(id)) {
					System.out.println("Pessoa Deletada");
				}
			}
	}

}
