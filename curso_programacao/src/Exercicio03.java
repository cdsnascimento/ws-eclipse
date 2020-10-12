import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		
		System.out.println("Informe 4 valores inteiros.");
		System.out.println("Primeiro:");
		A = sc.nextInt();
		
		System.out.println("Segundo:");
		B = sc.nextInt();
		
		System.out.println("Terceiro:");
		C = sc.nextInt();
		
		System.out.println("Quarto:");
		D = sc.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.printf("A diferença entre os produtos de %d e %d pelo produto de %d e %d é igual a %d", A, B, C, D, diferenca);
		
		
		sc.close();

	}

}
