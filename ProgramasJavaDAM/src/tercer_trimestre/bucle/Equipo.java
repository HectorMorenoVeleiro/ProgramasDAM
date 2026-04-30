package tercer_trimestre.bucle;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {

    private String nombre;
    private String pais;
    ArrayList<Ciclista> listaCiclistas = new ArrayList<>();
    private int tiempoAcumulado;
    private int tiempo;

    // ctr clase
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    // getters + setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    public void listarEquipo() {
        for (Ciclista ciclista : listaCiclistas) {
            System.out.println(ciclista.getNombre());
            System.out.println(ciclista.getDorsal());
        }
    }

    public void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.nextLine();
        boolean esta = false;
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);
            if (c.getNombre().equals(nombreCiclista)) {
                System.out.println(c.getNombre() + "-" + c.getDorsal());
                esta = true;
            }
        }
        if (!esta)
            System.out.println("no esta en el Equipo...");
        sc.close();
    }

    public void calcularTiempo() {
        this.tiempo = 0;
        for (Ciclista ciclista : listaCiclistas) {
            this.tiempo += ciclista.getTiempo();
        }
        this.tiempoAcumulado += this.tiempo;
    }

    public void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("Pais = " + pais);
        System.out.println("Total tiempo del equipo ETAPA = " + tiempo);
        System.out.println("Total tiempo del equipo VUELTA = " + tiempoAcumulado);
    }
}
