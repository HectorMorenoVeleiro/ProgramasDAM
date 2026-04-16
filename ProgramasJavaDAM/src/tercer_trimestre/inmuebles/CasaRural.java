package tercer_trimestre.inmuebles;

public class CasaRural extends Casa {

    /* atributes */

    // value*area
    protected static double valorArea = 150000;
    // length till municipe center
    protected int distCab;
    // rural house's height
    protected int altitud;

    // ctr
    public CasaRural(int ID, int area, String direccion, int numHab, int numBan, int numPisos, int distCab,
            int altitud) {
        super(ID, area, direccion, numHab, numBan, numPisos);
        this.distCab = distCab;
        this.altitud = altitud;
    }

    // getters_setters
    public int getDistCab() {
        return distCab;
    }

    public void setDistCab(int distCab) {
        this.distCab = distCab;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    @Override
    protected double calcularPrecioVenta() {
        return getArea() * VALOR_METRO_CUADRADO.get("Casa Rural");
    }

    // print
    public void imprimir() {
        super.imprimir();
        System.out.println("Distancia la cabecera municipal: " + distCab + " km");
        System.out.println("Altitud sobre el nivel del mar: " + altitud + "\n");
    }

}
