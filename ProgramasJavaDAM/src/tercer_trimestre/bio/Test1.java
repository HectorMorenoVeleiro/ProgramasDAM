package tercer_trimestre.bio;

public class Test1 {

    public static void main(String[] args) {

        /* clase_abstracta -- no_instanciable; clases_hijas -- si_instanciable */

        Canido mafalda = new Perro("guff", "salchichas", "pisero", "mafaldus galaicus");
        Animal feroz = new Lobo(null, null, null, null);
        Felino scar = new Leon(null, null, null, null);
        Animal conbotas = new Gato(null, null, null, null);

        System.out.println(mafalda.toString());
        System.out.println(feroz.toString());
        System.out.println(scar.toString());
        System.out.println(conbotas.toString());

        // UPCASTING (en el segundo da TRUE porque termina siendo un animal)
        System.out.println(mafalda instanceof Perro); // TRUE
        System.out.println(feroz instanceof Lobo); // FALSE (es lobo | es canido)
        System.out.println(scar instanceof Leon);
        System.out.println(conbotas instanceof Gato);

        /*
         * la previa no era relevante (feroz instanceof Animal) porque efectivamente es
         * un animal, mientras que la segunda no
         */

        Perro pe = (Perro) mafalda;
        Lobo lo = (Lobo) feroz;
        Canido ca = (Canido) feroz;
        Felino fe = (Felino) feroz;

        System.out.println(pe);
        System.out.println(lo);
        System.out.println(ca);
        System.out.println(fe);

    }
}
