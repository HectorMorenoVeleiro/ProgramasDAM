package tercer_trimestre.libros;

public class Libro {

    // La informacion de interes para un libro es: el titulo, el autor y el precio.
    // Los metodos de interes son: 206 ejercicios de programacion orientada a
    // objetos con Java y UML o un constructor para crear un objeto libro, con
    // título y autor como parametros.
    // O imprimir en pantalla el titulo, los autores
    // y el precio del libro o metodos get y set para cada atributo de un libro -->

    // atributes
    protected String titulo;
    protected String autor;
    protected double precio = 0d;

    // default ctr
    public Libro() {
    }

    // ctr titulo + autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // getters + setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // prestar

    // devolver

    // toString
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
    }

}
