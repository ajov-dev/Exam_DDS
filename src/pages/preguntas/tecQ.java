package pages.preguntas;

import javax.swing.JOptionPane;

public class tecQ {
	public String[] Opcion0 = new String[] {
			"A una red que interconecta objetos físicos valiéndose del internet.",
			"Al bluetooth, wifi y demás redes.",
			"Todas las cosas que puedes encontrar en internet.",
			"Páginas webs y servidores." };
	public String[] Opcion1 = new String[] {
			"Aquello que vemos cuando nos colocamos unas gafas 3D.",
			"Es la visión de un entorno físico del mundo real a través de un dispositivo tecnológico.",
			"Todo lo que tenga que ver con meta.",
			"Es la ampliación de las imágenes y videos a través del móvil."
	};
	public String[] Opcion2 = new String[] {
			"Para aprender inglés.",
			"Para apostar en casinos en las casas de apuesta.",
			"Para comprar las entradas del cine online.",
			"Para realizar pagos online sin intermediarios Y de forma segura aprovechando su virtualidad e intangibilidad."
	};
	public String[] Opcion3 = new String[] {
			"Puede ser una mezcla de Inteligencia artificial dentro de una aplicación qué te ayuda a conseguir dinero.",
			"Un programa informático con el Qué es posible mantener una conversación normalmente para solicitarla algún tipo de información.",
			"Un robot con el que hablar cuando te sientes solo.",
			"Una aplicación de mensajería y chat para el móvil.",
	};
	public String[] Opcion4 = new String[] {
			"A enseñar a las máquinas a hacer las cosas.",
			"A todo aquello que podemos aprender de una máquina.",
			"Una infinidad de cosas que tengan que ver con tecnología.",
			"A programar las máquinas para que usen algoritmos para pasear datos, aprender de ellos y ser capaces de hacer predicciones o sugerencias."
	};
	public String[] Opcion5 = new String[] {
			"La reproducción digital de los objetos reales. ",
			"Tu gemelo perdido de forma digital.",
			"Réplicas virtuales de objetos o procesos que simulan el comportamiento de sus homólogos reales.",
			"Los perfiles de los usuarios en las redes sociales.",
	};
	public String[] Opcion6 = new String[] {
			"Realidad vista.",
			"Reproducción virtual.",
			"Realidad virtual.",
			"Ritual visual."
	};
	public String[] Opcion7 = new String[] {
			"Bloques de informacion para pagar con ellos.",
			"Es una cadena para bloquear datos y que solo nosotros podamos verlos.",
			"Es la nueva técnica para transferir dinero y que los bancos no puedan interferir en nuestro dinero.",
			"Una estructura de datos en la que la información contenida Se agrupa en bloques enlazados y cifrados para proteger la seguridad y privacidad.",
	};
	public String[] Opcion8 = new String[] {
			"En lo que se basa la serie de Mr. Robot.",
			"La simulación de procesos de inteligencia humana por parte de máquinas especialmente sistemas informáticos.",
			"Una película.",
			"La inteligencia mejorada por la implantación de un chip en un cerebro humano, lo que permite mejorar el análisis en la toma de decisiones.",
	};
	public String[] Opcion9 = new String[] {
			"Entre otros, es aprovechar la inteligencia de analizar y cruzar grandes cantidades de datos para identificar nuevas oportunidades de negocio.",
			"Un conjunto muy grande de datos.",
			"La mayor cantidad de información que podemos recolectar en tan solo un segundo.",
			"Disciplina tecnológica que se ocupa de almacenar cada vez un número mayor de edad, requiriendo cada vez más espacio."
	};

	public String[][] Opciones = new String[][] {
			Opcion0,
			Opcion1,
			Opcion2,
			Opcion3,
			Opcion4,
			Opcion5,
			Opcion6,
			Opcion7,
			Opcion8,
			Opcion9
	};
	public String[] Preguntas = new String[] {
			"¿A qué hace relación el Internet de las Cosas?",
			"¿Qué entendemos por Realidad Aumentada?",
			"¿Para qué se utilizan los bitcoins?",
			"¿Qué es un Chatbot?",
			"¿Y el Machine Learning?",
			"¿Qué son los digital Twins?",
			"¿Qué significan las siglas RV o VR en inglés?",
			"¿Qué es el Blockchain?",
			"Inteligencia artificial es...",
			"¿Sabes lo que es Big Data?"
	};
	public String[] Respuestas = new String[] {
			Opciones[0][0],
			Opciones[1][1],
			Opciones[2][3],
			Opciones[3][1],
			Opciones[4][3],
			Opciones[5][2],
			Opciones[6][2],
			Opciones[7][3],
			Opciones[8][1],
			Opciones[9][0]
	};
	public String[] listaChar = new String[] { "A", "B", "C", "D" };

	public tecQ() {

		for (int i = 0; i < Preguntas.length; i++) {
			String iterarOpciones = "";
			for (int j = 0; j < Opcion0.length; j++) {
				iterarOpciones = iterarOpciones + listaChar[j] + ". " + Opciones[i][j] + "\n";
			}
			String mensaje = Preguntas[i] + "\n" + iterarOpciones;
			String hResp = JOptionPane.showInputDialog(null, mensaje, "Pregunta: " + (i + 1) + "/" + "20",	JOptionPane.QUESTION_MESSAGE);
			int indexQ = validacion(hResp, i);

			if (Opciones[i][indexQ] == Respuestas[i]) {
				JOptionPane.showMessageDialog(null, "Respuesta Correcta");
			}else {
				JOptionPane.showMessageDialog(null, "Respuesta Incorrecta");
			}


		}

	}

	int validacion(String hResp, int i) {
		int medida = 3 - i;
		switch (hResp) {
			case "A":
			case "a":
			medida = 0;
				break;
			case "B":
			case "b":
			medida = 1;
				break;
			case "C":
			case "c":
			medida = 2;
				break;
			case "D":
			case "d":
			medida = 3;
				break;
			default:

		JOptionPane.showMessageDialog(null, "el dato ingresado es invalido, por ende su respuesta es incorrecta.", "VISO DE ERROR DE INTRODUCCION.", JOptionPane.WARNING_MESSAGE);
		medida = 3 - i;
				break;
		}
		System.out.println(medida);
		return medida;
	}
}