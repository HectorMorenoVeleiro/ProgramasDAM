package cuatro;

public class EjercicioExamen2 {

    // atributos
    private double nota;

    private final String[] recorridoNota = { "SUSPENSO, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE" };

    // método constructor
    public EjercicioExamen2(double nota) {
        this.nota = nota;
    }

    public String comprobarCalificacion() {
        while (nota < 0.0 || nota > 10.0) {
            if (nota >= 9)
                return recorridoNota[4];
            else if (nota >= 7)
                return recorridoNota[3];
            else if (nota >= 6)
                return recorridoNota[2];
            else if (nota >= 5)
                return recorridoNota[1];
            else
                return recorridoNota[0];
        }
        return "Fantasmón";
    }

}
