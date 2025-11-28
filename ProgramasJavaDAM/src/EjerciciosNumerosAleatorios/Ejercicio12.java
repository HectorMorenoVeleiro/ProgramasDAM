package ejerciciosnumerosaleatorios;

public class Ejercicio12 {
    // Realiza un programa que llene la pantalla de caracteres aleatorios (a lo
    // Matrix)
    // con el código ascii entre el 32 y el 126. Puedes hacer casting con (char)
    // para
    // convertir un entero en un carácter.
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            char randomcharacter = (char) (Math.random() * (126 - 32) + 32);
            System.out.print(randomcharacter);
            if (i == 100 || i == 200 || i == 300 || i == 400 || i == 500 || i == 600 || i == 700 || i == 800
                    || i == 900)
                System.out.print("\n");
        }
    }
}