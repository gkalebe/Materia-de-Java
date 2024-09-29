import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número não negativo: ");
        int n = entrada.nextInt();

            if (n < 0) {
                System.out.println("Número inválido.");

            } else {
                    long fatorial = 1;
                    for (int i = 1; i <= n; i++) {
                        fatorial *= i;
                    }
                        System.out.printf("%d! = %d%n", n, fatorial);
            }
    }
}
