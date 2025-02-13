import entities.ContaBanco;

public class ProgramConta {

	public static void main(String[] args) {
		
		ContaBanco pesso1 = new ContaBanco();
		pesso1.setNumConta(1111);
		pesso1.setCliente("Jubileu");
		pesso1.abrirConta("CC");
		pesso1.depositar(100);
		pesso1.sacar(150);
		pesso1.fechaConta();
		
		
		
		ContaBanco pesso2 = new ContaBanco();
		pesso2.setNumConta(2222);
		pesso2.setCliente("Creuza");
		pesso2.abrirConta("CP");
		pesso2.depositar(500);
		pesso2.sacar(1000);
		
		
		pesso1.estadoAtual();
		pesso2.estadoAtual();
	}

}
