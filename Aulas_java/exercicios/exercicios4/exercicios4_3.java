package exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class exercicios4_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("digite a quantida de contas vc far?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Digite o 1? numero");
			double a = sc.nextDouble();
			System.out.println("Digite o 2? numero");
			double b = sc.nextDouble();
			System.out.println("Digite o 3? numero");
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("a media ? %.1f%n", media);
		}
		
		sc.close();
	}
	
}
