package entidades;

public class Conta {

	private String titular;
	private int numero;
	private double saldo;

	public Conta (String titular, int numero, double valor) {
		this.titular = titular;
		this.numero = numero;
		realizarDeposito(valor);
	}
	
	public Conta (String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
	}
	
	public void realizarDeposito(double valor) {
		this.saldo += valor;
	}
	
	public void realizarSaque(double valor) {
		this.saldo -= valor;
		this.saldo -= 5;
	}
	
	public String toString() {
		return "Número: " + this.numero 
				+ ", Titular: " + this.titular 
				+ ", Saldo: " + String.format("%.2f", this.saldo);
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return this.titular;
	}
	
	public void setNome(String titular) {
		this.titular = titular;
	}
	
}
