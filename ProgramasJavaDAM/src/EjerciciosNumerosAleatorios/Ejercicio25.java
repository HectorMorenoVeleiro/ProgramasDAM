package EjerciciosNumerosAleatorios;

public class Ejercicio25 {
    //Escribe un programa que muestre por pantalla 100 números enteros separados
    //por un espacio. Los números deben estar generados de forma aleatoria en
    //un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
    //almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int numeroAleatorioEntre10Y200 = (int) (Math.random() * 190 + 10);

            if (numeroAleatorioEntre10Y200 % 2 != 0 && numeroAleatorioEntre10Y200 % 3 != 0
             && numeroAleatorioEntre10Y200 % 5 != 0 && numeroAleatorioEntre10Y200 % 7 != 0)
                System.out.print("#" + numeroAleatorioEntre10Y200 + "# ");
            if (numeroAleatorioEntre10Y200 % 5 == 0)
                System.out.print("[" + numeroAleatorioEntre10Y200 + "] ");
            else
                System.out.print(numeroAleatorioEntre10Y200 + " ");
        }
    }
}
