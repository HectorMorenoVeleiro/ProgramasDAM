
package ejercicioscuentapropia;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class AntiGordas extends JFrame {
    JFrame ventanaJPanel;
    JTextField pesoCampo;

    public void inicio() {
        setTitle("NIGGERS");
        setSize(400, 300);
        setLayout(null);

        JLabel nig = new JLabel("Hector come caca");
        nig.setBounds(40, 40, 140, 25);
        add(nig);

        JLabel labelPeso = new JLabel("Peso:");
        labelPeso.setBounds(40, 80, 50, 25);
        add(labelPeso);

        pesoCampo = new JTextField();
        pesoCampo.setBounds(100, 80, 150, 25);
        add(pesoCampo);

        pesoCampo.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                validarPeso();
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }
        });

        setVisible(true);
    }

    private void validarPeso() {
        try {
            String texto = pesoCampo.getText();
            if (!texto.isEmpty()) {
                double peso = Double.parseDouble(texto);
                if (peso > 70) {
                    JOptionPane.showMessageDialog(this, "GORDAAAAA", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            // Ignorar si no es un número válido
        }
    }

    public static void main(String[] args) {
        AntiGordas veAntiGordas = new AntiGordas();
        veAntiGordas.setVisible(true);
        veAntiGordas.inicio();
    }
}