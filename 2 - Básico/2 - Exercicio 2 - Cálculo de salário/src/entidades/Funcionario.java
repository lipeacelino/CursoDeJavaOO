package entidades;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double imposto;
	
	public double salarioLiquido() {
		return salario - imposto;
	}
	
	public void incrementarSalario(double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	
	public String toString() {
		return nome +", " + "$ " + String.format("%.2f", salarioLiquido());
	}
	
}
