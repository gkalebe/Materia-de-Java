import java.util.Scanner;


public class Tempo {
    public static void main(String[] agrs){
        Scanner entrada = new Scanner(System.in);

            System.out.println("Insira a quantidade de segundos: ");
            int totalSegundos = entrada.nextInt();

                int dias = totalSegundos / 86400;
                totalSegundos %= 86400;
                int horas = totalSegundos / 3600;
                totalSegundos %= 3600;
                int minutos = totalSegundos / 60;
                int segundos = totalSegundos % 60;

                    System.out.println(dias + "dias," +horas+ "horas," + minutos + "minutos," + segundos + "segundos");
    }
    
}
