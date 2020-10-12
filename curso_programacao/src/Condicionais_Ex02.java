import java.util.Locale;
import java.util.Scanner;

public class Condicionais_Ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Informe um número: ");
		A = sc.nextInt();		
		
		System.out.println("Informe um número: ");
		B = sc.nextInt();
		
		if (A % B == 0) {
			
			System.out.println("SAO MULTIPLOS");	
			
		} else {
			
			System.out.println("NAO SAO MULTIPLOS");
			
		}
		
		sc.close();
		
	}

}
