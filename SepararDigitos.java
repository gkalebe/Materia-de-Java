import javax.swing.JOptionPane;

public class SepararDigitos {
    public static void main (String[] agrs){
        String numero = JOptionPane.showInputDialog("Digte um número de 5 dígitos: ");

            if(numero.length() == 5 && numero.matches("\\d{5}")){
                String resultado = numero.charAt(0) + " " + 
                    numero.charAt(1) + " " +
                    numero.charAt(2) + " " +
                    numero.charAt(3) + " " +
                    numero.charAt(4);

                        JOptionPane.showMessageDialog(null, resultado);
            }else{
                JOptionPane.showMessageDialog(null,"Por favor insira um número válido de 5 dígitos: ");
            }
    }
    
}
