package exercicios1;


import java.util.Locale;
import java.util.Scanner;

public class exercicio1_2 {

	public static void main(String[] args) {
		double pi, raio, area;
		//Locale.setDefault(Locale.US);
		pi = 3.14159;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o raio ");
		raio = entrada.nextDouble();
		area = pi * (raio*raio);
		System.out.printf("A area e de %.4f" , area);
		entrada.close();
	}

}
