package entities;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ImportProduct extends Product {
	
	private Double customsFee;

	public ImportProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", getPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
	
}
