package exercicios2;

import java.util.Scanner;

public class exercicios2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero entre 0 e 100 ");
		Double numero = sc.nextDouble();
		
				
				
		if (numero >=0 && numero <=25) {
			System.out.println("intervalo entre 0 e 25 ");
		}
		else if (numero >25 && numero <=50) {
			System.out.println("intervalo entre 25 e 50 ");
		}
		else if (numero >50 && numero <=75) {
			System.out.println("intervalo entre 50 e 75 ");
		}
		else if (numero >75 && numero <=100) {
			System.out.println("intervalo entre 75 e 100 ");
		}
		else {
			System.out.printf("Fora de intervalo");
		}

				
		sc.close();
		}

}
