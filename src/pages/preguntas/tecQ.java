package pages.preguntas;

import javax.swing.JOptionPane;

public class tecQ {
	public String[] Preguntas = new String[] {
			"Preguna: cual seria la probabilidad de ser deborado por un tiburon en medio del oceano",
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
	public String[] Respuestas = new String[] {
			"1/100"
	};
	// public Integer[] HRespuestas = new Integer[]{};
	public String[] Opcion0 = new String[] { "2/1000", "25/100", "15/100", "1/100" };
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
	public int cantRespuestasCorrectas;
	public int HRespuestas;
	public int puntos;

	public tecQ() {
		// String showIntro = introTecSect();
		// System.out.println(Opciones[0][1]);

		cantRespuestasCorrectas = 0;
		for (int i = 0; i < Preguntas.length; i++) {
			String mensaje = "" + Preguntas[i] + "\n";
			String iOpciones = "";
			for (int j = 0; j < Opcion0.length; j++) {
				iOpciones = iOpciones + "0" + (j + 1) + ". " + Opciones[i][j] + "\n";
			}
			do {
				HRespuestas = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje + iOpciones));
			} while (HRespuestas < 1 || HRespuestas > 4);
			HRespuestas = HRespuestas - 1;
			if (Opciones[i][HRespuestas] == Respuestas[i]) {
				JOptionPane.showConfirmDialog(null, "respuesta Correcta", "alert Message",
						JOptionPane.WARNING_MESSAGE);
				cantRespuestasCorrectas = cantRespuestasCorrectas + 1;
			} else {
				JOptionPane.showConfirmDialog(null, "respuesta Incorrecta", "alert Message",
						JOptionPane.WARNING_MESSAGE);
			}
		}
		puntos = cantRespuestasCorrectas * 6;
	}
}
