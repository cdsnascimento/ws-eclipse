import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, area, pi;
		
		pi = 3.14159;
		
		System.out.println("Informa um valor para A: ");
		A  = sc.nextDouble();
		
		System.out.println("Informa um valor para B: ");
		B  = sc.nextDouble();
		
		System.out.println("Informa um valor para C: ");
		C  = sc.nextDouble();
		
		area = A * C / 2;
		System.out.printf("A �rea do tri�ngulo ret�ngulo que tem %.2f por base e %.2f por altura �: %.3f%n", A, C, area);
		
		area = pi * Math.pow(C, 2);
		System.out.printf("A �rea do circulo de raio %.2f �: %.3f%n", C, area);
		
		area = (A + B) * C / 2;
		System.out.printf("A �rea do trap�zio que tem %.2f e %.2f por base e %.2f por altura �: %.3f%n", A, B, C, area);
		
		area = Math.pow(B, 2);
		System.out.printf("A �rea do quadrado que tem lado %.2f �: %.3f%n", B, area);
		
		area = A * B;
		System.out.printf("A �rea do ret�ngulo que tem lados %.2f e %.2f �: %.3f%n", A, B, area);
		
		
		sc.close();

	}

}
