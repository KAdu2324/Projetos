package polimorfismo;

public class ItauService implements TaxService {

	@Override
	public double calcularTaxa(Double vlr) {
		
		return (vlr / 100) * 10 ;
	}
	
	public String isBank() {
		return "itau";
	}

}
