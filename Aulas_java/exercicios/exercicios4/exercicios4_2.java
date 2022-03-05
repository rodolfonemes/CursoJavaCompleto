package exercicios4;

import java.util.Scanner;

public class exercicios4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite  a quantidade valores que vc ira digitar");
		int x = sc.nextInt();
		int n = 0;
		int in = 0;
		int out = 0;
				
	 	for (int i =1; i<=x ; i++) {
	 		System.out.println("digite o "+ i +" º valor");
	 		n = sc.nextInt();
	 		if(n >=10 && n<=20) {
	 			in++;
	 		}
	 		else {
	 			out++;
	 		}
	 	}
		sc.close();
		System.out.println("in:  "+ in);
		System.out.println("out: "+ out);
		
	
	 System.out.println("FIM");
	}
}
