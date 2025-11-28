package ejerciciosnumerosaleatorios;

public class Ejercicio1 {
    // Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
    // también la suma total (los puntos que suman entre los tres dados).
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            int tirada = (int) (Math.random() * 6 + 1);
            suma += tirada;
        }
        System.out.println("suma total : \t [" + (suma) + "]");
    }
}
