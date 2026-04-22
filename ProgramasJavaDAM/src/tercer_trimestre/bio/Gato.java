package tercer_trimestre.bio;

public class Gato extends Felino {

    public Gato(String sonido, String alimento, String habitat, String nombreCientifico) {
        super(sonido, alimento, habitat, nombreCientifico);
    }

    public String getSonido() {
        return "maullido";
    }

    public String getAlimentos() {
        return "Ratones";
    }

    public String getHabitat() {
        return "caseros";
    }

    public String getNombreCientifico() {
        return "Feliz silvestris catus";
    }

    @Override
    public String toString() {
        return "Gato [" + super.toString() + "]";
    }

}
