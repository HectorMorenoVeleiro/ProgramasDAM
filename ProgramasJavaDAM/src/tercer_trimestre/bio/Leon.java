package tercer_trimestre.bio;

public class Leon extends Felino {

    public Leon(String sonido, String alimento, String habitat, String nombreCientifico) {
        super(sonido, alimento, habitat, nombreCientifico);
    }

    public String getSonido() {
        return "Rawr";
    }

    public String getAlimentos() {
        return "Carnivoro";
    }

    public String getHabitat() {
        return "Sabana";
    }

    public String getNombreCientifico() {
        return "Panthera leo";
    }
}