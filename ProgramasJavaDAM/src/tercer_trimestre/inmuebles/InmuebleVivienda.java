package tercer_trimestre.inmuebles;

public class InmuebleVivienda extends Inmueble {

    protected int numeroHabitaciones;
    protected int numeroBaños;

    public InmuebleVivienda(int ID, int area, String direccion, int numeroHabitaciones,
            int numeroBaños) {
        super(ID, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(int numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

    public void imprimir() {
        super.imprimir();
    }

    @Override
    public String toString() {
        return "InmuebleVivienda [numeroHabitaciones=" + numeroHabitaciones + ", numeroBaños=" + numeroBaños + "]";
    }

}
