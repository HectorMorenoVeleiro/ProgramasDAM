package dos;

public class TestArticuloCientifico {

    public static void main(String[] args) {

        String[] palabras = new String[]{"Fisica", "Espacio", "Tiempo"};

        for (int i = 0; i < palabras.length; i++)
            System.out.println("palabra en la posicion " + i + " es: " + palabras[i]);

        ArtifuloCientifico articulo = new ArtifuloCientifico("Javier", "Javier",
                palabras, "miAmor", 1943);

        System.out.println(articulo.toString());
    }
}
