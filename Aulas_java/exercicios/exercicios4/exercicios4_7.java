package exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class exercicios4_7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("digite um numero");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print(i+" - ");
			System.out.print(i*i+" - ");
			System.out.println(i*i*i);
			
				}
		
		sc.close();
	}
	
}
