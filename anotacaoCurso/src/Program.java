import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		ex4();

	}

	public static void ex4() {
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		int quantidade;
	
		
	
		sc.close();
	}

	public static void ex3() {
		int x = 5;
		System.out.println("Bom dia ");
		if (x < 0) {
			System.out.println("Boa tarde");
		}
		System.out.println("Boa noite ");
	}

	public static void ex2() {

		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Voce digitou " + x);
		int a;
		a = sc.nextInt();
		System.out.println("Voce digitou " + a);
		double b;
		b = sc.nextDouble();
		System.out.printf("Voce digitou %.2f%n ", b);

		sc.close();

	}

	public static void ex1() {

		System.out.println("----------------------------------");
		double x = 10.35784;
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("----------------------------------");
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS %n", x);
		System.out.println("---------------------------------------------");
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		System.out.println("--------------------EXERCICIO-----------------------");

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

		System.out.println("--------------------EXERCICIO-----------------------");
		Locale.setDefault(Locale.US);
		String procuct1 = "computer";
		String procuct2 = "oficce desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products: ");
		System.out.printf("%s, which price is $: %.2f%n", procuct1, price1);
		System.out.printf("%s, which price is $ %.2f%n", procuct2, price2);

		System.out.print("Record: ");
		System.out.printf("%d years old, code %d and gender: %s", age, code, gender);

		System.out.printf("Measure With einght decimal places: %.8f%n", measure);
		System.out.printf("Measure With einght decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		System.out.printf("US decimal point: %.3f%n", measure);
	}

}
