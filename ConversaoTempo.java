import javax.swing.JOptionPane;

public class ConversaoTempo {
    public static void main(String[] args) {
        int totalSegundos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de segundos: "));


                int dias = totalSegundos / 86400;
                totalSegundos %= 86400;
                int horas = totalSegundos / 3600;
                totalSegundos %= 3600;
                int minutos = totalSegundos / 60;
                int segundos = totalSegundos % 60;

                    String mensagem = dias + "dias," + horas + "horas," + minutos + "minutos," + segundos + "segundos";
                        JOptionPane.showMessageDialog(null, mensagem);
    }
}
