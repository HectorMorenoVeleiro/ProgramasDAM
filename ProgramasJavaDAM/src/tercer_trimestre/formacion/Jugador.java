package tercer_trimestre.formacion;

public class Jugador extends Persona {

    boolean esTitular; // true: lo es | false: no lo es

    Jugador(int añosExperiencia, boolean esNacional, boolean esTitular) {
        super(añosExperiencia, esNacional);
        this.esTitular = esTitular;
    }

    public boolean isEsTitular() {
        return esTitular;
    }

    public void setEsTitular(boolean esTitular) {
        this.esTitular = esTitular;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Jugador: \nesTitular= " + isEsTitular());
    }
}
