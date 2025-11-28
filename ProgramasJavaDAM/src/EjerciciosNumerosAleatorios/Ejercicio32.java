package ejerciciosnumerosaleatorios;

import ejercicioscuentapropia.AjustesProgramas;

public class Ejercicio32 {
    /*
     * Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
     * el carácter “|”. La anchura del sendero siempre es la misma, los dos
     * caracteres del borde más cuatro caracteres en medio, en total 6 caracteres
     * (incluyendo espacios). A cada metro, el sendero puede continuar recto, girar
     * un carácter a la izquierda o girar un carácter a la derecha, por supuesto de
     * forma aleatoria.
     * Por cada metro de sendero - representado por una línea - puede que haya un
     * obstáculo o puede que no, la probabilidad es del 50%. La posición del
     * obstáculo es aleatoria dentro de la línea. En caso de existir un obstáculo en
     * un metro de sendero (en una línea), puede ser una planta (carácter *) o una
     * piedra (carácter O), la probabilidad de que salga uno u otro es la misma.
     * Recuerda que nunca habrá más de un obstáculo por metro de sendero, habrá uno
     * o ninguno.
     * Ejemplo 1:
     * Introduzca la longitud del sendero en metros: 7
     * | * |
     * | O|
     * | |
     * | * |
     * |* |
     * | O |
     * | |
     */
    public static void main(String[] args) {

        char[] snake = new char[] { '|', ' ', 'O', '*' };

        int longitudSerpiente = AjustesProgramas
                .enterNumPorScanner(
                        "Introduce la longitud de la serpiente en caracteres contando la cabeza --> ");

        int rango = 13;

        for (int i = 0; i < longitudSerpiente; i++) {

            for (int j = 0; j < rango; j++)
                System.out.print(snake[1]);

            if (Math.random() < 0.5)
                System.out.print(snake[0] + (String.valueOf(snake[1]).repeat(4)) + snake[0] + "\n");

            else if (Math.random() < 0.5)

                if (Math.random() < 0.5)
                    System.out
                            .print(snake[0] + " " + snake[2] + (String.valueOf(snake[1]).repeat(2)) + snake[0] + "\n");

                else
                    System.out
                            .print(snake[0] + (String.valueOf(snake[1]).repeat(2)) + snake[2] + " " + snake[0] + "\n");

            else if (Math.random() < 0.5)
                System.out
                        .print(snake[0] + " " + snake[3] + (String.valueOf(snake[1]).repeat(2)) + snake[0] + "\n");

            else
                System.out
                        .print(snake[0] + (String.valueOf(snake[1]).repeat(2)) + snake[3] + " " + snake[0] + "\n");

            rango = rango - ((int) (Math.random() * 3 - 1));
        }
    }
}
