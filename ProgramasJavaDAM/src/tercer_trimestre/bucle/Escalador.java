package tercer_trimestre.bucle;

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

    /*
     * PODRIAMOS CAMBIAR LA FORMA EN QUE CORRE LA ETAPA Y CALCULA LOS TIEMPOS?????
     * 
     * @Override
     * public void correrEtapa(int tiempoMinimo, int tiempoMaximo) {
     * Random random = new Random();
     * 
     * // Generamos un número aleatorio entre el mínimo y el máximo inclusive
     * // La fórmula es: random.nextInt((max - min) + 1) + min
     * int tiempoDeEstaEtapa = random.nextInt((tiempoMaximo - tiempoMinimo) + 1) +
     * tiempoMinimo;
     * 
     * // 1. Seteamos el tiempo parcial de la etapa actual
     * this.tiempo = tiempoDeEstaEtapa;
     * 
     * // 2. Acumulamos el tiempo en el total del ciclista
     * this.tiempoAcumulado += tiempoDeEstaEtapa;
     * 
     * System.out.println(nombre + " ha terminado la etapa en: " + tiempoDeEstaEtapa
     * + " segundos.");
     * 
     * 
     * }
     */

}