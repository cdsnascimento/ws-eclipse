import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario;
		float numHoras, valorHora, salario;
		
		System.out.println("Informe o número que representa o funcionário.");
		numFuncionario = sc.nextInt();
		
		System.out.println("Informe o total de horas trabalhadas.");
		numHoras = sc.nextFloat();
		
		System.out.println("Informe agora, o valor da hora trabalhada");
		valorHora = sc.nextFloat();
		
		salario = (numHoras * valorHora);
		
		System.out.printf("O funcionario %d, trabalhou %.1f horas e receberá como o salário o valor de U$ %.2f. ", numFuncionario, numHoras, salario);
		
		
		sc.close();

	}

}
