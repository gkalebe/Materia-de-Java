import javax.swing.JOptionPane;
import java.util.Scanner;


public class Aplicativos{
    public static class ContaBancaria{
        private double saldo;
    }
    
        public ContaBancaria(double saldoInicial) {
            saldo = saldoInicial;
        }
        
            public void depositar(double valor){
                saldo += valor;
            }
            
                public double getSaldo(){
                    return saldo;
                }

                    public static void main(String[] args) {
                        Scanner entrada = new Scanner(System.in);

                            ContaBancaria conta = new ContaBancaria(0);

                                System.out.println("informe o valor a depositar: ");
                                double deposito = entrada.nextDouble();

                                    conta.depositar(deposito);

                                        System.out.println("Saldo atual: " + conta.getSaldo());
                    }
}