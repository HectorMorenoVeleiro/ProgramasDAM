package tercer_trimestre.cursos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestionAsignaturas {

    // Lista que almacenará los objetos de tipo Asignatura
    private ArrayList<Asignatura> listaAsignaturas;

    // Constructor
    public GestionAsignaturas() {
        this.listaAsignaturas = new ArrayList<>();
    }

    // Método para añadir asignaturas a la lista local antes de guardar
    public void agregarAsignatura(Asignatura asignatura) {
        this.listaAsignaturas.add(asignatura);
    }

    /**
     * Guarda la lista completa de asignaturas en el archivo "coleccion.dat"
     */
    public void escribirColeccion() {
        try {
            FileOutputStream archivo = new FileOutputStream("coleccion.dat");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);

            // Serializamos el ArrayList completo de una sola vez
            salida.writeObject(this.listaAsignaturas);

            salida.close();
            System.out.println("Colección guardada con éxito en coleccion.dat");
        } catch (IOException e) {
            System.out.println("No se puede escribir en el archivo coleccion.dat: " + e.getMessage());
        }
    }

    /**
     * Lee la lista completa de asignaturas desde "coleccion.dat" y la muestra
     */
    public void leerColeccion() {
        try {
            FileInputStream archivo = new FileInputStream("coleccion.dat");
            ObjectInputStream entrada = new ObjectInputStream(archivo);

            // Leemos el objeto y lo casteamos de vuelta a un ArrayList de Asignaturas
            this.listaAsignaturas = (ArrayList<Asignatura>) entrada.readObject();

            entrada.close();

            // Imprimimos cada asignatura recuperada
            System.out.println("\n--- ASIGNATURAS CARGADAS DESDE ARCHIVO ---");
            for (Asignatura asig : this.listaAsignaturas) {
                asig.imprimir();
                System.out.println("--------------------");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo coleccion.dat");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida al leer la colección");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase Asignatura no encontrada al deserializar");
        }
    }
}