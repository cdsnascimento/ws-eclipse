import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		
		double x = 10.35784;
		
		String nome = "Maria";
		
		int idade = 31;
		
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n" , nome, idade, renda);
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.print("Olá mundo!");// o comando print, não executa uma quebra de pagina
		System.out.println("Bom dia!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", x);
		System.out.println("RESULTADO = " + x  + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);

	}

}
