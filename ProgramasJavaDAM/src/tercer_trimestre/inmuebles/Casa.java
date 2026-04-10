package tercer_trimestre.inmuebles;

public class Casa extends InmuebleVivienda {

    protected int numeroPisos;

    public Casa(int ID, int area, String direccion, int numeroHabitaciones, int numeroBaños,
            int numeroPisos) {
        super(ID, area, direccion, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    /* imprimir */

    // imprimir
    public void imprimir() {
        super.imprimir();
    }

    @Override
    public String toString() {
        return "Casa [numeroPisos=" + numeroPisos + "]";
    }

}
