package polimorfismo;

public class Nubank implements TaxService {

	@Override
	public double calcularTaxa(Double vlr) {
		
		return (vlr / 100) * 2 ;
	}

}
