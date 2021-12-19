package Pages;

import javax.swing.JOptionPane;
public class MisMetodos {

    public int validacion(String hResp, int i) {
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
                medida = 0;
                break;
            case "D":
            case "d":
                medida = 0;
                break;
            default:
                medida = 3 - i;
                JOptionPane.showMessageDialog(null, "El valor introducido no es valido, \n por ende su evaluacion será nula para esta pregunta. \n siga indicaciones", "Aviso", JOptionPane.WARNING_MESSAGE);
                break;
        }

        return medida;

    }
}
