import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));

            int soma = numero1 + numero2;
            int produto = numero1 * numero2;
            int diferenca = numero1 - numero2;
            double divisao = (double) numero1 / numero2;

                JOptionPane.showMessageDialog(null, "Soma:" + soma + "\nProduto:" + produto + "\nDiferença:" + diferenca + "\nDvisão:" +divisao);
    }    
}
