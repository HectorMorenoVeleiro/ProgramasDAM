package cuatro;

public class Persona {

    // ATRIBUTOS
    String nombre; // Atributo que identifica el nombre de una persona
    String apellidos; // Atributo que identifica los apellidos de una persona
    String paisNacimiento; // Atributo que identifica el pais de nacimiento de una persona
    char genero; // Atributo que identifica genero de una persona
    String númeroDocumentoIdentidad; // Atributo que identifica documento de identidad de una persona
    int añoNacimiento; // Atributo que identifica el año de nacimiento de una persona

    /**
     * Constructor de la clase Persona
     * 
     * @param nombre                   Parámetro que define el nombre de la persona
     * @param apellidos                Parámetro que define los apellidos de la
     *                                 persona
     * @param númeroDocumentoIdentidad Parámetro que define el número del documento
     *                                 de identidad de la persona
     * @param añoNacimiento            Parámetro que define el año de nacimiento
     *                                 de la persona
     */
    Persona(String nombre, String apellidos, String númeroDocumentoIdentidad, int añoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
    }

    // Constructor vacío
    public Persona() {
    }

    // Constructor con todos los parámetros
    Persona(String nombre, String apellidos, String númeroDocumentoIdentidad, int añoNacimiento, String paisNacimiento,
            char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", númeroDocumentoIdentidad="
                + númeroDocumentoIdentidad + ", añoNacimiento=" + añoNacimiento + "]";
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

    public String getNúmeroDocumentoIdentidad() {
        return númeroDocumentoIdentidad;
    }

    public void setNúmeroDocumentoIdentidad(String númeroDocumentoIdentidad) {
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    // Método que imprime en pantalla los datos de una persona
    void imprimir() {
        System.out.println("Nombre = " + this.nombre);
        System.out.println("Apellidos = " + this.apellidos);
        System.out.println("Número de documento de identidad = " + this.númeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + this.añoNacimiento);
        System.out.println("Pais de nacimiento = " + this.paisNacimiento);
        System.out.println("Género = " + this.genero);
    }
}