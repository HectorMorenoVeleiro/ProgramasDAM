package tercer_trimestre.peaje;

public abstract class Vehiculo {

    // ---- NO INSTANCIABLE ----------------------------------------------
    protected String placa; // Atributo que define la placa de un Vehiculo

    // ---- CONSTRUCTOR --------------------------------------------------
    Vehiculo(String placa) {
        this.placa = placa;
    }

    void imprimir() {
        System.out.println("[Placa: " + this.placa + "]");
    }

}
