package EjerciciosNumerosAleatorios;

public class Ejercicio21 {
    //Realiza un programa que genere una secuencia de cinco monedas de curso
    //legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
    //5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
    //posiciones posibles son cara y cruz.
    //Ejemplo:
    //2 céntimos - cara
    //20 céntimos - cruz
    //50 céntimos - cruz
    //1 euro - cruz
    //2 euros - cara
    public static void main(String[] args) {
        String[] monedasAProbar = new String[]{"1 centimo", "2 centimos", "5 centimos", "10 centimos",
                "20 centimos", "50 centimos", "1 euro", "2 euros"};
        String[] resultadoLanzamiento = new String[]{"cara", "cruz"};
        for (int i = 0; i < 5; i++) {
            System.out.println((monedasAProbar[(int)(Math.random()* monedasAProbar.length)]) +
                    " - " + (resultadoLanzamiento[(int)(Math.random()* resultadoLanzamiento.length)]));
        }
    }
}
