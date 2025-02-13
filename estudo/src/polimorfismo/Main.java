package polimorfismo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		List<String> x = new LinkedList<>();
		
		
		ItauService itauService = new ItauService();
		Nubank n = new Nubank();	
		monstrarTaxa(n);
		monstrarTaxa(n);
		
		System.out.println(itauService.isBank());
		
	}

	public static void monstrarTaxa(TaxService s) {
		System.out.println(s.calcularTaxa(1000.00));
	}
}
