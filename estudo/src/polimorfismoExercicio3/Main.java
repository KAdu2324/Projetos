package polimorfismoExercicio3;

public class Main {
	public static void main(String[] args) {

		Funcionario[] funcionarios = new Funcionario[3];

		funcionarios[0] = new Gerente("Carlos", 5000.0, 1500.0);
		funcionarios[1] = new Assistente("Ana", 2000.0, 500.0);
		funcionarios[2] = new Gerente("Fernanda", 6000.0, 2000.0);

		for (Funcionario f : funcionarios) {
			System.out.println(f.nome + " - Salário: R$ " + f.calcularSalario());
		}
	}
}
