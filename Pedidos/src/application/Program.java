package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String name = entrada.nextLine();
		System.out.print("E-mail ");
		String email = entrada.next();
		System.out.print("Data de nascimento (dd/mm/aaaa) ");
		Date birthDate = sdf.parse(entrada.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		System.out.println("Entre com os dados do pedido");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(entrada.next());
		
		//public Order(Date moment, OrderStatus status, Client client)
		Order order = new Order(new Date(), status, client);
		
		
		System.out.print("Quantos itens tem na lista: ");
		int n = entrada.nextInt();
		System.out.println("");
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter com os dados do #" + i  + " item");
			System.out.print("Nome do produto: ");
			entrada.nextLine();
			String productName = entrada.nextLine();
			System.out.print("Preço  do Produto: ");
			double productPrice = entrada.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantidade: ");
			int quantity = entrada.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			
			order.addItem(orderItem);
		}
		
			System.out.println();
			System.out.println("Sumario do pedido:");
			System.out.println(order);
			
			
	}

}
