import java.util.Scanner;

public class Descriptografia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número criptografado de 4 dígitos: ");
        int numero = entrada.nextInt();
        
            int[] digitos = new int[4];
            
                for(int i = 3; i >= 0; i--){
                    digitos[i] = numero % 10;
                    numero /= 10;
                }

                    int temp = digitos[0];
                    digitos[0] = digitos[2];
                    digitos[2] = temp;

                        temp = digitos[1];
                        digitos[1] = digitos[3];
                        digitos[3] = temp;

                            for(int i = 0; i < 4; i++){
                                digitos[i] = (digitos[i] + 10 - 7) % 10;
                            }

                                int numeroDescriptografado = 0;
                                    for(int i = 0; i < 4; i++){
                                        numeroDescriptografado = numeroDescriptografado * 10 + digitos[i];
                                    }

                                        System.out.printf("Número descriptografado: %04d%n", numeroDescriptografado);
    }
}
