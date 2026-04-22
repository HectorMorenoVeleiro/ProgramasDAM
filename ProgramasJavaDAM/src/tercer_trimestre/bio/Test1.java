package tercer_trimestre.bio;

public class Test1 {

    public static void main(String[] args) {
        // Animal sobera = new Animal("ewrg!", "kiwis", "navideno", "Cejus hispanicus");

        // Canido toralla = new canido("brupp", "bichotas", "marino", "Carolus
        // maritumus");

        Canido mafalda = new Perro("guff", "salchichas", "pisero", "mafaldus galaicus");
        Animal feroz = new Lobo(null, null, null, null);

        System.out.println(mafalda.toString());
        System.out.println(feroz.toString());

    }
}
