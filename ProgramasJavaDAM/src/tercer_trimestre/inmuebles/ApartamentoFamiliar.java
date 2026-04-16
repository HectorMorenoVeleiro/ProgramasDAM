package tercer_trimestre.inmuebles;

public class ApartamentoFamiliar extends Apartamento {

    protected static double valorArea = 2000;

    protected int valorComunidad;

    public ApartamentoFamiliar(int ID, int area, String direccion, int numeroHabitaciones, int numeroBaños,
            int valorComunidad) {
        super(ID, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorComunidad = valorComunidad;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de la comunidad = $" + valorComunidad);
        System.out.println();
    }

}
