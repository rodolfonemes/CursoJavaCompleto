package entidades;

public class regras {

	private Integer id;
	private String nome;
	private Double salario;
	
	
	public regras(int id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
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


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void aumentoDeSalario(double percetual) {
		salario += salario * percetual / 100.0;
	}

	public String toString() {
		return "[id= " + id + ", nome= " + nome + ", salario= " + String.format("%.2f", salario) + "]";
	}


		
}
