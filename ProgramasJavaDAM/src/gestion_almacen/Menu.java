package gestion_almacen;

import java.io.IOException;

public class Menu { // clase para gestionar el Menu -->

    // atributos
    String titulo = null;
    String opciones[] = null;
    int numOpciones = 0;

    public Menu(String titulo, String[] opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
        this.numOpciones = this.opciones.length;
    }

    public int gestionar() throws NoEsEnteroException, NumberFormatException, IOException {
        mostrar();
        return recogerOpcion();
    }

    private void mostrar() {
        int i = 1;
        System.out.println("***" + titulo + "***");
        for (String elemento : opciones) {
            System.out.println("(" + (i++) + ") " + elemento);
        }
    }

    private int recogerOpcion() {
        int opcion = -1;
        do {
            System.out.println("Introduce una opción válida [1, " + numOpciones + "]");
            try {
                opcion = Teclado.leerEntero();
            } catch (NoEsEnteroException e) {

            }
        } while (opcion < 1 || opcion > numOpciones);
        return opcion;
    }
}