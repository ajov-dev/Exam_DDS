package pages;

import javax.swing.*;
import pages.preguntas.tecQ;
import java.awt.event.*;

public class loginPage extends JFrame implements ActionListener, java.awt.event.ActionListener {
    JLabel labelEnunciado, labelNombre, labelCedula;
    JTextField textFieldNombre, textFieldCedula;
    JButton buttonEvaluar, buttonCancelar;
    JPanel panel;
    int indexadorUsable;

    public loginPage(int indexador) {
        this.indexadorUsable = indexador;
        labelEnunciado = new JLabel("INGRESE LOS DATOS DEL ESTUDIANTE 0" + (indexadorUsable + 1));
        labelNombre = new JLabel("Nombre:");
        labelCedula = new JLabel("Cedula:");

        textFieldNombre = new JTextField();
        textFieldCedula = new JTextField();

        buttonEvaluar = new JButton("Evaluar");
        buttonCancelar = new JButton("Cancelar");
        // SetBounds
        labelEnunciado.setBounds(10, 50, 300, 50);
        labelNombre.setBounds(10, 100, 100, 50);
        labelCedula.setBounds(10, 150, 100, 50);
        textFieldNombre.setBounds(150, 100, 100, 25);
        textFieldCedula.setBounds(150, 150, 100, 25);
        buttonEvaluar.setBounds(10, 200, 100, 25);
        buttonCancelar.setBounds(160, 200, 100, 25);

        // panel
        add(labelEnunciado);
        add(labelNombre);
        add(labelCedula);
        add(textFieldNombre);
        add(textFieldCedula);
        add(buttonEvaluar);
        add(buttonCancelar);

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);
        setSize(400, 300);
        setVisible(true);

        buttonEvaluar.addActionListener(this);
        buttonCancelar.addActionListener(this);
    }

    public void evaluar() {
        if (textFieldNombre.getText().length() == 0 || textFieldCedula.getText().length() == 0) {
            dispose();
        } else if (textFieldNombre.getText().length() == 0 && textFieldCedula.getText().length() == 0) {
            dispose();
        } else if (textFieldNombre.getText().length() != 0 && textFieldCedula.getText().length() != 0) {
            dispose();
            tecQ showTecQ = new tecQ();
        }
    }

    public void cerrar() {
        dispose();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonCancelar) {
            cerrar();
        } else {
            evaluar();
        }
    }
}
