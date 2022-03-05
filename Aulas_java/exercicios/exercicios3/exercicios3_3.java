package exercicios3;

import java.util.Scanner;

public class exercicios3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool =0;
		int gasolina =0;
		int diesel =0;
		
		System.out.println("Digite o valor de 1-4 ");
		System.out.println("1.Álcool "
				+ "2.Gasolina "
				+ "3.Diesel "
				+ "4.Fim");
		int x = sc.nextInt();
		
		
		while (x !=4) {
			switch(x){
			case 1:
				System.out.println("Voce escolheu Àlcool");
				alcool++;
				System.out.println("Digite o valor de 1-4 ");
				System.out.println("1.Álcool "
						+ "2.Gasolina "
						+ "3.Diesel "
						+ "4.Fim");
				x = sc.nextInt();
				break;
			case 2:
				System.out.println("Voce escolheu Gasolina");
				gasolina++;
				System.out.println("Digite o valor de 1-4 ");
				System.out.println("1.Álcool "
						+ "2.Gasolina "
						+ "3.Diesel "
						+ "4.Fim");
				x = sc.nextInt();
				break;
			case 3:
				System.out.println("Voce escolheu Diesel");
				diesel++;
				System.out.println("Digite o valor de 1-4 ");
				System.out.println("1.Álcool "
						+ "2.Gasolina "
						+ "3.Diesel "
						+ "4.Fim");
				x = sc.nextInt();
				break;
			
				default :
					System.out.println("Digite o valor de 1-4 ");
					System.out.println("1.Álcool "
							+ "2.Gasolina "
							+ "3.Diesel "
							+ "4.Fim");
					x = sc.nextInt();
					break;
				
			}
			
		}
		System.out.println("Muito Obrigado");
		System.out.println("Àlcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}
	
}
//1.Álcool 2.Gasolina 3.Diesel 4.Fim