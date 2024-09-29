import java.util.Scanner;

public class Fatorial2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número não negativo: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido. Insira um número não negativo.");
        } else {
            long fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.printf("%d! = %d%n", numero, fatorial);
        }
    }
}
