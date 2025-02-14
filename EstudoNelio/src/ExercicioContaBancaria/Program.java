package ExercicioContaBancaria;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		
		System.out.print("Informe o numero da sua conta: ");
		int contaCliente = sc.nextInt();
		
		System.out.print("Informe seu nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Deseja realizar um depoisto (s/n)");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			System.out.print("Informe o valor do deposito: ");
			double inicioDeposito = sc.nextDouble();
			conta = new Conta( contaCliente, nome, inicioDeposito);
		} else {
			conta = new Conta(contaCliente, nome);
		}
		System.out.println();
		System.out.print("Dados da conta: " +  conta.toString());
		System.out.println();
		
		System.out.print("Deseja realizar um deposito clicar(d)  ou clicar saque (s) ? (d/s) ?");
		char depositar = sc.next().charAt(0);
		if(depositar == 'd') {
			System.out.print("Informe o valor do deposito: ");
			double deposito = sc.nextDouble();
			conta.deposito(deposito);
			System.out.println("Saldo Atualizado:  ");
			System.out.println(conta.toString());
		} else if(depositar == 's') {
			System.out.print("Informe o valor do saque: ");
			double sacar = sc.nextDouble();
			conta.sacar(sacar);
			System.out.println(conta.toString());
		}
		
		sc.close();
		
	}
}
