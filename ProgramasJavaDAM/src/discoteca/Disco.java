package discoteca;

/*
    Disco.java
    Definición de la clase Disco
    @author Luis josé Sánchez 
*/

public class Disco {

    // atributos -->
    private String codigo = "LIBRE";
    private String autor;
    private String titulo;
    private String genero;
    private int duracion; // duración total en minutos
    private final String rayita = "\n------------------------------------------";

    /* METODOS */

    // constructor por defecto -->
    public Disco() {
        this.autor = null;
        this.titulo = null;
        this.genero = null;
        this.duracion = 0;
    }

    // constructor con todos los parámetros -->
    public Disco(String codigoIn, String autorIn, String tituloIn, String generoIn, int duracionIn) {
        this.codigo = codigoIn;
        this.autor = autorIn;
        this.titulo = tituloIn;
        this.genero = generoIn;
        this.duracion = duracionIn;
    }

    // constructor sin código -->
    public Disco(String autorIn, String tituloIn, String generoIn, int duracionIn) {
        // TODO: ya veremos como implementar el código
        this.autor = autorIn;
        this.titulo = tituloIn;
        this.genero = generoIn;
        this.duracion = duracionIn;
    }

    // getters y setters -->
    public String getCodigo() {
        return codigo;
    } // getCodigo

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    } // setCodigo

    public String getAutor() {
        return autor;
    } // getAutor

    public void setAutor(String autor) {
        this.autor = autor;
    } // setAutor

    public String getGenero() {
        return genero;
    } // getGenero

    public void setGenero(String genero) {
        this.genero = genero;
    } // setGenero

    public String getTitulo() {
        return titulo;
    } // getTitulo

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    } // setTitulo

    // toString -->
    public String toString() {
        String cadena = "";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += rayita;
        return cadena;
    } // toString
} // class
