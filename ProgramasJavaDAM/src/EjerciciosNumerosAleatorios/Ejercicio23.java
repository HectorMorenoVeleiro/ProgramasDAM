package ejerciciosnumerosaleatorios;

public class Ejercicio23 {
    // Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y
    // 8.
    // Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
    // Ejemplo 1:
    // Q J 7 J As
    // Ejemplo 2:
    // K 8 J As 7
    public static void main(String[] args) {
        String[] carasDado = new String[] { "As", "K", "Q", "J", "7", "8" };
        for (int i = 0; i < 5; i++)
            System.out.print("[" + carasDado[(int) (Math.random() * carasDado.length)] + "] ");
    }
}
