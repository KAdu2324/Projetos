package polimorfismoExercicio3;

public class Gerente extends Funcionario {
	private double bonus;

	  public Gerente(String nome, double salario, double bonus) {
	        super(nome, salario);  
	        this.bonus = bonus;
	    }

	    @Override
	    public double calcularSalario() {
	        return this.salario + this.bonus;
	    }
	}
