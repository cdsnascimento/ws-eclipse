package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;

public class Program {
    
    public static void main(String[] args) {
        
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numAccount;
        String holder;
        double balance;
        char initialDeposit;
        
        System.out.print("Enter account number: "); 
        numAccount = sc.nextInt();

        System.out.print("Enter account holder: "); 
        holder = sc.nextLine();

        System.out.print("Is there deposit value: "); 
        initialDeposit = sc.next();

        Account acc = new Account(accountNumber, accountHolder)

        if (inicialDeposit == "y") {

            System.out.print("Enter initial deposit value: ");
            
             
            
        }


        sc.close();
    }
    
}
