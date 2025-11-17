package EjerciciosNumerosAleatorios;

public class Ejercicio7 {
    //Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
    //para los 14 partidos y el pleno al quince (15 filas).
    public static int randomResultado(int largo) {
        return (int) (Math.random() * largo);
    }

    public static void main(String[] args) {
        String[] resultadoPartido = new String[]{"VICTORIA_EQUIPO_LOCAL", "EMPATE", "VICTORIA_EQUIPO_VISITANTE"};
        for (int i = 0; i < 15; i++) {
            System.out.println("| " + resultadoPartido[randomResultado(resultadoPartido.length)] + " | " +
                    resultadoPartido[randomResultado(resultadoPartido.length)] + " | " +
                    resultadoPartido[randomResultado(resultadoPartido.length)] + " | ");
        }
    } //El pleno lo va a hacer tu puta madre, al igual que el Ejercicio8
}

