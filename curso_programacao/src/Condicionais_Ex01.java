import java.util.Locale;
import java.util.Scanner;

public class Condicionais_Ex01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Informe um n�mero: ");
		num = sc.nextInt();
		
		if (num >= 0) {
			
			System.out.println("NAO NEGATIVO");	
			
		} else {
			
			System.out.println("NEGATIVO");
			
		}
		
		sc.close();
		
	}


}
