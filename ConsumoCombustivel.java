import java.util.Scanner;

public class ConsumoCombustivel{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int quilometros, litros;
        double totalkm = 0, totalLitros = 0;

            while(true){
                System.out.print("Digite a quilometragem dirigida (ou 2 para sair): ");
                quilometros = entrada.nextInt();

                    if(quilometros == 2){
                        break;
                    }
            }

                        System.out.print("Digite a quantiade de litros de combustível utilizados: ");
                        litros = entrada.nextInt();

                            double consumo = (double) quilometros / litros;
                            System.out.printf("Consumo dessa viagem: %.2f km/1%n", consumo);

                                totalkm += quilometros;
                                totalLitros += litros;

                                    if(totalLitros > 0){
                                        System.out.printf("Quilometragem total: %.2f km%n", totalkm);
                                        System.out.printf("Soma total de litros de combustível: %.2f litros%n", totalLitros);
                                        System.out.printf("Consumo médio total: %.2f km/1%n", totalkm / totalLitros);
                                    }
    }
}