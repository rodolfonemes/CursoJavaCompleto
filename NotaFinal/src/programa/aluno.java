package programa;

import java.util.Scanner;

import entidades.calculoMedia;


public class aluno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
calculoMedia calc = new calculoMedia();
		
		System.out.print("digite nome do aluno ");
		calc.setName(entrada.next());
		System.out.print("digite a nota 1 ");
		calc.setNota1(entrada.nextDouble());
		System.out.print("digite a nota 2 ");
		calc.setNota2(entrada.nextDouble());
		System.out.print("digite a nota 3 ");
		calc.setNota3(entrada.nextDouble());
		
		System.out.printf("Nota Final = %.2f\n" , calc.media());
		
		if(calc.media() >= 60) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
			System.out.printf("Faltaram %.2f pontos" , calc.notaFinal());
		}
		
		
		entrada.close();

	}

}
