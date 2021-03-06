package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
				
		Rent[] vect = new Rent[10];
		
		for (int j=1; j <= n; j++) {
			
			sc.nextLine();
			System.out.println("Rent #" + j + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			vect[room] = new Rent(name, email, room);
						
		}
		
	
		System.out.println("Busy rooms:");
		
		for (int i=0; i < vect.length; i++) {
			
			if (vect[i] != null) {
				
				System.out.println(vect[i]);
				
			}
			
		}
		
		
		sc.close();

	}

}
