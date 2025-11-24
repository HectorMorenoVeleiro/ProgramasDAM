package cuatro;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayMaxMin {

    public static void main(String[] args) {
        int[] datos = { 1, 2, 3, 3, 4, 4, 5, 2 };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println(Arrays.toString(datos));

        for (Integer entero : datos) {
            if (entero > max)
                max = entero;
            if (entero < min)
                min = entero;
        }

        System.out.println(max);
        System.out.println(min);
    }

    public static void encontrarMaxMinConStream(int[] array) {

        // 1. Verificacion basica
        if (array == null || array.length == 0) {
            System.out.println("El array esta vacio o es nulo");
            return;
        }

        // 2. Crear un IntStream a partir del array
        OptionalInt maximo = Arrays.stream(array).max();
        OptionalInt minimo = Arrays.stream(array).min();

        // 3. Obtener resultados de OptionalInt
        // Usamos isPresent() y getAsInt() para manejar el caso de array vacio(aunque ya
        // lo comprobamos previamente)
        if (maximo.isPresent()) {
            System.out.println("--- Resultados (Usando Streams) ---");
            System.out.println("El valor Maximo es: " + maximo.getAsInt());
            System.out.println("El valor Maximo es: " + minimo.getAsInt());
        }
    }
}
