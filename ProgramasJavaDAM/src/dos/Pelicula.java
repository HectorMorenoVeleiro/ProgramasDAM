package dos;

public class Pelicula {

    private String nombre;
    private String director;

    enum tipoGenero {
        ACCION, COMEDIA, DRAMA, TERROR, CIENCIAFICCION, FICCION, ROMANCE
    }

    private tipoGenero genero;
    private int duracion;
    private int año;
    private double calificacion;

    public Pelicula(String nombre, String director, tipoGenero genero, int duracion, int año, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public tipoGenero getGenero() {
        return genero;
    }

    public void setGenero(tipoGenero genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // metodos propios

    public boolean esPeliculaEpica() {
        boolean mayorATres;
        if (duracion > 3)
            mayorATres = true;
        else
            mayorATres = false;
        return mayorATres;
    }

    public boolean esSimilar(Pelicula otra) {
        if (this.getGenero() == otra.getGenero() && this.calcularValoracion().equals(otra.calcularValoracion()))
            return true;
        else
            return false;
    }

    public String calcularValoracion() {
        String valoracion = "";
        if (0 > calificacion && calificacion < 2)
            valoracion = "muy mala";
        else if (2 > calificacion && calificacion < 5)
            valoracion = "mala";
        else if (5 > calificacion && calificacion < 7)
            valoracion = "regular";
        else if (7 > calificacion && calificacion < 8)
            valoracion = "buena";
        else if (8 > calificacion && calificacion < 10)
            valoracion = "muy buena";
        return "la calificacion es [" + valoracion + "]";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
