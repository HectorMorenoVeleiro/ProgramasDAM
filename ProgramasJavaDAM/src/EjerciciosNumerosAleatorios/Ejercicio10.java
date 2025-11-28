package ejerciciosnumerosaleatorios;

public class Ejercicio10 {
    // Realiza un programa que pinte por pantalla diez líneas formadas por
    // caracteres.
    // El carácter con el que se pinta cada línea se elige de forma aleatoria entre
    // uno
    // de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
    // aleatoria
    // entre 1 y 40 caracteres.
    public static void main(String[] args) {
        char[] caracteres = new char[] { '*', '-', '=', '.', '|', '@' };
        for (int i = 0; i < 10; i++) {
            int limiteLinea = (int) (Math.random() * 40 + 1);
            for (int j = 0; j < limiteLinea; j++) {
                System.out.print(caracteres[(int) (Math.random() * caracteres.length)]);
            }
            System.out.println(" ");
        }
    }
}
