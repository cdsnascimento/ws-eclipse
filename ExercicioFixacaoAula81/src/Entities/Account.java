package Entities;

public class Account {

    
    private int accountNumber;
    private String accountHolder;
    private double balance;


    public Account(int accountNumber, String accountHolder) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit (double value){

        this.balance += value;

    }

    public void withdraw(double value){

        this.balance -= (value + 5.00);

    }

    //@Override
    public String toString() {
        return 
            "{" 
            + " Account: " 
            + this.getAccountNumber() 
            + ", " 
            + "Holder: " 
            + this.getAccountHolder() 
            + ", " 
            + "Balance: " 
            + this.getBalance() 
            +
            "}";
    }
	
}
