package discoteca;

public class GestorDiscos {

    public static Disco[] discos = new Disco[100]; // Array de discos

    /* METODOS */

    // crear la coleción de discos -->
    public static void crearColeccion() {
        for (int i = 0; i < discos.length; i++) { // fori para cada disco
            discos[i] = new Disco(); // crear nuevo disco
        } // for
    } // crearColección

    // muestreo de datos(test) -->
    public static void mockDiscos() {
        discos[0] = new Disco(
                "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        discos[1] = new Disco(
                "FGHQ64", "Metallica", "Black album", "hard rock", 46);
        discos[2] = new Disco(
                "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
    } // mockDiscos

} // class
