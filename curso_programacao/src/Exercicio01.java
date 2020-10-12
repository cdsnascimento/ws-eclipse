import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1, valor2, soma; 

		System.out.println("Digite um valor inteiro: ");
		valor1 = sc.nextInt();

		System.out.println("Digite outro valor inteiro: ");
		valor2 = sc.nextInt();


		soma = valor1 + valor2;

		System.out.printf("A soma entre %d e %d é igual a %d%n", valor1, valor2, soma);
		
		sc.close();

	}

}
