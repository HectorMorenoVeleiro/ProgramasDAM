package EjerciciosCuentaPropia;

public class sumatorioNumeroMayorDeTres {

    private static int mayor = 0;

    public int from1To2(int num1, int num2) {
        mayor = (num1 + num2 + Math.abs(num1 - num2)) / 2;
        return mayor;
    }

    public int fromXToY(int[] numeros, int indice) {
        if (indice == numeros.length - 1) {
            // Caso base: último elemento
            return numeros[indice];
        }
        if (numeros.length > 2) {
            // Obtiene el máximo del resto del array
            int maxResto = fromXToY(numeros, indice + 1);
            // Compara el elemento actual con el máximo del resto
            return Math.max(numeros[indice], maxResto);
        } else
            return from1To2(numeros[0], numeros[1]);
    }
}
