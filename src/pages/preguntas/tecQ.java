package pages.preguntas;

import javax.swing.JOptionPane;

public class tecQ {
	public String[] Preguntas = new String[] {
			"Preguna N0",
			"Preguna N1",
			"Preguna N2",
			"Preguna N3",
			"Preguna N4",
			"Preguna N5",
			"Preguna N6",
			"Preguna N7",
			"Preguna N8",
			"Preguna N9"
	};
	public String[] Respuestas = new String[] {};
	// public Integer[] HRespuestas = new Integer[]{};
	public String[] Opcion0 = new String[] { "1", "perro", "3", "4" };
	public String[] Opcion1 = new String[] { "1", "2", "3", "4" };
	public String[] Opcion2 = new String[] { "1", "2", "3", "4" };
	public String[] Opcion3 = new String[] { "1", "2", "3", "4" };
	public String[] Opcion4 = new String[] { "1", "2", "3", "4" };
	public String[] Opcion5 = new String[] { "1", "2", "3", "4" };
	public String[] Opcion6 = new String[] { "1", "2", "3", "4" };
	public String[] Opcion7 = new String[] { "1", "2", "3", "4" };
	public String[] Opcion8 = new String[] { "1", "2", "3", "4" };
	public String[] Opcion9 = new String[] { "1", "2", "3", "4" };

	public String[][] Opciones = new String[][] {
			Opcion0, Opcion1, Opcion2, Opcion3, Opcion4, Opcion5, Opcion6, Opcion7, Opcion8, Opcion9
	};
	int indexadorUsable;

	public tecQ(int indexador) {
		this.indexadorUsable = indexador;
		// String showIntro = introTecSect();
		// System.out.println(Opciones[0][1]);
		String mensaje = ""+ Preguntas[indexadorUsable];
		for (int j = 0; j < Opcion0.length; j++) {
			
		}
		int HRespuestas = Integer.parseInt(JOptionPane.showInputDialog(null, "prueba " + mensaje));
	}
}
