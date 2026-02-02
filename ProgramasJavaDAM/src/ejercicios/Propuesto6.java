package ejercicios;

public class Propuesto6 {
    /*
     * public static boolean esCapicua(int dato) {
     * Integer i = new Integer(dato);
     * String reverse = new StringBuffer(i.toString()).reverse().toString();
     * return i.toString()==reverse.toString();
     * }
     */

    public static boolean esCapicua(int dato) {
        Integer i = dato;
        String reverse = new StringBuffer(i.toString()).reverse().toString();

        // return i.toString() == reverse.toString();

        // El fallo está en comparar los dos Strings con "==" cuando eso
        // no se puede usar para comparar Strings, debería usarse un equals

        return i.toString().equals(reverse.toString());
    }

}
