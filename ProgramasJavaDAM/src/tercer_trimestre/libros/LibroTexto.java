package tercer_trimestre.libros;

public class LibroTexto extends Libro {

    // atributes
    protected int curso;

    // ctr
    public LibroTexto(String titulo, String autor, int curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    // getters + setters
    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    // toString
    @Override
    public String toString() {
        String str = super.toString();
        return "LIBRO TEXTO \n " + str + " \nCurso: " + getCurso();
    }

}
