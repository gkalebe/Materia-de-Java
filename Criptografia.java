import java.util.Scanner;


    public class Criptografia {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Digite um número de 4 dígitos: ");
            int numero = entrada.nextInt();
            
                int[] digitos = new int[4];

                    for(int i = 3; i >= 0; i--){
                        digitos[i] = numero % 10;
                        numero /= 10;
                    }

                        for(int i = 0; i < 4; i++){
                            digitos[i] = (digitos[i] + 7) % 10;
                        }

                            int temp = digitos[0];
                            digitos[0] = digitos[2];
                            digitos[2] = temp;

                                temp = digitos[1];
                                digitos[1] = digitos[3];
                                digitos[3] = temp;

                                    int numeroCriptografado = 0;

                                        for(int i = 0; i < 4; i++){
                                            numeroCriptografado = numeroCriptografado * 10 + digitos[i];
                                        }

                                            System.out.printf("Número criptografado: %04d%n", numeroCriptografado);
        }
    }