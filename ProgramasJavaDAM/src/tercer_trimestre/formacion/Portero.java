package tercer_trimestre.formacion;

public class Portero extends Jugador {

    int golesRecibidos;

    public Portero(int añosExperiencia, boolean esNacional, boolean esTitular, int golesRecibidos) {
        super(añosExperiencia, esNacional, esTitular);
        this.golesRecibidos = golesRecibidos;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Portero: \ngolesRecibidos= " + getGolesRecibidos());
    }

}
