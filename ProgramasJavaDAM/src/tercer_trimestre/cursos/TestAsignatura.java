package tercer_trimestre.cursos;

public class TestAsignatura {

    public static void main(String[] args) {

        GestionAsignaturas gestion = new GestionAsignaturas();

        // 1. Creamos unas cuantas asignaturas de prueba
        Asignatura asig1 = new Asignatura(101, "Programación", 8);
        Asignatura asig2 = new Asignatura(102, "Bases de Datos", 6);
        Asignatura asig3 = new Asignatura(103, "Entornos de Desarrollo", 4);

        // 2. Las agregamos a la lista de nuestra clase auxiliar
        gestion.agregarAsignatura(asig1);
        gestion.agregarAsignatura(asig2);
        gestion.agregarAsignatura(asig3);

        // 3. Escribimos toda la colección en el archivo binario (.dat)
        gestion.escribirColeccion();

        // 4. Creamos otra instancia limpia de gestión para comprobar que lee
        // correctamente
        GestionAsignaturas lectorGestion = new GestionAsignaturas();
        lectorGestion.leerColeccion();
    }
}
