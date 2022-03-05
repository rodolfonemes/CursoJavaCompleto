package exercicios2;

import java.util.Scanner;

public class exercicios2_1 {

	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um numero ");
		
		numero = entrada.nextInt();
		
		if(numero >= 0) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		
		}


	}

}
