package polimorfismoExercicio3;

public class Assistente extends Funcionario {
	   private double comissoes;

	    public Assistente(String nome, double salario, double comissoes) {
	        super(nome, salario); 
	        this.comissoes = comissoes;
	    }

	    @Override
	    public double calcularSalario() {
	        return this.salario + this.comissoes;  
	    }
	}
