package tercer_trimestre.bucle;

public class ContraRelojista extends Ciclista {

    // Atributo que define la velocidad máxima de un contrarrelojista
    private double velocidadMaxima;

    public ContraRelojista(int dorsal, String nombre, double velocidadMaxima) {
        super(dorsal, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    protected double getVelocidadMáxima() {
        return velocidadMaxima;
    }

    protected void setVelocidadMáxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    protected void imprimir() {
        super.imprimir(); // Invoca el método imprimir de la clase padre
        System.out.println("Velocidad MAXIMA = " + velocidadMaxima);
    }

    protected String imprimirTipo() {
        return "Es un constraRelojista";
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
