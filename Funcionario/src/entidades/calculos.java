package entidades;

public class calculos {
	private String nome;
	private double salarioBruto;
	private double taxa;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public double SalarioLiquido() {
		return salarioBruto-taxa;
		}
	public void Incremento(double percentual) {
		salarioBruto +=  salarioBruto * percentual / 100;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return nome + ", $ " + String.format("%.2f", SalarioLiquido());
	
	}

}
