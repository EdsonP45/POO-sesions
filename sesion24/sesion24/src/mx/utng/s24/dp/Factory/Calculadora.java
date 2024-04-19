package mx.utng.s24.dp.Factory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {

    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JLabel lblResultado;

    public Calculadora() {
        super("Calculadora Simple");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel lblNumero1 = new JLabel("Número 1: ");
        JLabel lblNumero2 = new JLabel("Número 2: ");

        txtNumero1 = new JTextField();
        txtNumero2 = new JTextField();

        JButton btnSumar = new JButton("Sumar");

        lblResultado = new JLabel("Resultado: ");

        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumar();
            }
        });

        panel.add(lblNumero1);
        panel.add(txtNumero1);
        panel.add(lblNumero2);
        panel.add(txtNumero2);
        panel.add(btnSumar);
        panel.add(lblResultado);

        add(panel);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void sumar() {
        try {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());
            double resultado = numero1 + numero2;
            lblResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            lblResultado.setText("Resultado: Error");
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
