package tercer_trimestre.entorno_grafico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ListaPersonas {
    ArrayList<Persona> listaPersonas; // Atributo que identifica un vector de personas

    /**
     * Constructor de la clase ListaPersonas
     */
    public ListaPersonas() {
        listaPersonas = new ArrayList<Persona>(); // Crea el vector de personas
    }

    /**
     * Método que permite agregar una persona al vector de personas
     * 
     * @param p Parámetro que define la persona a agregar al vector de
     *          personas
     */

    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    }

    /**
     * Método que permite eliminar una persona del vector de personas
     * 
     * @param i Parámetro que define la posición a eliminar en el vector
     *          de personas
     */
    public void eliminarPersona(int i) {
        listaPersonas.remove(i); // elimino por indice
    }

    /**
     * Método que permite eliminar todos los elementos del vector de
     * personas
     */
    public void borrarLista() {
        listaPersonas.clear();
    }

    public void guardarEnFichero() {
        try {
            FileOutputStream archivo = new FileOutputStream("personal.dat");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);

            salida.writeObject(this.listaPersonas);

            salida.close();
            archivo.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void cargarDesdeFichero8() {
        try {
            File fichero = new File("personal.dat");
            if (!fichero.exists()) {
                System.out.println("El archivo personal.dat no existe todavía.");
                return;
            }

            FileInputStream archivo = new FileInputStream(fichero);
            ObjectInputStream entrada = new ObjectInputStream(archivo);

            this.listaPersonas = (ArrayList<Persona>) entrada.readObject();
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archiovo de la coleccion");
        } catch (IOException e) {
            System.out.println("Error de entrada o salida al cargar la coleccion");
        } catch (Exception e) {
            System.out.println("Error al cargar la coleccion del archivo");
        }
    }
}