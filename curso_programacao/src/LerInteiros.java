import java.util.Scanner;

public class LerInteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um número.");
		
		x=sc.nextInt();
		
		System.out.println("Você digitou o número: " + x);
		
		sc.close();
		
	}

}
