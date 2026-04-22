package tercer_trimestre.bio;

public class Lobo extends Canido {

    public Lobo(String sonido, String alimento, String habitat, String nombreCientifico) {
        super(sonido, alimento, habitat, nombreCientifico);
    }

    public String getSonido() {
        return "Aullido";
    }

    public String getAlimentos() {
        return "Carnivoro";
    }

    public String getHabitat() {
        return "Bosque";
    }

    public String getNombreCientifico() {
        return "Canis lupus";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method sub
        return "I am A F*** LOBO\n" + super.toString();
    }

}
