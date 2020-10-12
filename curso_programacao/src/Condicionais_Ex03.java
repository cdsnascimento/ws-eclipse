import java.util.Locale;
import java.util.Scanner;

public class Condicionais_Ex03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Informe a hora de inicial: ");
		horaInicial = sc.nextInt();		
		
		System.out.println("Informe a hora final: ");
		horaFinal = sc.nextInt();

		if (horaFinal <= horaInicial) {
			
			horaFinal = horaFinal + 24;
			
		}
		
		
		duracao = horaFinal - horaInicial;
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);		
		
		sc.close();
		
	}

}
