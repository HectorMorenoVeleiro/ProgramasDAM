package ejercicioscuentapropia;

public class OrdenamientoExplicado {

    /*
     * · Métodos burbuja (sea Float o Integer) -->
     * 
     * - Qué es un método burbuja? Es aquel método que permite al usuario
     * recorrer una lista desordenada y ordenarla recorriendo de dos en dos las
     * instancias de ese array y reordenandolas en el orden que mas apeteca
     * (generalmente de menor a mayor).
     * 
     */

    // Método burbuja para Integers -->
    public static int[] MetodoBurbuja(int[] datos) {

        // Creamos el valor auxiliar que usaremos mas adelante -->
        int aux = 0;

        // Creamos un Fori que recorra el array desde la segunda
        // instancia del mismo (lo iniciamos a i = 1) -->
        for (int i = 1; i < datos.length; i++) {

            // Creamos el segundo for (Forj) que recorra el array
            // desde el primer valor del mismo hasta la iteración
            // en la que está el bucle que lo contiene -->
            for (int j = 0; j < i; j++) {

                // Creamos una condicion donde en caso de ser el primer
                // numero mas grande que el segundo (valor[i] respecto a
                // valor[j]) se sustituyan -->
                if (datos[j] > datos[i]) {
                    aux = datos[j];
                    datos[j] = datos[i];
                    datos[i] = aux;
                }
            }
        }

        // Devolvemos el array ya corregido -->
        return datos;
    }

    // Método burbuja para Floats -->
    public static float[] MetodoBurbuja(float[] datos) {

        // Creamos el valor auxiliar que usaremos mas adelante -->
        float aux = 0;

        // Creamos un Fori que recorra el array desde la segunda
        // instancia del mismo (lo iniciamos a i = 1) -->
        for (int i = 1; i < datos.length; i++) {

            // Creamos el segundo for (Forj) que recorra el array
            // desde el primer valor del mismo hasta la iteración
            // en la que está el bucle que lo contiene -->
            for (int j = 0; j < i; j++) {

                // Creamos una condicion donde en caso de ser el primer
                // numero mas grande que el segundo (valor[i] respecto a
                // valor[j]) se sustituyan -->
                if (datos[j] > datos[i]) {
                    aux = datos[j];
                    datos[j] = datos[i];
                    datos[i] = aux;
                }
            }
        }

        // Devolvemos el array ya corregido -->
        return datos;
    }

    /*
     * · Método cocktail -->
     * 
     * - Qué es un método cocktail? Es aquel método que permite al usuario
     * recorrer una lista desordenada y ordenarla recorriendo de dos en dos las
     * instancias de ese array y reordenandolas en el orden que mas de apeteca,
     * básicamente es como un metodo burbuja, la única diferencia es que en
     * este se recorre el array de alante hacia atras, no solo adelante y repetir.
     * 
     */

    public static int[] MetodoCocktail(int[] datos) {

        // Creamos el valor auxiliar -->
        int aux = 0;

        // Creamos el booleano swapped para que detecte y salga del bucle solo
        // cuando el dato ha terminado de se modificado -->
        boolean swapped = true;

        // iniciamos el valor i, de iteraciones del bucle (index i) -->
        int i = 0;

        // iniciamos el valor j, de iteraciones del bucle (index i) -->
        int j = datos.length - 1;

        // Entramos al primer bucle y principal, del cual se saldra al tener
        // todos los valores cambiados -->
        while (i < j && swapped) {

            // Cambiamos swapped a false para evitar salirnos del codigo
            // antes de terminar de moficiar el array -->
            swapped = false;

            // Creamos un bucle que recorra, como en el método burbuja el array
            // de atras hacia delante continuamente
            for (int k = i; k < j; k++) {

                // Instrucción condicional para sustituir
                if (datos[k] > datos[k + 1]) {

                    // Cambio de parámetros de alante hacia atras
                    aux = datos[k];
                    datos[k] = datos[k + 1];
                    datos[k + 1] = aux;

                    // Cambio de condición que indica que se ha realizado la
                    // sustitución
                    swapped = true;
                }
            }

            // Aumento de iteración
            j--;

            // A diferencia del método burbuja, este bucle recorrerá el array
            // de alante hacia atras (mientras swapped sea true, o sea que choca
            // con el bucle previo y va desde esa posicion hacia atras)
            if (swapped) {

                // Impedimento (otra vez) a salir del bucle sin querer
                swapped = false;

                // Lo de antes permitia entrar en el bucle pero aquí es donde se
                // inicia
                for (int k = j; k > i; k--) {

                    // Instrucción condicional para sustituir
                    if (datos[k] < datos[k - 1]) {

                        // Cambio de parámetros de atras hacia delante
                        aux = datos[k];
                        datos[k] = datos[k - 1];
                        datos[k - 1] = aux;

                        // Cambio de condición que indica que se ha realizado la
                        // sustitución
                        swapped = true;
                    }
                }
            }

            // Disminución de iteracion
            i++;
        }

        // Devolvemos el array ya corregido
        return datos;
    }
}
