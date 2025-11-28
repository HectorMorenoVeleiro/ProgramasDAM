package ejerciciosnumerosaleatorios;

public class Ejercicio9 {
    // Realiza un programa que vaya generando números aleatorios pares entre 0
    // y 100 y que no termine de generar números hasta que no saque el 24. El
    // programa deberá decir al final cuántos números se han generado.
    public static void main(String[] args) {
        int numeroAleatorio;
        do {
            numeroAleatorio = (int) ((Math.random() * 50) * 2 + 2);
            System.out.println("numero -> [" + numeroAleatorio + "]");
        } while (numeroAleatorio != 24);
    }
}
