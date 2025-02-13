package EstudoEncapsulamento;

public class ProgramEncapsulamento {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome ="jorge";
		p.idade = 12;
		Pessoa c = new Pessoa();
		c.nome ="jorge";
		c.idade = -12;
		
		System.out.println(p.idade);
		System.out.println(c.idade);
		// agora com encapsulamento 
		
		PessoaEncapsulamento a = new PessoaEncapsulamento();
		a.setNome("Maria ");
		a.setIdade(23);
		PessoaEncapsulamento b = new PessoaEncapsulamento();
		b.setNome("Maria ");
		b.setIdade(-23);
		System.out.println(a.getIdade());
		System.out.println(b.getIdade());
	}

}
