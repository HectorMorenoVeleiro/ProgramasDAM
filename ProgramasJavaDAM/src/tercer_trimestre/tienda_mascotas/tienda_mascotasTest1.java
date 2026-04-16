package tercer_trimestre.tienda_mascotas;

import java.util.ArrayList;

public class tienda_mascotasTest1 {

    public static void main(String[] args) {

        ArrayList<Perro> canes = new ArrayList<>();

        PerroGrande dog1 = new PerroGrande("manolo", "jaspeado", 4, 23d, true, PerroGrande.razaG.rotweiller);
        PerroMediano dog2 = new PerroMediano("pepe", "indefinido", 3, 12d, false, PerroMediano.razaM.collie);
        PerroPequeno dog3 = new PerroPequeno("carlos", "manchas", 6, 6d, true, PerroPequeno.razaP.chihuahua);

        dog1.sonido();
        System.out.println(dog1.toString());
        dog2.sonido();
        System.out.println(dog2.toString());
        dog3.sonido();
        System.out.println(dog3.toString());

    }
}
