package tercer_trimestre.charlin;

public class Productos {
    private int id = 0;
    private String nombre;
    private String descripcion;
    private double precio = 0;

    public Productos(int id, String nombre, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void imprimir() {
        System.out.println("Productos{" +
                "\nid=" + id +
                ", \nnombre='" + nombre + '\'' +
                ", \ndescripcion='" + descripcion + '\'' +
                ", \nprecio=" + precio +
                "\n}");
    }
}