package EstudoMentorado;



public class Cenario {

	public static void main(String[] args) {
		tabuada();
		

	}
	public static int[][] tabuada() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 2;

		return logicaProgramacaoProvider.tabuada(valor);
	}

}
