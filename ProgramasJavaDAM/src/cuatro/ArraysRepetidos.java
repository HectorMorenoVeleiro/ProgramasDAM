package cuatro;

public class ArraysRepetidos {
    public static void main(String[] args) {
        int[] datos = { 1, 2, 3, 3, 4, 4, 5, 2 };
        int largo = datos.length;

        // antes de comprobar repeticiones de valores es extremadamente importante
        // ordenar el array.

        System.out.print("longitud del array -> " + largo);

        for (int i = 0; i < datos.length; i++) {
            for (int j = i + 1; j < datos.length; j++) {
                if (datos[i] == datos[j])
                    System.out.println(datos[i] + " esta repetido");
            }
        }
    }
}