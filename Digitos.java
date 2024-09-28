import java.util.Scanner;


public class Digitos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

            System.out.println("Insira um número de 5 dígitos: ");
            String numero = entrada.next();

            if (numero.length() == 5 && numero.matches("\\d{5}")){
                System.out.println(numero.charAt(0) + "  " +
                        numero.charAt(1) + "   " +
                        numero.charAt(2) + "   " +
                        numero.charAt(3) + "   " +
                        numero.charAt(4));
                }else{
                    System.out.println("Por favor insira um número válido de 5 digitos.");
                }
    }
    
}
