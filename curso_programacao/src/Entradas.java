import java.util.Scanner;

public class Entradas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		System.out.println("Digite uma palavra.");
		
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		sc.close();
		


	}

}
