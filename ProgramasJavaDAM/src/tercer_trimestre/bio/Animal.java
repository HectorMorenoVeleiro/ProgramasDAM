package tercer_trimestre.bio;

public abstract class Animal {

    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientifico;

    // sin constructor
    public Animal(String sonido, String alimentos, String habitat, String nombreCientifico) {
        this.sonido = sonido;
        this.alimentos = alimentos;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }

    // 4 metodos abstractos
    public abstract String getHabitat();

    public abstract String getSonido();

    public abstract String getAlimentos();

    public abstract String getNombreCientifico();

}
