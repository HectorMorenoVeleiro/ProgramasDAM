package discoteca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GestorArchivoDiscos {

    public static void cargarColeccionDesdeAlmacenamiento() {
        File fichero = new File("coleccion.obj");

        // verificamos si el archivo existe antes de intentar leerlo -->
        if (!fichero.exists()) {
            System.out.println("No hay archivo de guardado previo. Creando colección nueva...");
            GestorDiscos.crearColeccion();
            GestorDiscos.mockDiscos();
            return;
        } // if

        // try-catch -->
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            // leemos el objeto y hacemos el casting a Disco[] -->
            GestorDiscos.discos = (Disco[]) ois.readObject();
            System.out.println("Coleccion cargada con exito.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar la coleccion: " + e.getMessage());
            // si resulta que algo falla,al menos inicializamos para que no sea null -->
            GestorDiscos.crearColeccion();
        } // try-catch
    } // cargarColeccionDesdeAlmacenamiento

    public static void guardarColeccionDesdeAlmacenamiento() {
        // Usamos try.with.resources para que el archivo se cierre solo -->
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("coleccion.obj"))) {
            // Guardamos el array completo de un solo golpe -->
            oos.writeObject(GestorDiscos.discos);
            System.out.println("Coleccion guardada correctamente en coleccion.obj");
        } catch (IOException e) { // catcheamos el posible error -->
            System.out.println("ERROR de guardado de colección: " + e.getMessage());
        } // trycatch
    } // guardarColeccionDesdeAlmacenamiento

}
