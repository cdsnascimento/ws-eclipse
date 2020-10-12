import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2, numPecas1, numPecas2;
		float valorPeca1, valorPeca2, valorTotal;
		
		System.out.println("Informa o codigo da Peca 1: ");
		codPeca1 = sc.nextInt();
		
		System.out.println("Informa o total da Peca 1: ");
		numPecas1 = sc.nextInt();
		
		System.out.println("Informa o valor unitario da Peca 1: ");
		valorPeca1 = sc.nextFloat();
		
		System.out.println("Informa o codigo da Peca 2: ");
		codPeca2 = sc.nextInt();
		
		System.out.println("Informa o total da Peca 2: ");
		numPecas2 = sc.nextInt();
		
		System.out.println("Informa o valor unitario da Peca 2: ");
		valorPeca2 = sc.nextFloat();
		
		
		valorTotal = (numPecas1 * valorPeca1 + numPecas2 * valorPeca2);
		System.out.printf("Valor Total a pagar: %.2f%n", valorTotal);
		
		
		sc.close();
		
	}

}
