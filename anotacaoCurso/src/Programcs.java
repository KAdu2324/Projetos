import entities.CanetaQuatro;

public class Programcs {

	public static void main(String[] args) {
		
		
		CanetaQuatro c1 = new CanetaQuatro("Nic", "Amarela", 0.4f);
		CanetaQuatro c3 = new CanetaQuatro("rosa", "rosa", 0.4f);
		CanetaQuatro c4 = new CanetaQuatro("esquece", "blue", 0.4f);
		//c1.setModelo("bic");
		//c1.modelo = "Bic"; rotegido
		//c1.setPonta(0.7f);
		//c1.ponta = 0.7f; protegido
		c1.status();
		c3.status();
		c4.status();
		//System.out.println("Tenho uma caneta " +c1.getModelo() + " de ponta: "+ c1.getPonta());
	}

}
