package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.regras;

public class programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.print("digite a quantida de funcinarios para cadastrar: ");
		int n = entrada.nextInt();
		List<regras> func = new ArrayList<>();

		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + ": ");
		
		System.out.print("digite o ID do funcionario: ");
		int id = entrada.nextInt();

		while (hasId(func, id)) {
			System.out.print("Id existente digite novamente: ");
			id = entrada.nextInt();
		}

		System.out.print("digite o nome do funcionario: ");
		String nome = entrada.next();

		System.out.print("digite o salario do funcionario: ");
		Double salario = entrada.nextDouble();

		func.add(new regras(id, nome, salario));

		}
		System.out.println();
		System.out.print("digite o numero do ID para receber um aumento: ");
		int id = entrada.nextInt();
		
		regras ids = func.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (ids == null) {
			System.out.println();
			System.out.println("Este ID n?o existe!");
		}
		else {
			System.out.print("Digite o % de aumento: ");
			double percentual = entrada.nextDouble();
			ids.aumentoDeSalario(percentual);
		}
		
		
		
		System.out.println();
		System.out.println("Lista de funcionarios:");
		for (regras obj : func) {
			System.out.println(obj);
		}
		entrada.close();

	}

	public static boolean hasId(List<regras> list, int id) {
		regras emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
