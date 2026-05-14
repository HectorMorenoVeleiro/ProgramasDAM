package tercer_trimestre.formacion;

public class Delantero extends Jugador {

    int golesAnotados;

    public Delantero(int añosExperiencia, boolean esNacional, boolean esTitular, int golesAnotados) {
        super(añosExperiencia, esNacional, esTitular);
        this.golesAnotados = golesAnotados;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Delantero: \ngolesAnotados= " + getGolesAnotados());
    }

}
