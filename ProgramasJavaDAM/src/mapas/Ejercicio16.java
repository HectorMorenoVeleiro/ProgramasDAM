package mapas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio16 {

    // Ejercicio 16
    // Realiza un programa que sepa decir la capital de un país (en caso de conocer
    // la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
    // principio, el programa solo conoce las capitales de España, Portugal y
    // Francia.
    // Estos datos deberán estar almacenados en un diccionario. Los datos sobre
    // capitales que vaya aprendiendo el programa se deben almacenar en el mismo
    // diccionario. El usuario sale del programa escribiendo la palabra “salir”.

    /*
     * public static void guardarEnArchivo(HashMap<String, String> mapa) {
     * File Archivo = new File("capitales.txt");
     * if (!Archivo.exists())
     * return;
     * 
     * try (BufferedWriter bw = new BufferedWriter(new FileWriter(Archivo))) {
     * String linea = " ";
     * while (linea bw.newLine()) != null .equals(" ")) {
     * String[] partes = linea.split(":");
     * if (partes.length == 2) {
     * mapa.put(partes[0], partes[1]);
     * }
     * }
     * }
     * }
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Creamos el HashMap: País (String) -> Capital (String) ->
        HashMap<String, String> capitales = new HashMap<String, String>();

        // Añadimos algunos datos iniciales (España, Madrid y Francia) con sus
        // respectivas capitales ->
        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");

        // Creamos una variable pais para buscarla en el bucle ->
        String pais;

        do { // Iniciamos un do-While ->
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = s.nextLine();

            // Condición para salir del bucle si pais = "salir" ->
            if (pais.equalsIgnoreCase("salir")) {
                break;
            }

            // Comprobamos si el país ya existe en nuestro HashMap
            if (capitales.containsKey(pais)) {
                System.out.println("La capital de " + pais + " es " + capitales.get(pais));
            } else {
                // Si no existe, le pedimos al usuario que nos enseñe su capital
                System.out.print("No conozco la respuesta ¿cuál es la capital de " + pais + "?: ");
                String nuevaCapital = s.nextLine();

                // Guardamos el nuevo conocimiento en el mapa
                capitales.put(pais, nuevaCapital);
                System.out.println("Gracias por enseñarme nuevas capitales");
            }
        } while (true); // lo hacemos whileTrue para que no cargue el pais "salir" antes de salir del
                        // bucle

        // Mensaje de salida ->
        System.out.println("¡Hasta luego!");
        s.close(); // Cerramos Scanner
    }

}