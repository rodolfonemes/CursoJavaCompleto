package exercicios2;

import java.util.Scanner;

public class exercicios2_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("digite o valor do salario ");
		double x, valor = 0;
		x = sc.nextDouble();

		if (x <= 2000) {
			System.out.println("Isenta");
		}

		else if (x <= 3000) {
			valor = (x - 2000) * 0.08;
			System.out.println(valor);
		} 
		
		else if (x <= 4500) {
			valor = (x - 3000.0) * 0.18 + 1000.0 * 0.08;
			System.out.println(valor);
		} 
		
		else {
			valor = (x - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.println(valor);
		}
		
		sc.close();
	}

}
