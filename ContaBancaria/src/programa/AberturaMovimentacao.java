package programa;

import java.util.Scanner;

import entidades.Conta;

public class AberturaMovimentacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Conta  C1;
		
		
		System.out.print("Informe o nome do Cliente ");
		String nome = entrada.nextLine();
		
		System.out.print("Informe o numero da conta: ");
		int conta = entrada.nextInt();
		
		System.out.print("Possui deposito inicial s/n: ");
		char resposta = entrada.next().charAt(0);
		if(resposta == 's') {
			System.out.print("Informe o valor a ser depositado: ");
			double valor = entrada.nextDouble();
			C1 = new Conta(conta, nome, valor);
			
		}else {
			C1 = new Conta(conta, nome);
		}
		
		System.out.println(C1);
		
		System.out.println();
		System.out.print("Digite o valor do depoisto: ");
		double valor = entrada.nextDouble();
		C1.deposito(valor);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(C1);
		
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		valor = entrada.nextDouble();
		C1.saque(valor);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(C1);
	
		
		entrada.close();

	}

}
