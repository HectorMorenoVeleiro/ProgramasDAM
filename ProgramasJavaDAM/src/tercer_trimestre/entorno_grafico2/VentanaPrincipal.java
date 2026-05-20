package tercer_trimestre.entorno_grafico2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame {

    private JTextField[] camposNotas;
    private JLabel lblPromedio;
    private JLabel lblDesviacion;
    private JLabel lblMayor;
    private JLabel lblMenor;
    private Notas notas;

    public VentanaPrincipal() {
        notas = new Notas();
        initComponents();
    }

    private void initComponents() {
        setTitle("Notas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        camposNotas = new JTextField[5];
        for (int i = 0; i < 5; i++) {
            JPanel fila = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 3));
            JLabel lbl = new JLabel("Nota " + (i + 1) + ":");
            lbl.setPreferredSize(new Dimension(60, 20));
            camposNotas[i] = new JTextField(10);
            fila.add(lbl);
            fila.add(camposNotas[i]);
            panelPrincipal.add(fila);
        }

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 8));
        JButton btnCalcular = new JButton("Calcular");
        JButton btnLimpiar = new JButton("Limpiar");

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });

        panelBotones.add(btnCalcular);
        panelBotones.add(btnLimpiar);
        panelPrincipal.add(panelBotones);

        JPanel panelResultados = new JPanel();
        panelResultados.setLayout(new BoxLayout(panelResultados, BoxLayout.Y_AXIS));
        panelResultados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        lblPromedio = new JLabel(" ");
        lblDesviacion = new JLabel(" ");
        lblMayor = new JLabel(" ");
        lblMenor = new JLabel(" ");

        panelResultados.add(lblPromedio);
        panelResultados.add(Box.createVerticalStrut(5));
        panelResultados.add(lblDesviacion);
        panelResultados.add(Box.createVerticalStrut(5));
        panelResultados.add(lblMayor);
        panelResultados.add(Box.createVerticalStrut(5));
        panelResultados.add(lblMenor);

        panelPrincipal.add(panelResultados);

        add(panelPrincipal);
        pack();
        setLocationRelativeTo(null);
    }

    private void calcular() {
        try {
            for (int i = 0; i < 5; i++) {
                String texto = camposNotas[i].getText().trim();
                if (texto.isEmpty()) {
                    JOptionPane.showMessageDialog(this,
                            "Por favor ingrese la Nota " + (i + 1),
                            "Campo vacío", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                notas.listaNotas[i] = Double.parseDouble(texto);
            }
            lblPromedio.setText(String.format("Promedio = %.2f", notas.calcularPromedio()));
            lblDesviacion.setText(String.format("Desviación estándar = %.2f", notas.calcularDesviacion()));
            lblMayor.setText(String.format("Valor mayor = %.1f", notas.calcularMayor()));
            lblMenor.setText(String.format("Valor menor = %.1f", notas.calcularMenor()));

            pack();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Ingrese solo valores numéricos.",
                    "Error de formato", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiar() {
        for (JTextField campo : camposNotas) {
            campo.setText("");
        }
        notas.listaNotas = new double[5];
        lblPromedio.setText(" ");
        lblDesviacion.setText(" ");
        lblMayor.setText(" ");
        lblMenor.setText(" ");
        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
}