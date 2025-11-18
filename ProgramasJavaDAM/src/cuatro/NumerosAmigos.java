package cuatro;

public class NumerosAmigos {

    private int entero1;
    private int entero2;

    public NumerosAmigos(int entero1, int entero2) {
        this.entero1 = entero1;
        this.entero2 = entero2;
    }

    public int sumaDivisoresP(int entero) { // metodo para saber la suma de los divisores de un numero
        int suma = 0;
        for (int i = 1; i < entero; i++)
            if (entero % i == 0)
                suma += i;
        return suma;
    }

    public boolean sonAmigos() { // metodo para comparar la suma de los divisores de 1
                                 // numero con el otro y viceversa
        if (entero1 == sumaDivisoresP(entero2) && entero2 == sumaDivisoresP(entero1))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        NumerosAmigos numAmig1 = new NumerosAmigos(220, 284);
        System.out.println(numAmig1.sonAmigos());
    }
}
