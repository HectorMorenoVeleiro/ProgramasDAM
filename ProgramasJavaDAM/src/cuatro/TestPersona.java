package cuatro;

public class TestPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", "Pérez", "1053121010", 1998, "Canadá", 'M');
        Persona p2 = new Persona("Luis", "León", "1053223344", 2001, "España", 'M');

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
