package exercicios1;


import java.util.Scanner;

public class exercicio1_4 {

	public static void main(String[] args) {
		
		int numero, horas;
		Double valorHoras, salario;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o numero do Funcionario ");
		numero = entrada.nextInt();
		System.out.print("Digite a quantidade de horas trabalhadas ");
		horas = entrada.nextInt();
		System.out.print("Digite o valor por hora do funcionario ");
		valorHoras = entrada.nextDouble();
		
		salario = horas * valorHoras;
		
		System.out.println("Numero " + numero);
		System.out.printf("Salario R$ %.2f %n", salario);
		entrada.close();
	}

}
