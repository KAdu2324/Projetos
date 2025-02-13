package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Product1;

public class Program1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Product1 product = new Product1();
		
		System.out.println("Enter product data");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		//product.toString();
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the numer of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		
		System.out.println();
		System.out.println("Enter the numer of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		//System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		
		
		
		sc.close();

	}

}
