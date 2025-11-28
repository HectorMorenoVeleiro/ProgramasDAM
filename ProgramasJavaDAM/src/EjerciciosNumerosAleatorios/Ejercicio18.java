package ejerciciosnumerosaleatorios;

import java.util.Objects;

public class Ejercicio18 {
    // Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
    // sustituir el color blanco por colores más alegres. Realiza un programa que
    // genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
    // cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
    // que
    // debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
    // violeta y
    // naranja.
    public static void main(String[] args) {
        String colorDormitorio1, colorDormitorio2 = null, colorDormitorio3 = null;
        String[] colorAleatorio = new String[] { "rojo", "azul", "verde", "amarillo", "violeta", "naranja" };
        colorDormitorio1 = colorAleatorio[(int) (Math.random() * colorAleatorio.length)];
        while (colorDormitorio1.equals(colorDormitorio2) || Objects.equals(colorDormitorio2, colorDormitorio3)
                || colorDormitorio1.equals(colorDormitorio3)) {
            colorDormitorio2 = colorAleatorio[(int) (Math.random() * colorAleatorio.length)];
            colorDormitorio3 = colorAleatorio[(int) (Math.random() * colorAleatorio.length)];
        }
        System.out.println("Color para el dormitorio1 : [" + colorDormitorio1 + "]");
        System.out.println("Color para el dormitorio2 : [" + colorDormitorio2 + "]");
        System.out.println("Color para el dormitorio3 : [" + colorDormitorio3 + "]");
    }
}
