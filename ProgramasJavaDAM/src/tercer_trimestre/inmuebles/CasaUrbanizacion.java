package tercer_trimestre.inmuebles;

public class CasaUrbanizacion extends CasaUrbana {

    /* atributes */

    // defines value per area
    protected static double valorArea = 2500;

    // define if theres an administrato value inside the house
    protected int valorComunidad;

    // define if it has a pool
    protected boolean tienePiscina;

    // define if it has deportive camps
    protected boolean tieneCanchas;

    // ctr
    public CasaUrbanizacion(int ID, int area, String direccion, int numHab, int numBan, int numPisos,
            int valorComunidad, boolean tienePiscina, boolean tieneCanchas) {
        super(ID, area, direccion, numHab, numBan, numPisos);
        this.valorComunidad = valorComunidad;
        this.tienePiscina = tienePiscina;
        this.tieneCanchas = tieneCanchas;
    }

    // calcularPrecioVenta method
    @Override
    protected double calcularPrecioVenta() {
        // return precioVenta = area * valor del MAP
        return getPrecioVenta() = getArea() * ;
    }

}
