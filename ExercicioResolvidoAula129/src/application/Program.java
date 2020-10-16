package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		
		int numEmployee = sc.nextInt();
		char c;
		Double additionalCharge;
		String name;
		Integer hours;
		Double valuePerHour;
		
		List<Employee> employee = new ArrayList<Employee>();
		
		
		
		for (int i = 1; i <= numEmployee; i++) {
			
			System.out.printf("Employee #%d data:", i);
			System.out.println("");
			System.out.print("Outsourced (y/n)? ");
			c = sc.next().charAt(0);
						
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			
			System.out.print("Hours: ");
			hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			valuePerHour = sc.nextDouble();
			
			if (c == 'y') {
				
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();
				Employee o = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employee.add(o);
				
			} else {
				
				Employee e = new Employee(name, hours, valuePerHour);
				employee.add(e);
				
			}
			
		}
		
		System.out.println("");
		
		System.out.println("PAYMENTS:");
		
		for (Object e: employee) {
			
			System.out.println(e);
			
		}
		
		sc.close();

	}

}
