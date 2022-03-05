package programa;

import java.util.Scanner;

import entidades.calculos;

public class programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		calculos calc = new calculos();
		
		System.out.print("digite nome do funcinario ");
		calc.setNome(entrada.next());
		System.out.print("digite o salario bruto ");
		calc.setSalarioBruto(entrada.nextDouble());
		System.out.print("digite o valor das taxas ");
		calc.setTaxa(entrada.nextDouble());
		
		System.out.println("dados " + calc);
		
		System.out.print("digite o valor do incrento ");
		double incremento = entrada.nextDouble();
		
		calc.Incremento(incremento);
		
		System.out.println("novos dados " + calc);
		
		
		entrada.close();

	}

}
