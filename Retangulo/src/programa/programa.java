package programa;

import java.util.Scanner;

import entidades.calculos;

public class programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		calculos calc = new calculos();
		System.out.print("digite a altura do retangulo ");
		double altura = entrada.nextDouble();
		System.out.print("digite a largura do retangulo ");
		double largura = entrada.nextDouble();
		
		System.out.printf("A area � %.2f\n", calc.area(altura, largura));
		System.out.printf("O Perimetro � %.2f\n", calc.perimetro(altura, largura));
		System.out.printf("A diagonal � %.2f\n", calc.diagonal(altura, largura));
		
		entrada.close();

	}

}
