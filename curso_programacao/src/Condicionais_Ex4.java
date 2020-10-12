import java.util.Locale;
import java.util.Scanner;

public class Condicionais_Ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Informe um número: ");
		num = sc.nextInt();		

		if (num % 2 == 0) {
			
			System.out.printf("PAR");
			
		} else {
			
			System.out.println("IMPAR");
			
		}		
		
		sc.close();
		
	}

}
