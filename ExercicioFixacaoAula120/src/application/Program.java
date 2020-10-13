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
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		
		System.out.print("Name: ");
		String nameCli = sc.nextLine();
		
		System.out.print("Email: ");
		String emailCli = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthCli = sdf.parse(sc.next());
		
		Client cli = new Client(nameCli, emailCli, birthCli);
		
		System.out.println("Enter order data: ");
		
		System.out.print("Status: ");
		OrderStatus sts = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), sts, cli);
		
		System.out.println("");
		
		System.out.print("How many items to this order? ");
		
		Integer numItem = sc.nextInt();
		
		for (int i = 1; i <= numItem; i++) {
			
			System.out.printf("Enter #%d item data: ", i);
			System.out.println();
			
			System.out.print("Product name: ");
			String nameProd = sc.next();
			
			System.out.println();
			
			System.out.print("Product price: ");
			Double priceProd = sc.nextDouble();
			
			System.out.println();
			
			System.out.print("Quantity: ");
			Integer quantProd = sc.nextInt();
			
			Product p = new Product(nameProd, priceProd);
			
			OrderItem oI = new OrderItem(quantProd, priceProd, p);
			
			order.addItem(oI);
			
		}
		
		System.out.println();
		System.out.println(order);
		
		
		
		sc.close();
	}

}
