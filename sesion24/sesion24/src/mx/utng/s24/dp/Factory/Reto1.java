package mx.utng.s24.dp.Factory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reto1 extends JFrame {

    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JLabel lblResultado;

    public Reto1() {
        super("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel lblNumero1 = new JLabel("Número 1: ");
        JLabel lblNumero2 = new JLabel("Número 2: ");

        txtNumero1 = new JTextField();
        txtNumero2 = new JTextField();

        JButton btnSuma = new JButton("Suma");
        JButton btnResta = new JButton("Resta");
        JButton btnMultiplicacion = new JButton("Multiplicación");
        JButton btnDivision = new JButton("División");

        lblResultado = new JLabel("Resultado: ");

        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular("+");
            }
        });

        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular("-");
            }
        });

        btnMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular("*");
            }
        });

        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular("/");
            }
        });

        panel.add(lblNumero1);
        panel.add(txtNumero1);
        panel.add(lblNumero2);
        panel.add(txtNumero2);
        panel.add(btnSuma);
        panel.add(btnResta);
        panel.add(btnMultiplicacion);
        panel.add(btnDivision);
        panel.add(lblResultado);

        add(panel);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Reto1();
    }

    private void calcular(String operador) {
        try {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            double resultado = 0;

            switch (operador) {
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        JOptionPane.showMessageDialog(this, "No se puede dividir por cero", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }

            lblResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese números válidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
