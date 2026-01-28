package ejercicios;

import java.util.*; // Importamos utilidades: Scanner, Random, etc.

/* 
 * 5. (Ejercicio dificultad alta) Programa que realice una sopa de letras. La
 * sopa de letras tendrá un tamaño de matriz 15 x 15. El programa pedirá 10
 * palabras, las cuales las irá escondiendo de forma aleatória por la matriz
 * (obviamente las palabras siempre tendrán 15 letras o menos). Una vez
 * escondidas las palabras rellenará las demas casillas de la matriz con letras
 * de forma aleatoria. Solo se utilizarán mayúsculas. Si el usuario introduce
 * palabras en minúsculas se transformarán a mayúsculas. 
 * 
 */

public class SopaDeLetras {

    // Constante para el tamaño de la sopa: 15x15
    public static final int TAM = 15;

    // Número de palabras que vamos a pedir al usuario
    public static final int NUM_PALABRAS = 10;

    public static void main(String[] args) {
        // Scanner para leer del teclado
        Scanner sc = new Scanner(System.in);

        // Matriz de caracteres que representará la sopa de letras
        char[][] sopa = new char[TAM][TAM];

        // Objeto Random para generar posiciones y letras aleatorias
        Random random = new Random();

        // 1. Inicializar la matriz con un carácter "vacío" (aquí usamos '*')
        // Esto nos permite saber qué casillas aún no tienen letra
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                sopa[i][j] = '*'; // Marcamos como vacío
            }
        }

        // 2. Pedir las palabras al usuario
        String[] palabras = new String[NUM_PALABRAS];

        for (int i = 0; i < NUM_PALABRAS; i++) {
            System.out.print("Introduce palabra " + (i + 1) + ": ");
            // Leemos la palabra y la pasamos a mayúsculas
            palabras[i] = sc.nextLine().toUpperCase();

            // Validamos que la palabra no tenga más de 15 letras
            while (palabras[i].length() > TAM) {
                System.out.println("La palabra no puede tener más de " + TAM + " letras.");
                System.out.print("Introduce otra palabra: ");
                palabras[i] = sc.nextLine().toUpperCase();
            }
        }

        // 3. Colocar cada palabra en la sopa de letras
        // Recorremos el array de palabras y las vamos colocando una a una
        for (String palabra : palabras) {
            colocarPalabra(sopa, palabra, random);
        }

        // 4. Rellenar las casillas vacías ('*') con letras aleatorias de la A a la Z
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (sopa[i][j] == '*') {
                    // Generamos una letra aleatoria: 'A' + (0 a 25)
                    sopa[i][j] = (char) ('A' + random.nextInt(26));
                }
            }
        }

        // 5. Imprimir la sopa de letras resultante
        imprimirSopa(sopa);

        sc.close(); // Cerramos el Scanner por buena práctica
    }

    /**
     * Coloca una palabra en la sopa de letras en una posición aleatoria.
     * Puede ser horizontal o vertical, también elegido aleatoriamente.
     */
    public static void colocarPalabra(char[][] sopa, String palabra, Random random) {
        boolean colocada = false;

        // Repetimos hasta conseguir colocar la palabra en una posición válida
        while (!colocada) {
            // Elegimos una fila y una columna aleatoria como punto de inicio
            int fila = random.nextInt(TAM);
            int col = random.nextInt(TAM);

            // Elegimos aleatoriamente si la palabra será horizontal (true) o vertical
            // (false)
            boolean horizontal = random.nextBoolean();

            if (horizontal) {
                // Comprobamos si cabe en horizontal desde esa columna
                if (col + palabra.length() <= TAM) {
                    // Verificamos que no haya conflictos con otras letras
                    if (puedeColocarHorizontal(sopa, palabra, fila, col)) {
                        // Colocamos la palabra letra a letra
                        for (int i = 0; i < palabra.length(); i++) {
                            sopa[fila][col + i] = palabra.charAt(i);
                        }
                        colocada = true; // Marcamos como colocada
                    }
                }
            } else {
                // Comprobamos si cabe en vertical desde esa fila
                if (fila + palabra.length() <= TAM) {
                    // Verificamos que no haya conflictos con otras letras
                    if (puedeColocarVertical(sopa, palabra, fila, col)) {
                        // Colocamos la palabra letra a letra
                        for (int i = 0; i < palabra.length(); i++) {
                            sopa[fila + i][col] = palabra.charAt(i);
                        }
                        colocada = true; // Marcamos como colocada
                    }
                }
            }
            // Si no se pudo colocar, el bucle while se repite y probamos otra
            // posición/dirección
        }
    }

    /**
     * Comprueba si una palabra se puede colocar en horizontal
     * empezando en (fila, col) sin chocar con otras letras incompatibles.
     */
    public static boolean puedeColocarHorizontal(char[][] sopa, String palabra, int fila, int col) {
        for (int i = 0; i < palabra.length(); i++) {
            char c = sopa[fila][col + i]; // Letra actual en la sopa
            char letraPalabra = palabra.charAt(i); // Letra de la palabra

            // Si la casilla no está vacía ('*') y además la letra no coincide,
            // entonces hay conflicto y no se puede colocar aquí.
            if (c != '*' && c != letraPalabra) {
                return false;
            }
        }
        // Si hemos pasado todo el bucle sin conflictos, se puede colocar
        return true;
    }

    /**
     * Comprueba si una palabra se puede colocar en vertical
     * empezando en (fila, col) sin chocar con otras letras incompatibles.
     */
    public static boolean puedeColocarVertical(char[][] sopa, String palabra, int fila, int col) {
        for (int i = 0; i < palabra.length(); i++) {
            char c = sopa[fila + i][col]; // Letra actual en la sopa
            char letraPalabra = palabra.charAt(i); // Letra de la palabra

            // Mismo criterio que en horizontal: solo aceptamos vacío o coincidencia
            if (c != '*' && c != letraPalabra) {
                return false;
            }
        }
        return true;
    }

    /**
     * Imprime la sopa de letras por pantalla.
     */
    public static void imprimirSopa(char[][] sopa) {
        System.out.println("\n--- SOPA DE LETRAS ---\n");
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                // Imprimimos cada letra seguida de un espacio para que quede más legible
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
