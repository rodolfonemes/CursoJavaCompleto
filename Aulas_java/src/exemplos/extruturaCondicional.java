package exemplos;

import java.util.Scanner;

public class extruturaCondicional {

	public static void main(String[] args) {
		int tempo;
		Scanner entrada = new Scanner(System.in);
		tempo = entrada.nextInt();
		if(tempo <=100) {
			System.out.println("sua conta e de R$ 50");
		}else {
			System.out.println("sua conta e de R$ " + ((tempo-100)*2 + 50));
		
		}

	}

}
