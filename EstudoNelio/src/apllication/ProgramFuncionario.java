package apllication;

import java.util.Scanner;

import entities.Pagamento;

public class ProgramFuncionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do funcionario");
		String nome = sc.nextLine();
		System.out.println("Informe o salario: ");
		double salarioBruto = sc.nextDouble();
		System.out.println("Informe a tax:");
		double tax = sc.nextDouble();
	
		Pagamento funcionario = new Pagamento(nome, salarioBruto, tax);
		System.out.println("Funcionario:  " + funcionario.toString());
		System.out.println("Informe a porcentagem do salario");

		double porcentagemFunc = sc.nextDouble();
		funcionario.aumentarSalario(porcentagemFunc);
		System.out.println();
		System.out.println("Salario atualizado do Funcionario:  " + funcionario);
		


		sc.close();

	}

}
