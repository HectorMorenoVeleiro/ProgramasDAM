package discoteca;

public class TestDisco {

    public static void main(String[] args) {

        GestorDiscos.crearColeccion(); // creas una colección de discos primero

        GestorDiscos.mockDiscos(); // carga discos

        Menu.menu(); // muestras el menú después

    }
}
