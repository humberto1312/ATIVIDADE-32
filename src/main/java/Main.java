import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        String fatorialTexto = numero + "! = ";

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            fatorialTexto += i;

            if (i != 1) {
                fatorialTexto += " . ";
            }
        }

        fatorialTexto += " = " + fatorial;
        System.out.println(fatorialTexto);

        scanner.close();
    }
}
