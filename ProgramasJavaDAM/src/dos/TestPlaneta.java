package dos;

import dos.Planeta.ComoEsPlaneta;

public class TestPlaneta {

    public static void main(String[] args) {

        Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12,
                12742, 150, ComoEsPlaneta.TERRESTRE, true, 1, 2);
        Planeta jupiter = new Planeta("Jupiter", 79, 1.898327, 1.43128e15,
                139822, 778, ComoEsPlaneta.GASEOSO, true, 1, 2);

        System.out.println(tierra);
        System.out.println("Densidad de Tierra: " + tierra.densidad() + " kg / km3");
        System.out.println("¿Tierra es planeta exterior?: " + tierra.esExterior());

        System.out.println(jupiter);
        System.out.println("Densidad de Tierra: " + jupiter.densidad() + " kg / km3");
        System.out.println("¿Tierra es planeta exterior?: " + jupiter.esExterior());
    }
}
