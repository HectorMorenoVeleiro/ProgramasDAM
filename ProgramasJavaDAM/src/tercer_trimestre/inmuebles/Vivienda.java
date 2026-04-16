package tercer_trimestre.inmuebles;

public class Vivienda extends Inmueble {

    // atributo que identifica el num habitacion:
    protected int numHab;
    // atributo que identifica el num baños
    protected int numBan;

    // ctr
    public Vivienda(int ID, int area, String direccion, int numHab, int numBan) {
        super(ID, area, direccion);
        this.numHab = numHab;
        this.numBan = numBan;
    }

    // getters_setters
    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public int getNumBan() {
        return numBan;
    }

    public void setNumBan(int numBan) {
        this.numBan = numBan;
    }

    // datos inmueble para vivienda
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de habitaciones: " + getNumHab());
        System.out.println("Numero de baños: " + getNumBan());
    }

}
