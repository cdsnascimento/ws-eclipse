package Util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double coverter(double dolarPrice, double totalDollars){
		
		return dolarPrice * totalDollars * (1 + IOF);
		
	}
	
}
