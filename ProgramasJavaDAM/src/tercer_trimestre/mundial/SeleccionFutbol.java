package tercer_trimestre.mundial;

public class SeleccionFutbol {
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;

    // constructor, getter y setter
    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        super();
        this.id = id;
        Nombre = nombre;
        Apellidos = apellidos;
        Edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public void Concentrarse() {
        System.out.println("METODO CONCENTRARSE (clase seleccion futbol");
    }

    public void Viajar() {
        System.out.println("METODO VIAJAR (clase seleccion futbol");
    }
}
