package ejercicioscuentapropia;

import java.util.Arrays;

public class FuncionamientoStringsExplicado {

    /*
     * · StringBuffer -->
     * 
     * - El StringBuffer es una clase en Java que tiene como función
     * manejar cadenas de texto que cambian constantemente.
     * 
     * - Funciona basicamente como un contenedor dinámico, que posee
     * un arreglo interno de caracteres con una capacidad específica
     * y en la cual, al integrar texto, lo añades directamente en ese
     * arreglo, permitiendo que la capacidad del String se expanda
     * automáticamente
     *
     */

    public static void stringBuffer1() {

        /*
         * - El StringBuffer tiene diversos usos, además de diversas
         * formas de implementación al crear un objeto de esa clase.
         * Estas formas son -->
         * 
         */

        // Por el paso de un String al crear la cadena -->
        StringBuffer nombre = new StringBuffer("Renso");

        // Por el paso del tamaño del String, sin ninguna cadena de
        // texto previa -->
        StringBuffer apellidos = new StringBuffer(80);

        // Sin pasarle nada, creando una cadena vacía que, al ser
        // extensible y adaptable, se irá aumentando con la
        // implementación de cadenas de texto -->
        StringBuffer dirección = new StringBuffer();

        // ---------------------------------------------------------

        /*
         * - Ahora pasaré a mostrar los usos que puede tener el
         * StringBuffer en general -->
         * 
         */

        // Mirar el tamaño de la cadena que acabamos de crear como
        // objeto -->
        System.out.println(nombre.length());
        System.out.println(apellidos.length());
        System.out.println(dirección.length());

        // Mirar la capacidad de la cadena que acabamos de crear
        // como objeto -->
        System.out.println(nombre.capacity());
        System.out.println(apellidos.capacity());
        System.out.println(dirección.capacity());

        // Añadir una cadena de texto al final del objeto que
        // acabas de crear -->
        System.out.println(nombre.append(" Regino"));
        System.out.println(nombre.append(" Moreno Perez"));
        System.out.println(nombre.append(" Camino de las luces"));

        // también podemos trabajar con el StringBuffer usando un
        // objeto String para añadirselo a tu StringBuffer -->
        String otrosApellidos = new String("Moreno Perez");

        // Y ahora se lo añades a uno de tus objetos StringBuffer
        // y lo mostramos por pantalla -->
        nombre.append(otrosApellidos);
        System.out.println(nombre);

        // También se le puede dar la vuelta al String
        nombre.reverse();

        // E incluso hacerle un toString para convertirlo en una
        // cadena de caracteres
        nombre.toString();

        // También convertimos el StringBuffer a un String simple
        String experimentoFinalizado = nombre.toString();
        System.out.println(experimentoFinalizado);

    }

    public static void stringBuffer2() {

        /*
         * - Ya sabemos como trabajar ligeramente con StringBuffer's,
         * pero aun quedan muchas cosas por aprender, por ejemplo
         * como modificar las propias cadenas del String -->
         *
         */

        // Primero que nada crearemos un StringBuffer objeto nombre,
        // con otro String apellidos que le implementaremos mas
        // adelante -->
        StringBuffer nombre = new StringBuffer("EMMA");
        String apellidos = new String("MORENO");

        // Ahora añadimos el String "apellidos" al objeto StringBuffer
        // "nombre", para que quede el nombre con los apellidos dentro
        // del mismo objeto, y lo mostramos por pantalla -->
        nombre.insert(nombre.length(), apellidos); // introducimos String + tamaño
        System.out.println(nombre);

        // También podemos crear un StringBuffer nuevo y eliminarle partes
        // del mismo en base a su index (su tamaño + su longitud), y
        // suprimirá esa parte de la cadena -->
        StringBuffer nombre2 = new StringBuffer("RAUL JESUS TURRION");
        nombre2 = nombre2.delete(4, 10);
        System.out.println(nombre);

        // O por ejemplo decidir sustituir o darle a vuelta al StringBuffer
        // para que en vez de poner nombre y apellidos ponta apellidos y
        // nombre -->
        StringBuffer nombre3 = new StringBuffer("RAUL JESUS TURRION");
        String turri = nombre3.substring(0, 4) + nombre3.substring(10);
        System.out.println("y sale: " + turri);

        // Por ultimo saber que siempre puedes mostrar un StringBuffer como
        // una cadena de caracteres pasada a un toString -->
        StringBuffer nombre4 = new StringBuffer("TURRION");
        String cadena = nombre4.toString();
        System.out.println(cadena);

    }

    public static void cadenas1() {

        /*
         * - Aquí trabajaremos con el uso de cadenas de caracteres en forma de
         * Strings, para ver como manejarlos y las propiedades que tiene
         * también -->
         * 
         */

        // Podemos crear una cadena de caracteres en base a los propios
        // caracteres -->
        char[] nombre1 = { 'p', 'e', 'p', 'e' };

        // O también lo podemos hacer en base a su index ASCII -->
        char[] nombre2 = { 112, 101, 112, 101 };

        // O le podemos dar un espacio en memoria pero siendo vacio -->
        char[] nombre3 = new char[4];

        // Evidentemente los mostraremos por pantalla
        System.out.println(Arrays.toString(nombre1)); // p e p e
        System.out.println(Arrays.toString(nombre2)); // p e p e
        System.out.println(Arrays.toString(nombre3)); // 0 0 0 0

        // -----------------------------------------------------------------

        /*
         * - Ahora vamos a mostrar como se pueden convertir estos caracteres a
         * objetos String para un uso mas interesante -->
         * 
         */

        // Pasándolo como objeto para trabajar con el -->
        String cadena1 = new String(nombre1);
        System.out.println(cadena1);

        // Creando un objeto pero dandole el valor de String de la
        // cadena -->
        String cadena2 = String.valueOf(nombre2);
        System.out.println(cadena2);

        // Crea un objeto String vacío y velo llenando con un fori
        // y ve llenandolo con los caracteres del char de arriba
        String cadena3 = "";
        for (int i = 0; i < nombre3.length; i++)
            cadena3 += nombre3[i];
        System.out.println(cadena3);

    }

    public static void cadena2() {

        /*
         * - Ahora vamos a ver formas distintas de construir cadenas en java
         * en base a arrays de caracteres (String en base a charArray).
         * Es un proceso simple pero util para conocer -->
         * 
         */

        // Primero los arrays de caracteres -->

        // Array por caracteres -->
        char[] letras = { 'h', 'o', 'l', 'a' };

        // Array por ASCII -->
        char[] bytes = { 74, 97, 118, 97 };

        // Array por caracteres (mayor) -->
        char[] datos = { 'a', 'b', 'c', 'd', 'e', 'f' };

        // -----------------------------------------------------------------
        // Luego los pasas a String por objeto, y los valores que les pasas
        // por objeto -->

        // Por letras -->
        String saludo = new String(letras);

        // Por bytes (char/ASCII) -->
        String lenguaje = new String(bytes);

        // Por tramo de cadena de caracteres -->
        String subcadena = new String(datos, 2, 3);

        // ------------------------------------------------------------------
        // Ahora como es de esperar, se muestra el resultado por pantalla -->
        System.out.println(saludo);
        System.out.println(lenguaje);
        System.out.println(subcadena);

    }

    public static void cadena3() {

        /*
         * - Acabamos de ver el proceso de cambiar un char[] a un String
         * , así que es bueno saber también no solo que se puede hacer
         * lo contrario, si no ver como es que se haría justamente
         * 
         */

        // Primero que nada es importante crear los objetos String,
        // ambos por cadena de caracteres entre comillas ("") -->
        String cadena1 = "Hola";
        String cadena2 = "Java";

        // Lo convertimos a cadena de caracteres por su própio
        // comando ya usable en Java (toCharArray) -->
        char[] array1 = cadena1.toCharArray();
        char[] array2 = cadena2.toCharArray();

        // Verificación de aquello que queremos imprimir
        System.out.println("Primer caracter de Array1 --> " + array1[0]); // 'H'
        System.out.println("Segundo caracter de Array2 --> " + array2[array2.length - 1]);

        // Y muestras ambos arrays enteros por pantalla para confirmar
        // posiciones -->
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }

    public static void cadena4() {

        /*
         * - Ahora que ya sabemos como crear una cadena y como modificar
         * y trabajar con ellas de forma muy simplista, vamos a
         * intentar comprender un poco mas el funcionamiento de las mismas
         * para que resulte mas útil comprender porque y como se usan
         * y podamos simular ciertos contextos brevemente -->
         * 
         */

        // primero creamos los Strings de forma distinta
        // cada vez -->

        // por parametro (cadena) -->
        String cad1 = "Pepe";

        // por objeto String new String -->
        String cad2 = new String("Lionel");

        // pasandole otro objeto al String -->
        String cad3 = new String(cad2);

        // haciendole lo mismo pero pasandole obj como
        // parametro -->
        String cad4 = cad2;

        // Ahora lo muestras por pantalla -->
        System.out.println(cad1 + "\n" + cad2 + "\n" +
                cad3 + "\n" + cad4);

    }

}
