package tercer_trimestre.biblioteca_municipal;

import java.util.ArrayList;

public class Biblioteca {

    String nombre;
    ArrayList<Libro> libros = new ArrayList<>();

    Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    void añadirLibro(Libro libro) {
        libros.add(libro);
    }

    void listarLibros() {
        for (Libro libro : libros) {
            libro.imprimir();
        }
    }

}
