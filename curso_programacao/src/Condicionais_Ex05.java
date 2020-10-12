import java.util.Locale;
import java.util.Scanner;

public class Condicionais_Ex05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cod01, cod02, valor01, valor02, total;
		 
		
		System.out.println("Informe o codigo do primeiro produto: ");
		cod01 = sc.nextInt();		
		
		System.out.println("Informe o codigo do segundo produto: ");
		cod02 = sc.nextInt();

		if (cod01 == 1) {
			
			valor01 = 4.00;
			
		}else if (cod01 == 2) {
			
			valor01 = 4.50;
			
		}else if (cod01 == 3) {
			
			valor01 = 5.00;
			
		}else if (cod01 == 4) {
			
			valor01 = 2.00;
			
		}else {
			
			valor01 = 1.50;
			
		}
		
		
		if (cod02 == 1) {
			
			valor02 = 4.00;
			
		}else if (cod02 == 2) {
			
			valor02 = 4.50;
			
		}else if (cod02 == 3) {
			
			valor02 = 5.00;
			
		}else if (cod02 == 4) {
			
			valor02 = 2.00;
			
		}else {
			
			valor02 = 1.50;
			
		}
		
		
		total = (valor01 + valor02);
		
		System.out.printf("Total: R$ %.2f", total);		
		
		sc.close();
		
	}

}
