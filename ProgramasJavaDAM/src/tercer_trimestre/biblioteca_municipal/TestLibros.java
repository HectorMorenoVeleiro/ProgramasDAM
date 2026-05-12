package tercer_trimestre.biblioteca_municipal;

public class TestLibros {

    public static void main(String[] args) {
        Libro l1 = new Libro("Los versos satanicos", "Pedro Sanchez", 1300, "Demonio", "Wikipedia");
        Libro l2 = new Libro("El manifiesto del partido comunista", "Abascal", 1900, "Santillana", "Wikipedia");
        Libro l3 = new Libro("Mi lucha", "Ramirez Fermin Blakcy", 1930, "Pintor Austriaco Frustrado", "Wikipedia");
        Libro l4 = new Libro("El codigo DaVinci", "Abao jandroAle", 1570, "Pepe", "Wikipedia");

        Biblioteca biblioteca = new Biblioteca("Historia de España");

        biblioteca.añadirLibro(l1);
        biblioteca.añadirLibro(l2);
        biblioteca.añadirLibro(l3);
        biblioteca.añadirLibro(l4);

        biblioteca.listarLibros();
    }
}
