package discoteca;

import java.io.Serializable; // se implementa para poder guardar objetos 
import java.util.Random;

/*
    Disco.java
    Definición de la clase Disco
    @author Luis josé Sánchez 
*/

public class Disco implements Serializable {

    Random rd = new Random(); // creamos un random para crear el codigo aleatoriamente -->

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
    } // Disco

    // constructor con todos los parámetros -->
    public Disco(String codigoIn, String autorIn, String tituloIn, String generoIn, int duracionIn) {
        this.codigo = codigoIn;
        this.autor = autorIn;
        this.titulo = tituloIn;
        this.genero = generoIn;
        this.duracion = duracionIn;
    } // Disco

    // constructor sin código -->
    public Disco(String autorIn, String tituloIn, String generoIn, int duracionIn) {
        this.codigo = getCodigoRandom();
        this.autor = autorIn;
        this.titulo = tituloIn;
        this.genero = generoIn;
        this.duracion = duracionIn;
    } // Disco

    // getters y setters -->
    public String getCodigo() {
        return codigo;
    } // getCodigo

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    } // setCodigo

    public String getCodigoRandom() { // setter del código para el caso de no ser pasado -->
        String charCode = "";
        for (Disco disco : GestorDiscos.discos) {
            for (int i = 0; i < 4; i++) {
                charCode += (char) (rd.nextInt('A', 'Z' + 1));
            } // for
            charCode += rd.nextInt(10, 99);
            if (disco.codigo.equals(charCode)) {
                return getCodigoRandom();
            } // if
        } // foreach
        return charCode;
    } // getCodigoRandom

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

    public int getDuracion() {
        return duracion;
    } // getDuracion

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    } // setDuracion

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

    // Hay que hacerlo con ArrayList --> new class

} // class
