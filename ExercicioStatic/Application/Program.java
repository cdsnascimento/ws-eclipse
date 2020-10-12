package Application;

import java.util.Locale;
import java.util.Scanner;

import Util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the Dollar price? ");
		double priceDollar = sc.nextDouble();
		
		System.out.print("How many will be bought? ");
		double totalDollar = sc.nextDouble(); 
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.coverter(priceDollar, totalDollar));
		
		sc.close();
		
	}

}


