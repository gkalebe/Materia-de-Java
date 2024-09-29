import javax.swing.JOptionPane;

public class Bhaskara {
    public static void main(String[] args){
        double a = Double.parseDouble(JOptionPane.showInputDialog("Informe o coeficiente a: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Informe o coeficiente b: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Informe o coeficiente c:"));

            double delta = b * b - 4 * a * c;

                String mensagem;

                    if(delta > 0){
                        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

                            mensagem = "As raizes são x' = " + raiz1 + " e x'' = " + raiz2;
            
                                }else{
                                    mensagem = "A equação não possui raízes reais.";
                                }
                                        JOptionPane.showMessageDialog(null, mensagem);
    }
}
