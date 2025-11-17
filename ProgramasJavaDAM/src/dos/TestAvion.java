package dos;

public class TestAvion {

    public static void main(String[] args) {

        Avion avion1 = new Avion("Airbus", 4);
        Avion avion2 = null;
        Avion avion3 = new Avion("Lockheed", 2);

        // asignacion
        avion2 = avion1;

        System.out.println("despues de asignar: ");
        System.out.println(avion1);
        System.out.println(avion2);

        avion1.setNombreFabricante("Douglas");
        System.out.println("cambio el fabricante de ai con un setFabricante");
        System.out.println("quien sera el fabricante de a2?");
        System.out.println(avion1);
        System.out.println(avion2);

        System.out.println("llama a pumuki coge el fabricante del Avion pasado por parametro y setea con dicho valor ");
        // llamada al metodo pumiki
        avion1.cambiarFabricante(avion3);
        avion1.cambiarFabricante(avion2);
        avion2.cambiarFabricante(avion2);
    }
}
