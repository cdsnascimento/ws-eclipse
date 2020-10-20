package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numPayers;
		char typePayer;
		String name;
		Double anuallncome;
		Double healthExpenditures;
		int numberOfEmployees;
		Double sum = 0.0;
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		numPayers = sc.nextInt();
		
		for (int i = 1; i <= numPayers; i++) {
			
			System.out.printf("Tax payer #%d data:", i);
			System.out.println();
			
			System.out.print("Individual or company (i/c)? ");
			typePayer = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Name: ");
			name = sc.nextLine();
			
			System.out.print("Anual income: ");
			anuallncome = sc.nextDouble();
			
			switch (typePayer) {
			
			case 'i':
				System.out.print("Health expenditures: ");
				healthExpenditures = sc.nextDouble();
				
				TaxPayer ind = new Individual(name, anuallncome, healthExpenditures);
				list.add(ind);
				
				break;
				
			case 'c':
				System.out.print("Number of employees: ");
				numberOfEmployees = sc.nextInt();
				
				TaxPayer com = new Company(name, anuallncome, numberOfEmployees);
				list.add(com);

				break;
			
			}
			
		}
		
		
		
		
		System.out.println("");
		System.out.println("TAXES PAID:");
		
		for (TaxPayer t : list) {
			
			System.out.print(t.getName() + " : $ " + String.format("%.2f%n", t.tax()));
			sum += t.tax();
		}
		
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		sc.close();

	}

}
