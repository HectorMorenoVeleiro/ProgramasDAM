package tercer_trimestre.bucle;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private String pais;
    ArrayList<Ciclista> listaCiclistas;

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

}
