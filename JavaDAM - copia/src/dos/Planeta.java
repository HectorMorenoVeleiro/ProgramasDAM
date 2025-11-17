package dos;

public class Planeta {

    // Atributos
    private String nombre = null;
    private int cantidadSatelites = 0;
    private double periodoOrbitalPlaneta = 0D; // En años terrestres.
    private double periodoRotacion = 0D; // En días terrestres
    private double masa = 0D; // Masa en kilos.
    private double volumen = 0D; // Volumen en km3.
    private int diametroKm = 0; // Diametro en km.
    private int distanciaMediaSol = 0; // Distancia en exp6 km.
    private boolean observable = false;

    public static final long UA = 149597870; // Unidades Astronomicas

    // Enumerado
    enum ComoEsPlaneta { // Enumerado que dice "como es el planeta".
        GASEOSO, TERRESTRE, ENANO
    }

    ComoEsPlaneta tPlaneta; // Atributo que dice como es el planeta.

    public Planeta() {
        // constructor por defecto (todo ceros).
    }

    // Constructor detallado
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametroKm,
            int distanciaMediaSol, ComoEsPlaneta tPlaneta, boolean observable, double periodoRotacion,
            double periodoOrbitalPlaneta) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.periodoOrbitalPlaneta = periodoOrbitalPlaneta;
        this.periodoRotacion = periodoRotacion;
        this.volumen = volumen;
        this.diametroKm = diametroKm;
        this.distanciaMediaSol = distanciaMediaSol;
        this.observable = observable;
        this.tPlaneta = tPlaneta;
    }

    // Getters and Setters
    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public double getPeriodoOrbitalPlaneta() {
        return periodoOrbitalPlaneta;
    }

    public void setPeriodoOrbitalPlaneta(double periodoOrbitalPlaneta) {
        this.periodoOrbitalPlaneta = periodoOrbitalPlaneta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public void setCantidadSatelites(int cantidadSatelites) {
        this.cantidadSatelites = cantidadSatelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametroKm() {
        return diametroKm;
    }

    public void setDiametroKm(int diametroKm) {
        this.diametroKm = diametroKm;
    }

    public int getDistanciaMediaSol() {
        return distanciaMediaSol;
    }

    public void setDistanciaMediaSol(int distanciaMediaSol) {
        this.distanciaMediaSol = distanciaMediaSol;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    public ComoEsPlaneta gettPlaneta() {
        return tPlaneta;
    }

    public void settPlaneta(ComoEsPlaneta tPlaneta) {
        this.tPlaneta = tPlaneta;
    }

    // ToString.
    @Override
    public String toString() {
        return "Planeta [nombre=" + nombre + ", cantidadSatelites=" + cantidadSatelites + ", masa=" + masa
                + ", volumen=" + volumen + ", diametroKm=" + diametroKm + ", distanciaMediaSol=" + distanciaMediaSol
                + ", observable=" + observable + ", tPlaneta=" + tPlaneta + ", periodoOrbitalPlaneta="
                + periodoOrbitalPlaneta + ", periodoRotacion=" + periodoRotacion + "]";
    }

    // Metodos propios de clase.
    public double densidad() { // Calcula la densidad
        return masa / volumen; // Kg / Km3
    }

    public boolean esExterior() {
        if (distanciaMediaSol * 1E6 <= 3.4 * UA)
            return true;
        else
            return false;
    }

    // Enumeracion propia
    public enum PlanSiSol {
        MERCURIO, VENUS, TIERRA, MARTE, JUPITES, SATURNO, URANO, NEPTUNO
    }
}