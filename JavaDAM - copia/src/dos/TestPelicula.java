package dos;

public class TestPelicula {

    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula(null, null, null, 0, 0, 0);

        Pelicula pelicula2 = new Pelicula(null, null, null, 0, 0, 0);

        pelicula1.toString();
        System.out.println("\n");
        pelicula2.toString();
        System.out.println("\n");
        pelicula1.calcularValoracion();
        System.out.println("\n");
        pelicula2.calcularValoracion();
        System.out.println("\n");
        pelicula1.esPeliculaEpica();
        System.out.println("\n");
        pelicula2.esPeliculaEpica();
        System.out.println(pelicula1.esSimilar(pelicula2));

        pelicula1 = pelicula2;

        System.out.println(pelicula1);
        System.out.println(pelicula2);

        System.out.println("equals para peli1 y peli: 2" + pelicula1.equals(pelicula2));

        System.out.println(pelicula1.hashCode());
        System.out.println(pelicula2.hashCode());
    }
}
