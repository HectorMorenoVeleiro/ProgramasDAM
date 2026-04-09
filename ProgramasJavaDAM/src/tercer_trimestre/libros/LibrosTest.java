package tercer_trimestre.libros;

import java.util.ArrayList;
import java.util.List;

import tercer_trimestre.libros.Novelas.tipoNovela;

public class LibrosTest {

    public static void main(String[] args) {

        // 0. ArrayList de libros:
        List<Libro> coleccion = new ArrayList<Libro>();

        // 1. Objeto de la clase Libro (generico):
        Libro libroG = new Libro("Cien años de soledad", "Gabriel Garcia Marquez");
        libroG.setPrecio(45000);

        // 2. Objeto de la clase LibroTexto:
        LibroTexto libroT = new LibroTexto("Calculo Diferencial", "James Stewart", 1);
        libroT.setPrecio(8500);

        // 3. Objeto de la clase LibroTextoUNC:
        LibroTextoUNC libroUNC = new LibroTextoUNC("Fundamentos de Programacion", "S.Arévalo", 2,
                "Facultad de Ingeniería");
        libroUNC.setPrecio(32000);

        // 4. Objeto de clase novela:
        Novelas novelaH = new Novelas("El nombre de la rosa", "Umberto Eco", tipoNovela.HISTORICA);
        novelaH.setPrecio(52000);

        // 5. añades a ArrayList:
        coleccion.add(libroG);
        coleccion.add(libroT);
        coleccion.add(libroUNC);
        coleccion.add(novelaH);

        // 6. Muestras por toString:
        for (Libro libro : coleccion) {
            System.out.println(libro.toString());
        }
    }
}
