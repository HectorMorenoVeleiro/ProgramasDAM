package tercer_trimestre.biblioteca_municipal;

public class Libro {

    String titulo;
    String autor;
    int anoPublicacion;
    String editorial;
    String refBiblio;

    Libro(String titulo, String autor, int anoPublicacion, String editorial, String refBiblio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.editorial = editorial;
        this.refBiblio = refBiblio;
    }

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

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getRefBiblio() {
        return refBiblio;
    }

    public void setRefBiblio(String refBiblio) {
        this.refBiblio = refBiblio;
    }

    void imprimir() {
        System.out.println("Libro");
        System.out.println("[");
        System.out.println("titulo= " + getTitulo());
        System.out.println("autor= " + getAutor());
        System.out.println("anoPublicacion= " + getAnoPublicacion());
        System.out.println("editorial= " + getEditorial());
        System.out.println("refBiblio= " + getRefBiblio());
        System.out.println("]\n");
    }

}
