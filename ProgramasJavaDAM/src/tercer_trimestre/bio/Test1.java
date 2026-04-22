package tercer_trimestre.bio;

public class Test1 {

    public static void main(String[] args) {

        /* clase_abstracta -- no_instanciable; clases_hijas -- si_instanciable */

        Canido mafalda = new Perro("guff", "salchichas", "pisero", "mafaldus galaicus");
        Animal feroz = new Lobo(null, null, null, null);
        Felino scar = new Leon(null, null, null, null);

        System.out.println(mafalda.toString());
        System.out.println(feroz.toString());
        System.out.println(scar.toString());

        // UPCASTING (en el segundo da TRUE porque termina siendo un animal)
        System.out.println(mafalda instanceof Perro); // TRUE
        System.out.println(feroz instanceof Lobo); // FALSE (es lobo | es canido)
        System.out.println(scar instanceof Leon);

        /*
         * la previa no era relevante (feroz instanceof Animal) porque efectivamente es
         * un animal, mientras que la segunda no
         */

    }
}
