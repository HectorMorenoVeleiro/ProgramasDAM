package dos;

public class AutomovilSegunEnunciado {

    // atributos
    private double motor; // Volumen en litros del cilindraje del motor de un automovil
    private String marca; // Nombre del fabricante
    private String modelo; //// Año de fabricacion
    private int numeroPuertas; // Cantidad de puertas
    private int cantidadAsientos; // Numero de asientos que tiene el vehiculo
    private int velocidadMaxima; // Velocidad maxima sostenida por el vehiculo en km/h
    private int velocidadActual; // Velocidad del vehiculo en un momento dado
    private boolean automatico;

    private enum tipoCombustible { // Valor enumerado de los posibles valores del mismo
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }

    tipoCombustible tCombustible;

    private enum tipoAutomovil { // Valor enumerado de los posibles valores del mismo
        CARRO_DE_CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }

    tipoAutomovil tAutomovil;

    private enum color { // Valor enumerado de los posibles colores del mismo
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, VIOLETA
    }

    color col;

    // metodo constructor this
    public AutomovilSegunEnunciado(double motor, String marca, String modelo, int numeroPuertas, int cantidadAsientos,
            int velocidadMaxima, int velocidadActual, tipoCombustible tCombustible, tipoAutomovil tAutomovil,
            color col, boolean automatico) {

        this.motor = motor;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.tCombustible = tCombustible;
        this.tAutomovil = tAutomovil;
        this.col = col;
        this.automatico = automatico;
    }

    // getters y setters
    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public tipoCombustible gettCombustible() {
        return tCombustible;
    }

    public void settCombustible(tipoCombustible tCombustible) {
        this.tCombustible = tCombustible;
    }

    public tipoAutomovil gettAutomovil() {
        return tAutomovil;
    }

    public void settAutomovil(tipoAutomovil tAutomovil) {
        this.tAutomovil = tAutomovil;
    }

    public color getCol() {
        return col;
    }

    public void setCol(color col) {
        this.col = col;
    }

    // metodos propios de clase
    public void condicionarVelocidad() {
        if (velocidadActual < 0) {
            System.out.println("no es posible ir a una velocidad negativa.");
        } else if (velocidadActual > velocidadMaxima) {
            System.out.println("el vehiculo no puede ir a mas de " + velocidadMaxima + " km/h.");
        } else {
        }
    }

    public void acelerar(int velocidadAcelerada) {
        condicionarVelocidad();
        velocidadActual = velocidadActual + velocidadAcelerada;
        if (velocidadActual > velocidadMaxima || velocidadActual < 0)
            System.out.println("No se puede ir a " + velocidadActual + " km/h");
        else
            System.out.println("La nueva velocidad es: " + velocidadActual);
    }

    public void desAcelerar(int velocidadDecelerada) {
        condicionarVelocidad();
        velocidadActual = velocidadActual - velocidadDecelerada;
        if (velocidadActual > velocidadMaxima || velocidadActual < 0) {
            System.out.println("No se puede ir a " + velocidadActual + " km/h");
        } else {
            System.out.println("La nueva velocidad es: " + velocidadActual);
        }
    }

    public void frenar() {
        velocidadActual = 0;
        System.out.println();
    }

    public void tiempoEstimadoViaje(double distanciaARecorrer) {
        distanciaARecorrer = distanciaARecorrer / velocidadActual;
        if (distanciaARecorrer <= 0) {
            System.out.println("No tiene sentido recorrer " + velocidadActual + " km");
        } else {
            System.out.println("El tiempo estimado es de: " + velocidadActual);
        }
    }

    // metodo que cuplica el objeto
    public AutomovilSegunEnunciado duplicaMiCoche() {
        AutomovilSegunEnunciado duplicado = this;
        return duplicado;
    }

    // metodo toString
    @Override               
    public String toString() {
        return super.toString();
    }
}
