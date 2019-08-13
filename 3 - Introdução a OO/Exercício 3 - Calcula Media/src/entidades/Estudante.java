package entidades;

public class Estudante {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double calculaNota() {
		double nota = nota1 + nota2 + nota3;
		return nota;
	}
	
	public double quantoFalta() {
		if (calculaNota() < 60) {
			return 60 - calculaNota();
		} else {
			return 0.0;
		}
	}
	
	
	
	/*
	public void situacao() {
		if (calculaNota() >= 60) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
			System.out.println("Falta: " + String.format("%.f", 60 - calculaNota()));
		}
	}
	*/
	
}
