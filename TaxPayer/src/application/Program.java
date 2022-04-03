package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = entrada.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.print("Tax payer #"+ i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char type = entrada.next().charAt(0);
			System.out.print("Name: ");
			entrada.nextLine();
			String name = entrada.nextLine();
			System.out.print("Anual income: ");
			double income = entrada.nextDouble();
			if(type == 'i') {
				System.out.println("Health expenditures: ");
				Double healthExpenditures  = entrada.nextDouble();
				list.add(new Individual(name, income, healthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = entrada.nextInt();
				list.add(new Company(name, income, numberOfEmployees));
			}
			
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		entrada.close();

	}

}
