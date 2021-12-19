package Pages;
import javax.swing.*;

import Pages.Preguntas.TecQ;

import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JLabel labelEnunciado, labelNombre, labelCedula;
	JTextField textFieldNombre, textFieldCedula;
	JButton buttonEvaluar, buttonCancelar;
	JPanel panel;
	public String[] ArrayName = new String[99];
	public String[] ArrayCedula = new String[99];
	public String[][] ArrayNC = new String[][] { ArrayName, ArrayCedula };
	private TecQ llamadaTecQ = new TecQ();
	public int indexador;

	public void center(int index) {
		this.indexador = index;
		// declaracion de elemeentos
		labelEnunciado = new JLabel("INGRESE LOS DATOS DEL ESTUDIANTE 0" + (index + 1));
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
		setSize(500, 300);
		setVisible(true);
		panel.setBorder(
				javax.swing.BorderFactory.createTitledBorder(null, "TITULO",
						javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
						javax.swing.border.TitledBorder.DEFAULT_POSITION,
						new java.awt.Font("Calibri", 1, 14),
						new java.awt.Color(0, 52, 216)));

		buttonEvaluar.addActionListener(this);
		buttonCancelar.addActionListener(this);

		ArrayName[indexador] = textFieldNombre.getText();
		ArrayCedula[indexador] = textFieldCedula.getText();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

		if (e.getSource() == buttonCancelar) {
			cerrar();
		} else {
			evaluar();
		}
	}
		public void cerrar() {
			dispose();
		}
	
	public void evaluar() {
		if (textFieldNombre.getText().length() == 0 || textFieldCedula.getText().length() == 0) {
			dispose();
		} else if (textFieldNombre.getText().length() == 0 && textFieldCedula.getText().length() == 0) {
			dispose();
		} else if (textFieldNombre.getText().length() != 0 && textFieldCedula.getText().length() != 0) {
			dispose();
			llamadaTecQ.center(0, 0);
		}
	}
}
