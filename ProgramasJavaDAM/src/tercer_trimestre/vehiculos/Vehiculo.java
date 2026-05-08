package tercer_trimestre.vehiculos;

public class Vehiculo {

    // atrib km/h
    protected double velAct;
    protected double velMax;

    Vehiculo(double velAct, double velMax) {
        this.velAct = velAct;
        this.velMax = velMax;
    }

    // deberian ser metodos abstractos
    void acelerar(double velocidad) {
        if (this.velMax <= velocidad)
            System.out.println("No puedes ir mas rapido de la velocidad maxima: " + this.velMax);
        else
            this.velAct += velocidad;
    }

    void frenar(double velocidad) {
        if (this.velAct <= velocidad)
            System.out.println("No se puede reducir la velocidad a menos de 0 km/h.");
        else
            this.velAct -= velocidad;
    }

    public String imprimir() { // =toString
        return "Vehiculo: \n[\nVelocidad Actual= " + velAct + "\nVelocidad maxima= " + velMax + "\n]\n";
    }
}
