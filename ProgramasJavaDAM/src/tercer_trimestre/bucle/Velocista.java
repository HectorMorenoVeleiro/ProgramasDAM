package tercer_trimestre.bucle;

import java.util.Random;

public class Velocista extends Ciclista {

    private double potenciaPromedio; /* Atributo que define la potencia promedio de un velocista */
    private double velocidadPromedio; /* Atributo que define la velocidad promedio de un velocista */

    public Velocista(int dorsal, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(dorsal, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    protected double getvelocidadPromedio() {
        return velocidadPromedio;
    }

    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    protected void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Potencia promedio = " + potenciaPromedio);
        System.out.println("Velocidad promedio = " + velocidadPromedio);
    }

    protected String imprimirTipo() {
        return "Es un velocista";
    }

    /*
     * PODRIAMOS CAMBIAR LA FORMA EN QUE CORRE LA ETAPA Y CALCULA LOS TIEMPOS?????
     */
    public void correrEtapa(int tiempoMinimo, int tiempoMaximo) {
        Random random = new Random();

        int tiempoDeEstaEtapa = random.nextInt((tiempoMaximo - tiempoMinimo) + 1) + tiempoMinimo;

        this.tiempo = tiempoDeEstaEtapa;

        this.tiempoAcumulado += tiempoDeEstaEtapa;

    }

}