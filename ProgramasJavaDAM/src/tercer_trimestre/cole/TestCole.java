package tercer_trimestre.cole;

public class TestCole {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(null, null, null, 0);

        Profesor profesor1 = new Profesor(null, null, null, null);

        System.out.println("DATOS ESTUDIANTE");
        System.out.println(estudiante1.toString());
        System.out.println("-----------------------------");
        System.out.println("DATOS PROFESOR");
        System.out.println(profesor1.toString());
    }
}
