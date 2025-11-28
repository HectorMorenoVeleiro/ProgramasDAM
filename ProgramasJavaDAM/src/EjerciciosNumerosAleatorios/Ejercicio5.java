package ejerciciosnumerosaleatorios;

public class Ejercicio5 {
    // Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
    // separados por espacios. Muestra también el máximo, el mínimo y la media
    // de esos números.
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println((int) (Math.random() * 100 + 100));
        }
    }
}
