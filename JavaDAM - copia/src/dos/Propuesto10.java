package dos;

import java.util.Scanner;

/* 9. Implementa una clase consumo, la cual forma parte de la centralita electrónica de un coche y tiene las siguientes
características:
Atributos:

kms. Kilómetros recorridos por el coche,
litros. Litros de combustible consumido,
vmed. Velocidad media,
pgas. Precio de la gasolina.

Métodos:
getTiempo. Indicará el tiempo empleado en realizar el viaje.
consumoMedio. Consumo medio del vehiculo (en litros cada 100 kilómetros).
consumoEuros. Consumo medio del vehiculo (en euros cada 100 kilómetros).
No olvides crear un constructor para la clase que establezca el valor de los atributos. Elige el tipo de datos más
apropiado para cada atributo.*/

public class Propuesto10 {

    double kms;
    double litros;
    double vmed;
    double pgas;
    double tiempo;

    public static Scanner sc = new Scanner(System.in);

    public Propuesto10() {
        this.kms = 0;
        this.litros = 0;
        this.vmed = 0;
        this.pgas = 0;
        this.tiempo = 0;
    }

    public double getTiempo() {
        System.out.println("cuantos km recorrio el coche");
        kms = sc.nextDouble();
        System.out.println("a que velocidad iba el coche?");
        vmed = sc.nextDouble();
        tiempo = kms * vmed;
        return tiempo;
    }

    public double consumoMedio() {
        return litros*100/kms;
    }

    public void consumoEuros() {
        pgas = kms / 100;
        System.out.println("pagas" + pgas + "€/km");
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getVmed() {
        return vmed;
    }

    public void setVmed(double vmed) {
        this.vmed = vmed;
    }

    public double getPgas() {
        return pgas;
    }

    public void setPgas(double pgas) {
        this.pgas = pgas;
    }

    
}
