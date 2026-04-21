package tercer_trimestre.mundial;

public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista() {
        super();
    }

    // constructor con parametros
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    // getters y setter
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println("juega partido");
    }

    public void entrenar() {
        System.out.println("entrena");
    }

    @Override
    public String toString() {
        return super.toString() + "\nFutbolista [dorsal= " + getDorsal() + " demarcacion= " + getDemarcacion() + "]";
    }
}
