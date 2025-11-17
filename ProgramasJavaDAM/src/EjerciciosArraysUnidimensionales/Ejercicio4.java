package EjerciciosArraysUnidimensionales;

public class Ejercicio4 {
    /*
     * Define tres arrays de 20 números enteros cada una, con nombres numero,
     * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.
     * En el array cuadrado se deben almacenar los cuadrados de los valores que hay
     * en el array numero. En el array cubo se deben almacenar los cubos de los
     * valores que hay en numero. A continuación, muestra el contenido de los tres
     * arrays dispuesto en tres columnas.
     */
    public static void main(String[] args) {

        int[] arrayNumero = new int[20];
        int[] arrayCuadrado = new int[20];
        int[] arrayCubo = new int[20];

        for (int i = 0; i < arrayCuadrado.length; i++) {

            arrayNumero[i] = (int) (Math.random() * 100 + 1);
            arrayCuadrado[i] = (int) Math.pow(arrayNumero[i], 2);
            arrayCubo[i] = (int) Math.pow(arrayNumero[i], 3);

            System.out.print(
                    "numero " + (i + 1) + ": [" + arrayNumero[i] + "]\t\tcuadrado del numero: [" + arrayCuadrado[i]
                            + "]\t\tcubo del numero: [" + arrayCubo[i] + "]\n");

        }
    }
}
