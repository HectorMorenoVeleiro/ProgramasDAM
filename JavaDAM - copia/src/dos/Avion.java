package dos;

public class Avion extends Object {

    final static String LOKI = "Lockheed";

    private String nombreFabricante;
    private int numeroMotores;

    public Avion(String nombreFabricante, int numeroMotores) {
        super();
        this.nombreFabricante = nombreFabricante;
        this.numeroMotores = numeroMotores;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    @Override
    public String toString() {
        return "Avion [nombreFabricante=" + nombreFabricante + ", numeroMotores=" + numeroMotores + "]";
    }

    // Un método denominado cambiarFabricante(Avion a), que recibe como parámetro un
    // objeto de tipo Avión y le cambia el valor de su atributo fabricante a un
    // valor predefinido "Loockhead".

    public void cambiarFabricante(Avion avion) {
        this.setNombreFabricante(avion.getNombreFabricante());
    }

}
