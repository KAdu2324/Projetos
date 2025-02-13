package EstruturaCondicional;

import java.util.Scanner;

public class novoExercicio1 {
	public static void main(String[] args) {
//		nivelFacil();
		nivelMedio();
	}

	public static void nivelFacil() {

		Scanner sc = new Scanner(System.in);

		int idade;
		idade = sc.nextInt();

		if (idade > 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		sc.close();
	}

	public static void nivelMedio() {
		Scanner sc = new Scanner(System.in);

		double salario;
		double aumento = 0;
		double novoSalario;
		System.out.print("Digite o salário do funcionário: ");
		salario = sc.nextDouble();

		if (salario < 1500) {
			aumento = salario * 0.20;

		} else if (salario >= 1500 && salario <= 3000) {
			aumento = salario * 0.10;

		} else {
			aumento = salario * 0.05;
		}

		novoSalario = salario + aumento;

		System.out.printf("Aumento: R$ %.2f\n", aumento);
		System.out.printf("Novo salário: R$ %.2f\n", novoSalario);

		sc.close();

	}
}
