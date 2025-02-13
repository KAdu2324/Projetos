import java.util.Locale;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
	/**	int y = 32;
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.println(y);
		System.out.println("Bom dia!");
		System.out.println("RESULTADOS = "+ x + "METROS");
		System.out.printf("RESULTADOS = %.2f metros%n", x);
		
		double x = 10.35784;
		String nome = "Maria ";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		
		//Exercicio de Fixacao - Saida de dados em java
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.println(product1 +", cujo preço é R$" + price1);
		System.out.println(product2 +", cujo preço é R$" + price2);
		System.out.println("");
		System.out.println("Record:");
		System.out.println(age +" years old,"+"code: " + code + " gender: " + gender);
		System.out.println("");
		System.out.printf("Measue with eight decimal places " + "%.8f%n", + measure);
		System.out.printf("Rouded (three decimal places): " + "%.3f%n", + measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Us decimal point: " + "%.2f%n", + measure);
		
		
		// Teste-processamento
		
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		int x;
		double y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a/ b;
		System.out.println(resultado);
		
		
		int b;
		double a;
		
		a = 5.0;
		b = (int) a;
		
		System.out.println(b);
		//System.out.println(y);
		
		
		//Entrada de dados 
		Scanner sc =  new Scanner(System.in);
		
		String x;
		x  = sc.next();
		System.out.println("Você digitou o valor: " + x);
		
		sc.close();
		
		Scanner sc =  new Scanner(System.in);
		
		int x;
		x  = sc.nextInt();
		System.out.println("Você digitou o valor: " + x);
		
		sc.close();
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		double x;
		x  = sc.nextDouble();
		System.out.println("Você digitou o valor: " + x);
		System.out.printf("Você digitou: %.2f%n " , x);
		
		sc.close();
		
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		char x;
		x  = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		
		sc.close();
		
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x  = sc.next();
		y  = sc.nextInt();
		z  = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		
		
		Scanner sc =  new Scanner(System.in);
		
		String s1, s2, s3
;		
		s1  = sc.nextLine();
		s2  = sc.nextLine();
		s3  = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		Scanner sc =  new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		s1  = sc.nextLine();
		s2  = sc.nextLine();
		s3  = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Scanner sc =  new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1  = sc.nextLine();
		s2  = sc.nextLine();
		s3  = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//Funções Matematicas
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz qaudrada de " + x + " = " + A);
		System.out.println("Raiz qaudrada de " + y + " = " + B);
		System.out.println("Raiz qaudrada de 25 =  " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println("elevado a " + y + " = " + A);
		System.out.println("elevado ao quadrado = "  + B);
		System.out.println("5 elevado ao quadradi =  " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + "=" + A );
		System.out.println("Valor absoluto de " + z + "=" + B );
		
		//Exercicio proposto 1
		
		int A, B, soma;

		A = 10;
		B = 30;

		soma = A + B;

		System.out.println("SOMA = " + soma);

		int A, B, soma;

		A = 10;
		B = 30;

		soma = A - B;

		System.out.println("SOMA = " + soma);
		
		int A, B, soma;

		A = 0;
		B = 0;

		soma = A + B;

		System.out.println("SOMA = " + soma);
		
		//Exercicio 2 
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double R, A, pi = 3.14159;
		    
		    R = sc.nextDouble();

		    A = pi * R * R;

		    System.out.printf("A=%.4f%n", A);

			sc.close();
			
			
			//Exercicio 3
			
			Scanner sc = new Scanner(System.in);
			int A, B, C, D, dif;

		    A = sc.nextInt();
		    B = sc.nextInt();
		    C = sc.nextInt();
		    D = sc.nextInt();

		    dif = A * B - C * D;

		    System.out.println("DIFERENCA = " + dif);	
			
			sc.close();
			
			//Exercicio 04
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		int numero, horas;
	    double valorHora, salario;

	    numero = sc.nextInt();
	    horas = sc.nextInt();
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	
		//Exercicio 5
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, codigo2, peca1, peca2;
	    double preco1, preco2, total;

	    codigo = sc.nextInt();
	    peca1 = sc.nextInt();
	    preco1 = sc.nextDouble();

	    codigo2 = sc.nextInt();
	    peca2 = sc.nextInt();
	    preco2 = sc.nextDouble();
	    
	    total = preco1*peca1 + preco2*peca2;

	    System.out.printf("Valor  R$ %.2f%n" , total);
	   // System.out.printf("SALARY = U$ %.2f%n", salario);
	    //Exercicio 6
	     * 
	     * Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

	    cod1 = sc.nextInt();
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    cod2 = sc.nextInt();
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
		----************-----------************-		
		
		Scanner sc = new Scanner (System.in);
		
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if(hora <12) {
			System.out.println("Risco Alto ");
		}
		else {
			if(hora < 18) {
			System.out.println("Boa tarde");
			
			}
			else{				
				System.out.println("Boa noite");
			}
			
		}
		
		sc.close();
		//Estrutura condicional
		//exercicio 01		
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Informe um numero?");
		
		numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("NEGATIVO!!");
			
		}else {
			if(numero == 0) {
				System.out.println("não negativo");
				
			}else {
				System.out.println("POSITIVO");
			}
			
		}
				
		sc.close();
		
		//exercicio 2
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
	    
		if (N % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

		sc.close();
		
		//exercicio 03

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
		
		//Exercicio 4
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe dois horarios?");
		int inicioTempo = sc.nextInt();
		int fimTempo = sc.nextInt();
		
		int duracao;
		
		if(inicioTempo < fimTempo) {
			
				duracao = fimTempo - inicioTempo;
			}
			else {
				duracao = 24 - inicioTempo + fimTempo;
			}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		sc.close();
		
		
		//exercicio 05
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe codigo do seu pedido?");
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double total;
		
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
		
		
		//Exercicio 6

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (numero <= 50.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (numero <= 75.0) {
			System.out.println("Intervalo (75,100]");
		}		
		else {
			System.out.println("Intervalo (50,75]");
		}
		
		sc.close();
		
		
		
		//Exercicio 7
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		sc.close();
		//Exercicio 8
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe seu salario:");
		
		double salario = sc.nextDouble();
		double imposto;
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
   ///
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1: 
			dia = "Domingo";
			break;		
		case 2: 
			dia = "Segunda";
			break;		
		case 3: 
			dia = "Terça-Feira";
			break;	
		case 4: 
			dia = "Quarta-Feira";
			break;	
		case 5: 
			dia = "Quinta-Feira";
			break;	
		case 6: 
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sabado";
			default:
				dia = "Valor invalido";
	}
		System.out.println ("Dia da semana: " + dia);
		
		sc.close();
		
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		sc.close();
		
		//Calcular valor terreno
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
		
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 0) {
			x = sc.nextInt();
		}
		
		
		sc.close();
		//Exercicio 01
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("informe sua senha:");
		
		int senha = sc.nextInt();
		
		while (senha != 1234) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
			
		}
		
		System.out.println("Senha Correta");
		sc.close();
		
		//Exercicio 3
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os codernadas de X e Y:");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
		
		//Exercicio 03
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe o codigo do produto:");
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		
				
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma =0;
		for (int i=0; i<N; i=i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		
		sc.close();
		
		
		
		//Exercicio estrutura repetitiva for
		//exercicio 01
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
		//Exercicio 2
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
		
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
		
		
		//Exercicio 04
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();
		
		//Exercicio 5
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fat =1;
		
		for (int i=1; i<+n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
		
		//Exercicio 6
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
		//Exercicio7
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		sc.close();
		
		Scanner sc = new Scanner (System.in);
		
        int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
		
		// Repetição em do-while
		Scanner sc = new Scanner(System.in);
				
		char resp;
		
		do {
			System.out.println("Digite a temperatua em celsius: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("Equivalente em fahrenhei: %.2f%n ", f);
			System.out.println("Deseja repetir (s/n)?");	
			resp = sc.next().charAt(0);
		}while(resp != 'n');
		
		sc.close(); 
		
		
		//Operadores bitwise
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int mask = 0b100000;
		
		if((n & mask) != 0 ) {
			System.err.println("6th bit is true!");		
		}else {
			System.err.println("6th bit is false!");
	    }
		sc.close();
		
			//funçoes interessantes para String	
			
		String original = "abcde FGHJE ABC abc DEFG   ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: " + original + "-" );
		System.out.println("toLowerCase: " + s01 + "-");
		System.out.println("toUpperCase: " + s02 + "-");
		System.out.println("trim:  -" + s03 + "-");
		System.out.println("Substring (2) : - " + s04 + "-");
		System.out.println("Substring (2, 9) : - " + s05 + "-");
		System.out.println("Replace ('a', 'x'): - " + s06 + "-");
		System.out.println("index of 'ab','xy') : - " + i + "-");
		System.out.println("last index of 'bc','bc') : - " + j + "-");
		
		//Operação split

		String s = "Potato apple lemon orange";
		
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
		
		// funções (sintaxe)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println("Higher = " + a);
		}
		else if (b> c) {
			System.out.println("Higher = " + b);
		}
		else {
			System.out.println("Higher = " + c);
		}
		sc.close();
		
		
		//funções (sintaxe) criando funções
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
}
	
	public static int max(int x,int y, int z) {
		
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
	
	return aux;
	}	
	public static void showResult(int value) {
		System.out.println("heigher = " + value);
		**/
		
		
		
		
	}
}