package mx.utng.s24.dp.Factory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Declaro una classe que crea JFrame (ventana basica)
public class Cliente extends JFrame {

//Declaro dos elementos de formulario
private JTextField txtUsuario;
private JPasswordField txtPassword;

//Creando los elementos de inicio de la ventana 
public Cliente() {

    //llamo al constructor de JFrame colocandole un tutulo
    super ("login");

    //pongo una operacion de cierre en el boton X
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    //coloco la dimensiones de ancho y alto
    setSize (300, 150);

    //Defino un contenedor de elementos visuales
    JPanel panel = new JPanel();

    //Al panel le doy un diseño 
    panel.setLayout(new GridLayout(3, 2));

    //Etiqueta para el Usuario 
    JLabel lblUsuario = new JLabel("Usuario: ");

    //Etuqieta para la constraseña 
    JLabel  lblPassword = new JLabel("Password: ");


    //Iniciamos las cajas de texto
    txtUsuario = new JTextField();
    txtPassword = new JPasswordField();

// creamos un boton 
    JButton  btnLogin = new JButton("Login");
    //Creamos un accion para le boton 
    btnLogin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String Usuario = txtUsuario.getText(); 
            char[] caraPassword = txtPassword.getPassword();
            String password  = new String (caraPassword);
            
            if(validarLogin(Usuario, password)){
                JOptionPane.showMessageDialog(Cliente.this, "Login Correcto!", "validacion", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showConfirmDialog(Cliente.this, "**Usuario o Contraseña incorrectos**", "validacion",JOptionPane.ERROR_MESSAGE );
            }
            //System.out.println("Usuari: "+ Usuario+ ", Password: "+password);
        }
    });

    //Añadimos los elementos visuales al contenedor 
      
    panel.add(lblUsuario);
    panel.add (txtUsuario);
    panel.add (lblPassword);
    panel.add (txtPassword);
    panel.add(btnLogin);

    //Agregamos a la ventana el panel con los elemntos visuales 
    add(panel);
    //Hacemos visible a la pantalla 
    setVisible(true);
    //Centrar la ventana
    setLocationRelativeTo(null);


}
public static void main(String[] args) {
    new Cliente();
}
private boolean validarLogin (String Usuario, String password){
    return Usuario.equals("utng") && password.equals("xyz");
}



    
}
