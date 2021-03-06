package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;

public class Program {

	public static void main(String[] args) {
		
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
             
        Account acc;
        
        System.out.print("Enter account number: "); 
        int numAccount = sc.nextInt();

        System.out.print("Enter account holder: "); 
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there deposit value (y/n)? "); 
        char response = sc.next().charAt(0);

        if (response == 'y') {

            System.out.print("Enter initial deposit value: ");
            
            double initialDeposit = sc.nextDouble();
            
            acc = new Account(numAccount, holder, initialDeposit);
            
        } else {
        	
        	acc = new Account(numAccount, holder);        	
        	
        }
        
        System.out.println("");
        System.out.println("Account data:");        
        System.out.println(acc);
        System.out.println("");
        
        System.out.print("Enter a deposit value: ");
        acc.deposit(sc.nextDouble());
   
        System.out.println("Update account data:");  
        System.out.println(acc);

        System.out.println("");
        
        System.out.print("Enter a withdraw value: ");        
        acc.withdraw(sc.nextDouble());         
        System.out.println("Update account data:");
        System.out.println(acc);


        sc.close();

	}

}
