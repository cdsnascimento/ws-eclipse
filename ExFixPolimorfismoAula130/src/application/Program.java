package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numProducts;
		char typeProduct;
		String name;
		Double price;
		Double customsFee;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Date manufactureDate;
		
		System.out.print("Enter the number of products: ");
		numProducts = sc.nextInt();
		
		List<Product> product = new ArrayList<Product>();
		
		for (int j = 1; j <= numProducts; j++) {
			
			System.out.printf("Product #%d data:", j);

			System.out.print("Common, used or imported (c/u/i)? ");
			typeProduct = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			
			System.out.print("Price: ");
			price = sc.nextDouble();
			
			switch (typeProduct) {
			case 'i':
				System.out.print("Customs fee: ");
				customsFee = sc.nextDouble();
				Product i = new ImportedProduct(name, price, customsFee);
				product.add(i);
				break;
			case 'c':
				Product c = new Product(name, price);
				product.add(c);
				break;
			case 'u':
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				manufactureDate = sdf.parse(sc.next());
				Product u = new UsedProduct(name, price, manufactureDate);
				product.add(u);
				break;
			}
			
		}

		System.out.println("");
		System.out.println("PRICE TAG");
		
		for (Product p: product) {
			
			System.out.println(p.priceTag());
			
		}
		
		sc.close();
		
	}

}
