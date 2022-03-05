package exercicios1;


import java.util.Scanner;

public class exercicio1_5 {

	public static void main(String[] args) {
		int cod1, cod2, quant1, quant2;
		double valor1, valor2, total;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o codigo do 1º produto ");
		cod1 = entrada.nextInt();
		System.out.print("Digite a quantidade do 1º produto ");
		quant1= entrada.nextInt();
		System.out.print("Digite o valor unitario do 1º produto ");
		valor1 = entrada.nextDouble();
		
		System.out.print("Digite o codigo do 2º produto ");
		cod2 = entrada.nextInt();
		System.out.print("Digite a quantidade do 2º produto ");
		quant2 = entrada.nextInt();
		System.out.print("Digite o valor unitario do 2º produto ");
		valor2= entrada.nextDouble();
		
		total = (quant1*valor1)+(quant2*valor2);
		System.out.printf("Valor a pagar R$ %.2f", total);
		entrada.close();
	}

}
