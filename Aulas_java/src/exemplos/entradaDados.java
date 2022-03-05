package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {

		/*
		Scanner
		• next()
		• nextInt()
		• nextDouble()
		• next().charAt(0)
		 Locale
		 Como ler até a quebra de linha
		• nextLine()
		*/
		
		String nome;
		int idade;
		Float altura;
		char sexo;
		
		//Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("digite seu nome: ");
		nome = entrada.next();
		System.out.print("digite sua idade: ");
		idade = entrada.nextInt();
		System.out.print("digite sua altura: ");
		altura = entrada.nextFloat();
		System.out.print("digite seu sexo(M ou F): ");
		sexo = entrada.next().charAt(0);

		System.out.printf("Ola %s sua idade é %d anos, sua altura é %.2f e voce é do sexo %s %n", nome, idade, altura,
				sexo);
		entrada.close();
	}

}
