package exercicios1;


import java.util.Scanner;

public class exercicio1_3 {

	public static void main(String[] args) {
		int a, b, c, d, diferenca;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor de A ");
		a = entrada.nextInt();
		System.out.print("Digite o valor de B ");
		b = entrada.nextInt();
		System.out.print("Digite o valor de C ");
		c= entrada.nextInt();
		System.out.print("Digite o valor de D ");
		d = entrada.nextInt();
		diferenca = (a * b - c * d);
		System.out.printf("A diferença entre %d, %d, %d e %d, é : %d", a, b, c, d, diferenca);
		entrada.close();
	}

}
