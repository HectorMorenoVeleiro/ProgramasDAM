package tercer_trimestre.cursos;

import java.io.Serializable;

public class Asignatura implements Serializable {

    int codigo;
    String nombre;
    int creditos;

    /** */
    Asignatura(int codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

}
