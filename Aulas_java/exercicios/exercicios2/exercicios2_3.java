package exercicios2;

import java.util.Scanner;

public class exercicios2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
		
		
		/*
		int a, b;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero ");

		a = entrada.nextInt();

		System.out.println("Digite outro numero ");

		b = entrada.nextInt();

		if (a<b) {
			if(b%a == 0) {
				System.out.println("Multiplos");
			}else {
				System.out.println("Não Multiplos");
			}
			
		} else {
			if(a%b == 0) {
				System.out.println("Multiplos");
			}else {
				System.out.println("Não Multiplos");
			}
		}
*/
	}

}
