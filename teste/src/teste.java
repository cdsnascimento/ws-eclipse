import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("diga seu nome: ");

        String name = sc.nextLine();

        System.out.printf("olá %s", name);

        sc.close();

    }
}
