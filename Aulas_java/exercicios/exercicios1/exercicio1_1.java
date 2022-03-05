package exercicios1;


import java.util.Scanner;

public class exercicio1_1 {

	public static void main(String[] args) {
		int a, b, soma;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o 1º numero ");
		a = entrada.nextInt();
		System.out.print("Digite o 2º numero ");
		b = entrada.nextInt();
		soma = a + b;
		System.out.printf("A soma entre %d e %d é : %d", a, b, soma);
		entrada.close();
	}

}
