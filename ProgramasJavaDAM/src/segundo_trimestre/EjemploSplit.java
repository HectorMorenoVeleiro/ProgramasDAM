package segundo_trimestre;

public class EjemploSplit {

    public static void main(String[] args) {
        // Una cadena de 10 palabras
        String frase = "Aprender a programar en Java requiere práctica constante y mucha paciencia diaria";

        // Usamos split(" ") para obtener un array donde cada palabra sea un elemento
        String[] palabrasArray = frase.split(" ");

        // Mostramos el resultado
        System.out.println("Numero de palabras encontradas: " + palabrasArray.length);

        System.out.println("--- Contenido del Array ---");
        for (int i = 0; i < palabrasArray.length; i++) {
            System.out.println("Posicion [" + i + "]: " + palabrasArray[i]);
        }
    }
}
