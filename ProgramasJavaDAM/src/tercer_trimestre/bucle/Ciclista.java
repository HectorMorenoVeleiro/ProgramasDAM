package tercer_trimestre.bucle;

import java.util.Random;

public class Ciclista {

    protected int dorsal;
    protected String nombre; // Atributo que define el nombre del ciclista
    protected int posicionGen = 0;
    protected int tiempo = 0; // SEGUNDOS supongo parcial
    protected int tiempoAcumulado = 0; /* Atributo que define el tiempo acumulado de un ciclista */

    public Ciclista(int dorsal, String nombre) {
        this.dorsal = dorsal;
        this.nombre = nombre;
    }

    // abstract String imprimirTipo(); // velo, crono y escala

    /**
     * Simula tiempo que tarda ciclista en completar una etapa
     * 
     * @param tiempoMinimo EL tiempo minimo posible
     * 
     * @param tiempoMaximo El tiempo maximo posible
     */
    public void correrEtapa(int tiempoMinimo, int tiempoMaximo) {
        Random random = new Random();

        // generamos numero aleatorio entre minimo y maximo
        // formula -> random.nextInt((max - min) + 1) + min
        int tiempoDeEstaEtapa = random.nextInt((tiempoMaximo - tiempoMinimo) + 1) + tiempoMinimo;

        // 1. seteamos tiempo parcial etapa actual
        this.tiempo = tiempoDeEstaEtapa;

        // 2. acumulamos tiemop en totalCiclista
        this.tiempoAcumulado += tiempoDeEstaEtapa;

        System.out.println(nombre + " ha terminado la etapa en: " + tiempoDeEstaEtapa + " segundos.");
    }

    protected int getdorsal() {
        return dorsal;
    }

    protected void setdorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getPosicionGen(int posicionGen) {
        return posicionGen;
    }

    protected void setPosicionGen(int posicionGen) {
        this.posicionGen = posicionGen;
    }

    protected int getTiempo() {
        return tiempo;
    }

    protected void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * Método que devuelve el tiempo acumulado de un ciclista en una competencia
     * 
     * @return El tiempo acumulado de un ciclista en una competencia
     */
    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    protected void imprimir() {
        System.out.println("posicion = " + posicionGen);
        System.out.println("dorsal = " + dorsal);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Parcial = " + tiempo);
        System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
    }

}