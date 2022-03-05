package entidades;

public class calculos {
	private double altura;
	private double largura;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double area(double altura, double largura) {
		return altura * largura;
	}

	public double perimetro(double altura, double largura) {
	return 2* (altura + largura );
	}

	public double diagonal(double altura, double largura) {
		return Math.sqrt(altura * altura + largura * largura);
	}

}
