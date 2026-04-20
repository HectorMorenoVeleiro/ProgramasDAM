package tercer_trimestre.tienda_mascotas;

public class Mascota {

    // todos los animales tienen nombre, edad y color
    protected String nombre;
    protected String color;
    protected int edad;
    protected double precio;
    protected final double precioBase = 335.56d;

    // ctr completo
    public Mascota(String nombre, String color, int edad) {
        super();
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    // getters + setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularPrecioVentaFinal() {
        setPrecio(precioBase);
        return getPrecio();
    }

    // sonido
    public void sonido() {
        System.out.println("Las mascotas hacen ruido");
    }

    // toString
    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre + ", color=" + color + ", edad=" + edad + ", precio=" + precio + "]";
    }

}
