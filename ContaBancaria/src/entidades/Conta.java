package entidades;

public class Conta {

	private String nome;
	private int conta;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public Conta(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public Conta(int conta, String nome, double valor) {
		this.conta = conta;
		this.nome = nome;
		deposito(valor);
	}
	
	
	public void deposito(double valor) {
		saldo = saldo + valor;
		
	}
	
	public void saque(double valor) {
		saldo = saldo - valor - 5;
		
	}
	
	public String toString() {
		return "Conta nº: "
				+ conta
				+ ", Nome : "
				+ nome
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}
	
	
}
