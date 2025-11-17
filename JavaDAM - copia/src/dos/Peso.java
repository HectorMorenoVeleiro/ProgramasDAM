package dos;

public class Peso {

    /*
     * Crea la clase peso, la cual tendrá las siguientes características:
     * Deberá tener un atributo donde se almacene el peso de un objeto en
     * kilogramos.
     * En el constructor se le pasará el peso y
     * la medida en la que se ha tomado (‘Lb’ para libras, ‘Li’ para lingotes, ‘Oz
     * para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para
     * quintales).
     * 
     * Deberá de tener los siguientes métodos:
     * 
     * getLibras. Devuelve el peso en libras.
     * 
     * getLingotes. Devuelve el peso en lingotes.
     * 
     * getPeso. Devuelve el peso en la medida que se pase como parámetro
     * (‘Lb’ para libras, ‘Li’ para lingotes, ‘Oz para onzas, ‘P’ para peniques,
     * ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para quintales).
     * 
     * Para la realización del ejercicio toma como referencia los siguientes datos:
     * 1 Libra = 16 onzas = 453 gramos.
     * 1 Lingote = 32,17 libras = 14,59 kg.
     * 1 Onza = 0,0625 libras = 28,35 gramos.
     * 1 Penique = 0,05 onzas = 1,55 gramos.
     * 1 Quintal =100 libras = 43,3 kg.
     * Crea además un método main para testear y verificar los métodos de esta
     * clase.
     */

    private double pesoKg; // peso almacenado en kilogramos siempre

    // Constructor que recibe peso y unidad de medida
    public Peso(double peso, String unidad) {
        switch (unidad) {
            case "Lb": // libras a kg
                pesoKg = peso * 0.453;
                break;
            case "Li": // lingotes a kg
                pesoKg = peso * 14.59;
                break;
            case "Oz": // onzas a kg
                pesoKg = peso * 0.02835;
                break;
            case "P": // peniques a kg
                pesoKg = peso * 0.00155;
                break;
            case "K": // kilos directo
                pesoKg = peso;
                break;
            case "G": // gramos a kg
                pesoKg = peso / 1000.0;
                break;
            case "Q": // quintales a kg
                pesoKg = peso * 43.3;
                break;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }
    }

    // Devuelve el peso en libras
    public double getLibras() {
        return pesoKg / 0.453;
    }

    // Devuelve el peso en lingotes
    public double getLingotes() {
        return pesoKg / 14.59;
    }

    // Devuelve el peso en la unidad pedida
    public double getPeso(String unidad) {
        switch (unidad) {
            case "Lb":
                return getLibras();
            case "Li":
                return getLingotes();
            case "Oz":
                return pesoKg / 0.02835;
            case "P":
                return pesoKg / 0.00155;
            case "K":
                return pesoKg;
            case "G":
                return pesoKg * 1000;
            case "Q":
                return pesoKg / 43.3;
            default:
                throw new IllegalArgumentException("Unidad no válida");
        }
    }

    public static void main(String[] args) {
        // Creo un objeto peso con 10 libras
        Peso peso1 = new Peso(10, "Lb");
        System.out.println("Peso en Kg: " + peso1.getPeso("K"));
        System.out.println("Peso en Lingotes: " + peso1.getLingotes());
        System.out.println("Peso en Onzas: " + peso1.getPeso("Oz"));
        System.out.println("Peso en Peniques: " + peso1.getPeso("P"));
        System.out.println("Peso en Quintales: " + peso1.getPeso("Q"));

        // Creo un objeto peso con 5 kilogramos
        Peso peso2 = new Peso(5, "K");
        System.out.println("\nPeso2 en libras: " + peso2.getLibras());
        System.out.println("Peso2 en gramos: " + peso2.getPeso("G"));
    }
}