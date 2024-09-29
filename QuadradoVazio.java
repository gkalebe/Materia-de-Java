import java.util.Scanner;

public class QuadradoVazio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o tamanho do lado do quadrado (1 a 20): ");
        int tamanho = entrada.nextInt();

            if (tamanho < 1 || tamanho > 20) {
                System.out.println("Tamanho inválido.");
            } else {
                for (int i = 0; i < tamanho; i++) {

                    for (int j = 0; j < tamanho; j++) {

                        if (i == 0 || i == tamanho - 1 || j == 0 || j == tamanho - 1) {
                          System.out.print("*");
                          
                                } else {
                                 System.out.print(" ");
                    }
                }
                                    System.out.println();
            }
        }
    }
}
