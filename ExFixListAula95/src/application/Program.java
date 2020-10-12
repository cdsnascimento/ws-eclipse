package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int numEmployee = sc.nextInt();
		
		int id;
		String name;
		double salary;
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < numEmployee; i++) {
			
			sc.nextLine();
			System.out.println("Emplyoee #" + (i + 1) + ":");
			
			System.out.print("Id: ");
			id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}			
			
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			
			System.out.println("");
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			
		}
		
		System.out.println("");
		
		System.out.print("Enter the employee id that will have salary increase : ");
		
		int idSearch = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idSearch).findFirst().orElse(null);
		
		if (emp == null) {
			
			System.out.println("This id does not exist!");
			
		} else {
			
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			
		}
		

		System.out.println("");
		
		System.out.println("List of employees:");
		
		for ( Object e : list ) {
			
			System.out.println(e);
			
		}
		

		sc.close();
		
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
