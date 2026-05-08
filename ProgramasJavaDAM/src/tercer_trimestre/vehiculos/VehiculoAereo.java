package tercer_trimestre.vehiculos;

public class VehiculoAereo extends Vehiculo implements Alas, Reactor {

    VehiculoAereo(double velAct, double velMax) {
        super(velAct, velMax);
    }

    void despegar() {
        System.out.println("DESPEGANDO...");
    }

    void aterrizar() {
        System.out.println("ATERRIZANDO...");
    }

    void volar() {
        System.out.println("VOLANDO...");
    }

    public void encender() {
        System.out.println("MOTOR DE REACCION ENCENDIDO");
    }

    public void apagar() {
        System.out.println("MOTOR DE REACCION APAGADO");
    }

    public void soltarTrenAterrizaje() {
        System.out.println("SUELTA TREN ATERRIZAJE");
    }

    public void subirTrenAterrizaje() {
        System.out.println("SUBE TREN ATERRIZAJE");
    }

}
