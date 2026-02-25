package discoteca;

// clase para testear tu programa -->
public class TestDisco {

    // main para ejecutar -->
    public static void main(String[] args) {

        GestorDiscos.crearColeccion(); // creas una colección de discos primero

        GestorDiscos.mockDiscos(); // carga discos

        Menu.menu(); // muestras el menú después

    } // main
} // class
