package tercer_trimestre.tienda_mascotas;

import java.util.ArrayList;

public class tienda_mascotasTest1 {

    public static void main(String[] args) {

        ArrayList<Perro> canes = new ArrayList<>();
        ArrayList<Gato> cates = new ArrayList<>();

        PerroGrande dog1 = new PerroGrande("manolo", "jaspeado", 4, 23d, true, PerroGrande.razaG.rotweiller);
        PerroMediano dog2 = new PerroMediano("pepe", "indefinido", 3, 12d, false, PerroMediano.razaM.collie);
        PerroPequeno dog3 = new PerroPequeno("carlos", "manchas", 6, 6d, true, PerroPequeno.razaP.chihuahua);

        GatoSinPelo cat1 = new GatoSinPelo("miauz", "verde que te quiero verde", 563156, 2, 15,
                GatoSinPelo.razaSP.donskoy);
        GatoPeloLargo cat2 = new GatoPeloLargo("donalduck", "amarillo que te pillo", 1, 1, 15,
                GatoPeloLargo.razaPL.angora);
        GatoPeloCorto cat3 = new GatoPeloCorto("ayuda", "rojo piojo", 0, 2, 300, GatoPeloCorto.razaPC.britanico);

        canes.add(dog1);
        canes.add(dog2);
        canes.add(dog3);

        cates.add(cat1);
        cates.add(cat2);
        cates.add(cat3);

        for (Perro perro : canes) {
            perro.sonido();
            System.out.println(perro.toString());
        }

        for (Gato gato : cates) {
            gato.sonido();
            System.out.println(gato.toString());
        }
    }
}
