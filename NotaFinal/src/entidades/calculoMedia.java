package entidades;

public class calculoMedia {
	private String name	;
	private double nota1;
	private double nota2;
	private double nota3;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double media() {
		
		return  nota1 + nota2 + nota3;
		
		}
	public double notaFinal() {
		if (media() < 60) {
			return 60-media();
		}else {
			return 0;
		}
	}
	
	
	
}
