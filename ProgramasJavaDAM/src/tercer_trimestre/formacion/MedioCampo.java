package tercer_trimestre.formacion;

public class MedioCampo extends Jugador {

    int asistenciasRealizadas;

    public MedioCampo(int añosExperiencia, boolean esNacional, boolean esTitular, int asistenciasRealizadas) {
        super(añosExperiencia, esNacional, esTitular);
        this.asistenciasRealizadas = asistenciasRealizadas;
    }

    public int getAsistenciasRealizadas() {
        return asistenciasRealizadas;
    }

    public void setAsistenciasRealizadas(int asistenciasRealizadas) {
        this.asistenciasRealizadas = asistenciasRealizadas;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("MedioCampo: \nasistenciasRealizadas= " + getAsistenciasRealizadas());
    }

}
