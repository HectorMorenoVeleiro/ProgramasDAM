package ejerciciosnumerosaleatorios;

public class Ejercicio19 {
    // Escribe un programa que muestre 50 números enteros aleatorios comprendidos
    // entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
    // luego
    // el máximo de los pares el mínimo de los impares y la media de todos los
    // números generados.
    public static void main(String[] args) {
        int numeroPares = 0, suma = 0, numeroImpares = 0, numeroDelMenos100Al200;
        for (int i = 0; i < 50; i++) {
            numeroDelMenos100Al200 = (int) (Math.random() * 300 - 100);
            if (numeroDelMenos100Al200 % 2 == 0)
                numeroPares++;
            else
                numeroImpares++;
            suma += numeroDelMenos100Al200;
        }
        double media = (double) suma / 50;
        System.out.println("Hay [" + numeroPares + "] numeros pares, [" + numeroImpares + "] numeros impares y " +
                "su media es : [" + media + "]");
    }
}
