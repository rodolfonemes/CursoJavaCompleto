package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.regras;

public class programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.print("digite a quantida de quartas para cadastrar: ");
		int n = entrada.nextInt();
		regras[] quartos = new regras[10];

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Quarto #" + i + ":");
			System.out.print("digite o numero do quarto (0-9): ");
			int quarto = entrada.nextInt();
			System.out.print("digite o nome: ");
			String nome = entrada.next();
			System.out.print("digite o e-mail: ");
			String email = entrada.next();
			quartos[quarto] = new regras(nome, email);

		}

		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < 10; i++) {
			if (quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}

		entrada.close();

	}

}
