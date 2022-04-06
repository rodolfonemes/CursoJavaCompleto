package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessExceptions;

public class Program {

	public static void main(String[] args) throws BusinessExceptions {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = entrada.nextInt();
		System.out.print("Holder:");
		String holder = entrada.next();
		System.out.print("Initial balance: ");
		double initialBalance = entrada.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = entrada.nextDouble();

		Account acc = new Account(number, holder, initialBalance, withdrawLimit);

		System.out.println("Balance: " + acc.getBalance());

		System.out.print("Enter amount for withdraw: ");
		double withdraw = entrada.nextDouble();

		try {
			acc.withdraw(withdraw);

			System.out.println("New balance: " + acc.getBalance());
		} catch (BusinessExceptions e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		entrada.close();

	}

}