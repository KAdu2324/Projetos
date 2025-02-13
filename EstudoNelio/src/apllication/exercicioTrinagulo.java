package apllication;

import java.util.Scanner;

import entities.Triangulo;

public class exercicioTrinagulo {

	public static void main(String[] args) {
//		 semOrientadoObejto();
		 orientadoObejto();
	}

	public static void semOrientadoObejto() {
		Scanner sc = new Scanner(System.in);

		double xA, xB, xC, yA, yB, yC;
		System.out.println("Leia o valor do triangul X ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Leia o valor do triangul Y ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double p = (xA + xB + xC) / 2.0;
		double areX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		p = (yA + yB + yC) / 2.0;
		double areY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Triangle X area: %.4f%n", areX);
		System.out.printf("Triangle Y area: %.4f%n", areY);

		if (areX > areY) {
			System.out.println("maior area: X");
		} else {
			System.out.println("maior area: Y");
		}

		sc.close();

	}

	public static void orientadoObejto() {
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Leia o valor do triangul X ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Leia o valor do triangul Y ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double p = (x.a + x.b + x.c) / 2.0;
		double areX = Math.sqrt(p * (p - x.a) * (p - x.a) * (p - x.a));
		p = (y.a + y.b + y.c) / 2.0;
		double areY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("Triangle X area: %.4f%n", areX);
		System.out.printf("Triangle Y area: %.4f%n", areY);

		if (areX > areY) {
			System.out.println("maior area: X");
		} else {
			System.out.println("maior area: Y");
		}

		sc.close();

	}

}
