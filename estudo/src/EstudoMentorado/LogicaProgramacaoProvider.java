package EstudoMentorado;

public class LogicaProgramacaoProvider implements LogicaProgramacao {

	@Override
	public int[][] tabuada(int valor) {

		int valorRecebido = valor * 10;
		int coluna = 3;
		int resultado = 0;

		int[][] tabela = new int[valorRecebido][coluna];
		for (int i = 1; i <= valor; i++) {
			for (int x = 0; x <= 10; x++) {
				tabela[resultado][0]=i;
				tabela[resultado][1]=x;
				tabela[resultado][2]=i * x;
				coluna++;
			}
		}
		return tabela;
	}

}
