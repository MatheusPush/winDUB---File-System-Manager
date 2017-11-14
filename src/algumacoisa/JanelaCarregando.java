package algumacoisa;

import javax.swing.JFrame;
import javax.swing.JLabel;
import algumacoisa.Winpiva;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author Havenking
 */
public class JanelaCarregando extends Thread {

    @Override
    public void run() {
        JFrame frame = new JFrame("Carregando Arquivo");
        JLabel label = new JLabel("Carregando", JLabel.CENTER);
        frame.add(label);
        frame.setLocationRelativeTo(null);
        frame.setSize(200, 100); // width=350, height=200
        label.paintImmediately(label.getVisibleRect());
        //frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        int i = 1;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        while (Winpiva.controle != 1) {
            if (i == 1) {
                label.setText("Carregando.");
            }
            if (i == 2) {
                label.setText("Carregando..");
            }
            if (i == 3) {
                label.setText("Carregando...");
                i = 0;
            }
            i++;
            label.paintImmediately(label.getVisibleRect());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        frame.setVisible(false);
        frame.dispose();
    }
}
