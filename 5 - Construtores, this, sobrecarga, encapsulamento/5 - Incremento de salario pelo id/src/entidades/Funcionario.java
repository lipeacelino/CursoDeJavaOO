package entidades;

public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(String nome, int id, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void incrementaSalario(int porcentagem) {
		double incremento = porcentagem * this.salario / 100;
		this.salario += incremento;
	}
	
	public String toString() {
		return this.id + ", "
				+ this.nome + ", "
				+ this.salario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
