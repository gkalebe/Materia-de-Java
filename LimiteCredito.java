import java.nio.file.SecureDirectoryStream;
import java.util.Scanner;

public class LimiteCredito {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

            System.out.print("Número da conta: ");
            int numeroConta = entrada.nextInt();

                System.out.print("Saldo inicial: ");
                int saldoInicial = entrada.nextInt();

                    System.out.print("Total de despesas no mês: ");
                    int despesas = entrada.nextInt();

                        System.out.print("Total de créditos aplicados no mês: ");
                        int creditos = entrada.nextInt();

                            System.out.print("Limite de crédito autorizado: ");
                            int LimiteCredito = entrada.nextInt();

                                int novoSaldo = saldoInicial + despesas - creditos;
                                System.out.printf("Novo saldo: %d%n", novoSaldo);

                                    if(novoSaldo > LimiteCredito){
                                        System.out.println("Limite de crédito excedido.");
                                    }

    }
}
