package mapas;

import java.util.HashMap;
import java.util.Scanner;

public class Propuesto1 {

    /*
     * Ejercicio 6 -->
     * Implementa el control de acces al area restringida de un programa. Se debe
     * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
     * datos correctamente, el programa dira "Ha accedido al area restringida". El
     * usuario tendra un maximo de 3 oportunidades. Si se agotan las oportunidades
     * el porograma dira " Lo siento, no tiene acceso al area restringida". Los
     * nombres de usuario con sus correspondientes contraseñas deben estar
     * almacenados en una estructura de la clase HashMap.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create Scanner

        HashMap<String, String> mapRegister = new HashMap<String, String>(); // create Map for user-password methot

        int tryes = 0; // try to catch
        int b = 2; // index

        String user = "", password = ""; // enters for the loop
        String[] names = new String[] { "Pepe Vazquez", "Ana Garcia", "Luis Martinez", "Maria Lopez", "Carlos Ruiz",
                "Elena Sanz", "Jorge Castro" }; // names to work with
        String[] passwords = new String[] { "abcd", "1234", "qwer", "p0o9", "zxcv", "5678", "asdf" }; // passwords to
                                                                                                      // work with

        for (int i = 0; i < names.length || i < passwords.length; i++) { // loop to inicializate
            mapRegister.put(names[i], passwords[i]);
        }

        while (tryes < 3) { // while to count

            System.out.print("user's name -> "); // enter user
            user = sc.nextLine().trim();
            System.out.print("password's code -> "); // enter password
            password = sc.nextLine().trim();

            if (mapRegister.containsKey(user) && password.equals(mapRegister.get(user))) { // all right
                System.out.println("You've joined Area 51 (the zone)");
                break;
            } else if (mapRegister.containsKey(user)) // bad password
                System.out.println("password failed");
            else // bad user or bad everything
                System.out.println("you dumb right?");

            System.out.println("youve got " + b-- + " tryes left"); // showig tryes left
            tryes++; // index up
        }

        sc.close(); // close Scanner
    }
}
