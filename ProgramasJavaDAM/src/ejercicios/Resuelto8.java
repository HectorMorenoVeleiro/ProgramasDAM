package ejercicios;

public class Resuelto8 {

    public static boolean esCapicua(int numero) {
        boolean cap = false;
        String derecho = String.valueOf(numero);
        String reves = new StringBuilder(derecho).reverse().toString();
        int oremun = Integer.parseInt(reves);
        if (numero == oremun) {
            cap = true;
        }

        return cap;
    }
}
