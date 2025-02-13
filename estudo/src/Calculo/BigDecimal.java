package Calculo;

public class BigDecimal {

	public static void main(String[] args) {

		BigDecimal vlrBruto;
		BigDecimal vlrComissao;
		BigDecimal qtdMin = BigDecimal.valueOf(9);
		BigDecimal perDia = BigDecimal.valueOf(1.41);
		BigDecimal vlrLiq;
		BigDecimal vlrTotal;
		BigDecimal vlrIOF;

		int dias = 10;
		int minDias = 3;

		vlrBruto = perDia.multiply(BigDecimal.valueOf(dias - minDias)).add(qtdMin);
		vlrComissao = vlrBruto.divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(25));
		vlrLiq = vlrBruto.add(vlrComissao);
		vlrIOF = vlrLiq.divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(7.34));
		vlrTotal = vlrLiq.add(vlrIOF);

		System.out.println(vlrBruto.toString());
		System.out.println(vlrComissao.toString());
		System.out.println(vlrLiq.toString());
		System.out.println(vlrIOF.toString());
		System.out.println(vlrTotal.toString());
	}

}
