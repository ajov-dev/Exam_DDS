package Pages.Preguntas;

import javax.swing.JOptionPane;

import Pages.MisMetodos;

public class InglesQ {
    public String[] Opcion0 = new String[] {
            "¡You look such handsome tonight!",
            "¡You look too handsome tonight!",
            "¡You look so handsome tonight!",
            "¡You look very handsome tonight!",
    };
    public String[] Opcion1 = new String[] {
            "Do you feel like taking a dring.",
            "Do you feel like taking a drink.",
            "Do you feel like to take a dring?",
            "Do you feel like having a drink?",
    };
    public String[] Opcion2 = new String[] {
            "Casi nunca, solo para enfatizar.",
            "No, nunca.",
            "Si, siempre.",
            "Dependería de la ocación",
    };
    public String[] Opcion3 = new String[] {
            "Atender.",
            "Asistir.",
            "Aplazar.",
            "Aplasar.",
    };
    public String[] Opcion4 = new String[] {
            "To be out sick",
            "To be ill",
            "To be off sick",
            "Im sick, mom.",
    };

    public String[][] Opciones = new String[][] {
            Opcion0,
            Opcion1,
            Opcion2,
            Opcion3,
            Opcion4,
    };
    public String[] Preguntas = new String[] {
            "Traduce: <<¡Vas super guapo esta noche!>>",
            "¿Qué le dirías a alguien para invitarle a tomar algo?",
            "¿Utilizarías en inglés los pronombres reflexivos para el verbo «afeitarse» («to shave»)?",
            "¿Cómo se traduce «to attend» al español?",
            "¿Cómo se dice «estar de baja por enfermedad»?",
    };
    public String[] Respuestas = new String[] {
            Opciones[0][2],
            Opciones[1][3],
            Opciones[2][0],
            Opciones[3][1],
            Opciones[4][3],
    };
    public String[] listaChar = new String[] { "A", "B", "C", "D" };
    public int respCorrectas = 0;
    public int puntosObtenidos;
    private MateQ llamadaMateQ = new MateQ();
    private MisMetodos CallTool = new MisMetodos();
    private int varPN = 11;

    public void center(int RespRecibido, int PuntosRecibido){
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

        PuntosObt = PuntosRecibido + ((RespRecibido - RespObt)*4);

        RespObt = RespRecibido;
        System.out.println(RespObt + "  " + PuntosObt);




        llamadaMateQ.center(RespObt, PuntosObt);
    }
}

