package tercer_trimestre.bucle;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {

    private String nombre;
    private String pais;
    ArrayList<Ciclista> listaCiclistas;
    private int tiempoAcumulado;

    // ctr clase
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        listaCiclistas = new ArrayList<Ciclista>();
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

    void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    public void listarEquipo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);
        }
    }

    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);/* */
        String nombreCiclista = sc.nextLine();
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);
            if (c.getNombre().equals(nombreCiclista)) {
                System.out.println(c.getNombre() + "-" + c.getdorsal());
            } else {
                System.out.println("no esta en el Equipo...");
            }
        }
    }
}
