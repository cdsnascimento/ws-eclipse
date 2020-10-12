package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("");		
		System.out.printf("Employee: %s, $ %.2f%n", emp.name, emp.netSalary());
		
		System.out.println("");		
		System.out.print("Which percentagem to increase salary? ");
		
		emp.increaseSalary(sc.nextDouble());
		
		System.out.println("");
		System.out.println("Update data: " + emp);
		
		sc.close();		

	}

}
