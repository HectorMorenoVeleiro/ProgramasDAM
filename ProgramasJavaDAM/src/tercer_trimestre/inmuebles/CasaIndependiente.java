package tercer_trimestre.inmuebles;

public class CasaIndependiente extends CasaUrbana {

    // identifies value * area
    protected static double valorArea = 3000;

    // no own atributes

    // ctr
    public CasaIndependiente(int ID, int area, String direccion, int numHab, int numBan, int numPisos) {
        super(ID, area, direccion, numHab, numBan, numPisos);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println();
    }

}
