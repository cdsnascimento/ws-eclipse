import java.util.Locale;
import java.util.Scanner;

public class LerDouble {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		System.out.println("Digite um n�mero.");
		
		x = sc.nextDouble();
		
		//System.out.println("Voc� digitou o n�mero: " + x);
		
		System.out.printf("Voc� digitou o n�mero %.2f%n", x);
		
		sc.close();

	}

}
