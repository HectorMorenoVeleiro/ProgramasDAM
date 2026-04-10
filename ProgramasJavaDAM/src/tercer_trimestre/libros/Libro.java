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

    // mejora para implementar biblioteca
    protected boolean prestado;

    // get
    public boolean isPrestado() {
        return this.prestado;
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

    // TODO: Condiciones de repeticion de prestar+devolver

    // prestar
    public void prestar() {
        System.out.println("ACABAS DE PRESTAR");
        System.out.println(this.toString());
        this.prestado = true;
    }

    // devolver
    public void devolver() {
        System.out.println("NOS ACABAN DE DEVOLVER");
        System.out.println(this.toString());
        this.prestado = false;
    }

    // toString
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
    }

}
