package pages;
import javax.swing.*;
import java.awt.event.*;

public class loginPage extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    JLabel labelEnunciado, labelNombre, labelCedula;
    JTextField textFieldNombre, textFieldCedula;
    JButton buttonAceptar, buttonCancelar;
    JPanel panel;

    public loginPage() {
        labelEnunciado = new JLabel("INGRESE LOS DATOS DEL ESTUDIANTE");
        labelNombre = new JLabel("Nombre:");
        labelCedula = new JLabel("Cedula:");

        textFieldNombre = new JTextField();
        textFieldCedula = new JTextField();

        buttonAceptar = new JButton("Aceptar");
        buttonCancelar = new JButton("Cancelar");
        // SetBounds
        labelEnunciado.setBounds(10, 50, 300, 50);
        labelNombre.setBounds(10, 100, 100, 50);
        labelCedula.setBounds(10, 150, 100, 50);
        textFieldNombre.setBounds(150, 100, 100, 25);
        textFieldCedula.setBounds(150, 150, 100, 25);
        buttonAceptar.setBounds(10, 200, 100, 25);
        buttonCancelar.setBounds(160, 200, 100, 25);

        // panel
        add(labelEnunciado);
        add(labelNombre);
        add(labelCedula);
        add(textFieldNombre);
        add(textFieldCedula);
        add(buttonAceptar);
        add(buttonCancelar);

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);
        setSize(500, 400);
        setVisible(true);
    }

}
