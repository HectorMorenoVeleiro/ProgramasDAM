package dos;

import java.util.Arrays;

public class ArtifuloCientifico {
    //  Los articulos cientificos contienen los siguientes metadatos: nombre del
    //  articulo, autor, palabras claves, nombre de la publicacion, año y resumen

    String nombre;
    String autor;
    //  array de tres palabras clave
    String[] palabrasClave = new String[3];
    String publicacion;
    int anno;
    String resumen;

    //  Metodo constructor 1
    ArtifuloCientifico(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    //  Metodo constructor 2
    ArtifuloCientifico(String nombre, String autor, String[] palabrasClave, String publicaicon, int anno){
        this(nombre, autor);
        this.palabrasClave = palabrasClave;
        this.publicacion = publicaicon;
        this.anno = anno;
    }

    public ArtifuloCientifico(String titulo, String autor, String[] palabrasClave,
                              String publicacion, int anno, String resumen) {
        this(titulo, autor, palabrasClave, publicacion, anno);
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        return "ArtifuloCientifico{" + "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", palabrasClave=" + Arrays.toString(palabrasClave) +
                ", publicacion='" + publicacion + '\'' +
                ", anno=" + anno +
                ", resumen='" + resumen + '\'' +
                '}';
    }


}
