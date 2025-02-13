package EstudoPolimosfismo;

public class Program {

	public static void main(String[] args) {

		Conta c = new Conta();
		
		c.nome = "Jorge";
		c.cpf = "123456789" ;
		c.deposita(100.0);
		c.sacar(20);
		
		System.out.println("Nome: "+ c.nome);
		System.out.println("CPF: " + c.cpf);
		System.out.println("Seu saldo : " + c.getSaldo());
	}

}
