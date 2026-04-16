package tercer_trimestre.inmuebles;

public class Casa extends Vivienda {

    // atributes
    protected int numPisos;

    // ctr
    public Casa(int ID, int area, String direccion, int numHab, int numBan,
            int numPisos) {
        super(ID, area, direccion, numHab, numBan);
        this.numPisos = numPisos;
    }

    // getters_setters
    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    // calcularPrecioVenta == can be aplicated --HEREDATED-- (not return 0 anymore)

    // print
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de pisos: " + numPisos);
    }

}
