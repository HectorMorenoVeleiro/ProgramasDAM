package discoteca_flexible;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class GestorArchivoDiscos {

    public static void cargarColeccionDesdeAlmacenamiento() {
        File fichero = new File("coleccion2.obj");

        // verificamos si el archivo existe antes de intentar leerlo -->
        if (!fichero.exists()) {
            System.out.println("No hay archivo de guardado previo. Creando coleccion...");
            GestorDiscos.mockDiscos();
            return;
        } // if

        // try-catch -->
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            // leemos el objeto y hacemos el casting -->
            GestorDiscos.discos = (List<Disco>) ois.readObject();
            System.out.println("Coleccion cargada con exito");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar la coleccion " + e.getMessage());
        } // try-catch
    } // cargarColeccionDesdeAlmacenamiento

    public static void guardarColeccionDesdeAlmacenamiento() {
        // Usamos try.witch.resources para que el archivo se cierre solo -->
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("coleccion2.obj"))) {
            // Guardamos el array completo de un solo golpe -->
            oos.writeObject(GestorDiscos.discos);
            System.out.println("coleccion guardada correctamente en coleccion.obj");
        } catch (IOException e) {
            System.out.println("ERROR de guardado de colección: " + e.getMessage());
        } // try-catch
    } // guardarColeccionDesdeAlmacenamiento
}
