package tercer_trimestre.vehiculos;

public class Terrestre extends Vehiculo implements Motor {

    enum tipoVehiculo {
        MILITAR, CIVIL
    }

    protected int cantLLantas;
    protected tipoVehiculo usoVeh;

    Terrestre(double velAct, double velMax, int cantLLantas, tipoVehiculo usoVeh) {
        super(velAct, velMax);
        this.cantLLantas = cantLLantas;
        this.usoVeh = usoVeh;
    }

    @Override
    void acelerar(double velocidad) {

    }

    @Override
    void frenar(double velocidad) {

    }

    public double calcularRevolucionesMotor(double fuerza, double radio) {
        // el numero de revoluciones es --> R = F * r
        return fuerza * radio;
    }
}
