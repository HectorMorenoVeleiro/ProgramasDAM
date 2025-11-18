package cuatro;

public class NumerosAmigos {

    public static int sumaDivisoresP(int entero) { // metodo para saber la suma de los divisores de un numero
        int suma = 0;
        for (int i = 1; i < entero; i++)
            if (entero % i == 0)
                suma += i;
        return suma;
    }

    public static boolean sonAmigos(int entero1, int entero2) { // metodo para comparar la suma de los divisores de 1
                                                                // numero con el otro y viceversa
        if (entero1 == sumaDivisoresP(entero2) && entero2 == sumaDivisoresP(entero1))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Are they friends? --> " + sonAmigos(284, 220));
    }
}
