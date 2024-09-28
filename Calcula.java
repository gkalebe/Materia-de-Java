import java.util.Scanner;

public class Calcula{

        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);

                System.out.println("Insira o primeiro número inteiro: ");
                int numero1 = entrada.nextInt();

                    System.out.println("Insisra o segundo número inteiro: ");
                    int numero2 = entrada.nextInt();

                        int soma = numero1 + numero2;
                        int produto = numero1 * numero2;
                        int diferenca = numero1 - numero2;
                        double divisao = (double) numero1 / numero2;

                            System.out.println("Soma: " + soma);
                            System.out.println("Produto: " + produto);
                            System.out.println("Diferença: " + diferenca);
                            System.out.println("Divisão: " + divisao);
        }
}