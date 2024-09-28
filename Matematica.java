import java.util.Scanner;


public class Matematica {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

            System.out.println("Insira o coeficiente a: ");
            double a = entrada.nextDouble();

                System.out.println("Insira o coeficiente b: ");
                double b = entrada.nextDouble();

                    System.out.println("Insira o coeficiente c: ");
                    double c = entrada.nextDouble();

                        double delta = b * b - 4 * a * c;

                            if(delta > 0){
                                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

                                    System.out.println("As raízes são x' = " + raiz1 + " e x'' = " + raiz2);
                            }else if (delta == 0){

                                    double raizUnica = -b / (2 * a);
                                        System.out.println("A raiz única é x= " + raizUnica);
                            }else{
                                System.out.println("A equação não possui raizes reias.");
                            }
    }
    
}
