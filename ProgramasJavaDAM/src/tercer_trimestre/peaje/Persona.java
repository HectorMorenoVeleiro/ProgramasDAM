package tercer_trimestre.peaje;

public class Persona {

    String nombre;
    String apellidos;
    String DNI;
    String fechaNacimiento;

    Persona(String nombre, String apellidos, String DNI, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void asignarVehiculo(Vehiculo vehiculo) {

    }

    public void desasignarVehiculo(Vehiculo vehiculo) {

    }

}
