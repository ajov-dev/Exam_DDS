package Pages.Preguntas;

import javax.swing.JOptionPane;

import Pages.Evaluacion;
import Pages.MisMetodos;

public class MateQ {
        public String[] Opcion0 = new String[] {
                        "(-2, 4)",
                        "[5, 17]",
                        "[-1, 2]",
                        "(-2, 5]",
        };
        public String[] Opcion1 = new String[] {
                        "4.243",
                        "13.000",
                        "11.594",
                        "No existe.",
        };
        public String[] Opcion2 = new String[] {
                        "2x + x - x/2x",
                        "2x - x² + 2",
                        "2x + 1/ x² + 2",
                        "x + 2y - 1/x²",
        };
        public String[] Opcion3 = new String[] {
                        "49.37m²",
                        "79.47m²",
                        "51.77m",
                        "22.90m",
        };
        public String[] Opcion4 = new String[] {
                        "+ infinito",
                        "- infinito",
                        "+-0",
                        "0",
        };

        public String[][] Opciones = new String[][] {
                        Opcion0,
                        Opcion1,
                        Opcion2,
                        Opcion3,
                        Opcion4,
        };
        public String[] Preguntas = new String[] {
                        "Resuelva la inecuacion, y determine su dominio: x >= x² - 2",
                        "cateto a y b son iguales a 3, Halle la hipotenusa.",
                        "hallar derivada de: x² + 2x - 1/x",
                        "Hallar el area de un triangulo cuya base es: 15.7m \nY cya altura es: 10.123m.",
                        "puntos criticos de: x²",
        };
        public String[] Respuestas = new String[] {
                        Opciones[0][3],
                        Opciones[1][0],
                        Opciones[2][2],
                        Opciones[3][1],
                        Opciones[4][3],
        };
        public String[] listaChar = new String[] { "A", "B", "C", "D" };
        public int respCorrectas = 0;
        public int puntosObtenidos;
        private MisMetodos CallTool = new MisMetodos();
        private Evaluacion llamadaEvaluacion = new Evaluacion();
        private int varPN = 16;

        public void center(int RespRecibido, int PuntosRecibido) {
                int RespObt = RespRecibido;
                int PuntosObt = PuntosRecibido;
                for (int i = 0; i < Preguntas.length; i++) {
                        String iterarOpciones = "";
                        for (int j = 0; j < Opcion0.length; j++) {
                                iterarOpciones = iterarOpciones + listaChar[j] + ". " + Opciones[i][j] + "\n";
                        }
                        String mensaje = Preguntas[i] + "\n" + iterarOpciones;
                        String hResp = JOptionPane.showInputDialog(null, mensaje,
                        "Pregunta: " + (i + varPN) + "/" + "20",
                        JOptionPane.QUESTION_MESSAGE);
			int indexQ = 0;
			if (hResp == null || hResp.length() == 0) {
				indexQ = 4;
				JOptionPane.showMessageDialog(null, "Respuesta Nula 0 Incorrecta");
			} else {
				indexQ = CallTool.validacion(hResp, i);
				if (Opciones[i][indexQ] == Respuestas[i]) {
					// JOptionPane.showMessageDialog(null, "Respuesta Correcta");
					RespRecibido = RespRecibido + 1;

				}
			}
                }

                PuntosObt = PuntosRecibido + ((RespRecibido - RespObt) * 4);

                RespObt = RespRecibido;
                System.out.println(RespObt + "  " + PuntosObt);
                llamadaEvaluacion.center();
        }

}
