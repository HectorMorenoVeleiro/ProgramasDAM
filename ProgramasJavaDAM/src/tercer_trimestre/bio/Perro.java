package tercer_trimestre.bio;

public class Perro extends Canido {

    public Perro(String sonido, String alimento, String habitat, String nombreCientifico) {
        super(sonido, alimento, habitat, nombreCientifico);
    }

    public String getSonido() {
        return "ladrido";
    }

    public String getAlimentos() {
        return "alimentos";
    }

    public String getHabitat() {
        return "habitat";
    }

    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }

}
