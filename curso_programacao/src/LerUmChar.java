import java.util.Locale;
import java.util.Scanner;

public class LerUmChar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		char x;
		
		System.out.println("Digite um caracter.");
		
		x = sc.next().charAt(0);
		
		System.out.println("Voc� digitou o caracter: " + x);
		
		
		sc.close();

	}

}