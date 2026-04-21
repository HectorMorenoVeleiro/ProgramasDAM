package tercer_trimestre.cole;

public class TestCole {

    public static void main(String[] args) {
        Estudiante uno = new Estudiante(null, null, null, 0);

        Profesor dos = new Profesor(null, null, null, null);

        System.out.println("DATOS ESTUDIANTE");
        System.out.println(uno.toString());
        System.out.println("-----------------------------");
        System.out.println("DATOS PROFESOR");
        System.out.println(dos.toString());

        if (uno instanceof Estudiante) {
            System.out.println("DATOS DEL ESTUDIANTE");
            System.out.println(uno.toString());
        }
        if (dos instanceof Profesor) {
            System.out.println("DATOS DEL ESTUDIANTE");
            System.out.println(dos.toString());
        }
    }
}
