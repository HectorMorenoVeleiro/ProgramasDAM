package tercer_trimestre.bucle;

import java.util.Random;

public class Escalador extends Ciclista {

    // Atributo que define la acelaración promedio de un escalador
    private double aceleracionPromedio;
    // Atributo que define el grado de rampa soportado por un escalador
    private double gradoRampa;

    public Escalador(int dorsal, String nombre, double aceleraciónPromedio, double gradoRampa) {
        super(dorsal, nombre);
        this.aceleracionPromedio = aceleraciónPromedio;
        this.gradoRampa = gradoRampa;
    }

    protected double getAceleraciónPromedio() {
        return aceleracionPromedio;
    }

    protected void setAceleraciónPromedio(double aceleraciónPromedio) {
        this.aceleracionPromedio = aceleraciónPromedio;
    }

    protected double getGradoRampa() {
        return gradoRampa;
    }

    protected void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    protected void imprimir() {
        super.imprimir(); // Invoca el método imprimir de la clase padre
        System.out.println("Aceleración promedio = " + aceleracionPromedio);
        System.out.println("Grado de rampa = " + gradoRampa);
    }

    /**
     * Método que devuelve el tipo de ciclista
     * 
     * @return Un valor String con el texto “Es un escalador”
     */
    protected String imprimirTipo() {
        return "Es un escalador";
    }

    @Override
    public void correrEtapa(int tiempoMinimo, int tiempoMaximo) {
        Random random = new Random();

        int tiempoEtapa = (random.nextInt((tiempoMaximo - tiempoMinimo) + 1) + tiempoMinimo)
                - ((5 * (int) aceleracionPromedio) + (4 * (int) gradoRampa));

        this.tiempo = tiempoEtapa;
        this.tiempoAcumulado += tiempoEtapa;

        System.out.println(nombre + " ha terminado la etapa en: " + tiempoEtapa + " segundos");
    }

}