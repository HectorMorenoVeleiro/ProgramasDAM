package tercer_trimestre.vehiculos;

public class Acuatico extends Vehiculo implements Vela {

    enum terreno {
        SUPERFICIE, SUBMARINO
    }

    protected int capacPasajero;
    protected terreno tipoTerr;

    Acuatico(double velAct, double velMax, int capacPasajero, terreno tipoTerr) {
        super(velAct, velMax);
        this.capacPasajero = capacPasajero;
        this.tipoTerr = tipoTerr;
    }

    @Override
    void acelerar(double velocidad) {
        super.acelerar(velocidad);
    }

    @Override
    void frenar(double velocidad) {
        super.frenar(velocidad);
    }

    public void recomendarVelocidad(double velViento) {
        System.out.println("Salir a navegar ?????");
        if (velViento > 80)
            System.out.println("NO, la velocidad del viento es demasiado alta.");
        else
            System.out.println("SI, la velocidad del viento inferior a la maxima recomendable.");
        System.out.println("Velocidad del viento: " + velViento + " km/h.");
    }

}
