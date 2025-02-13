import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramTeste1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario f1,f2;
		
		f1 = new Funcionario();
		f2 = new Funcionario();
		
		/*
		 * String nome1,nome2; double valorPorHora1,valorPorHora2, total; int horas1 ,
		 * horas2
		 */;
		
		
		
		System.out.print("nome do primeiro funcionario: ");
		 f1.nome = sc.next();
		System.out.print("Valor por hora: ");
		 f1.valorPoHora = sc.nextDouble(); 
		System.out.print("Horas: ");
		 f1.horas = sc.nextInt();
		
		System.out.print("nome do segundo funcionario: ");
		 f2.nome = sc.next();
		System.out.print("Valor por hora: ");
		 f2.valorPoHora= sc.nextDouble();
		System.out.print("Horas: ");
		 f2.horas = sc.nextInt();
		
		
		double total = f1.total() + f2.total();
		
		
		System.out.printf("Resultado = %.2f  ", total);
		
		
		
		
		
		sc.close();
		
		
	}
}
