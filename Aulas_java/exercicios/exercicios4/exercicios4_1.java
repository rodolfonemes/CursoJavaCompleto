package exercicios4;

import java.util.Scanner;

public class exercicios4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite  um valor");
		int x = sc.nextInt();
	 if (1 <= x && x <= 1000){
		for (int i = 1; i <=x ; i++) {
		 if (i % 2 == 1) {
		 System.out.println(i);
		 }
		 }
		 
		sc.close();
		
	}
	 System.out.println("FIM");
	}
}
