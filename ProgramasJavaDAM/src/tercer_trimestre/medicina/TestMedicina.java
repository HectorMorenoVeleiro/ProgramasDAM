package tercer_trimestre.medicina;

import java.util.ArrayList;
import tercer_trimestre.medicina.Pediatra.tipologiaPed;
import tercer_trimestre.medicina.Ortopedista.tipologiaOrt;;

public class TestMedicina {

    public static void main(String[] args) {

        // ---- 0. Creamos ArrayList -----------------------------------
        ArrayList<Medico> listaMedicos = new ArrayList<>();

        // =============================================================
        // creamos instancia(objeto) de cada clase de la jerarquia
        // =============================================================

        // ---- 1. Insertamos Medico -----------------------------------
        Medico med1 = new Medico("Juan Gonzalez");
        listaMedicos.add(med1);

        // ---- 2. Insertamos Ortopedista ------------------------------
        Ortopedista ortop1 = new Ortopedista("Carlos Pineda", tipologiaOrt.MAXILOFACIAL);
        listaMedicos.add(ortop1);

        // ---- 3. Insertamos Pediatra ---------------------------------
        Pediatra ped1 = new Pediatra("Ana Matilde", tipologiaPed.PSICOLOGO);
        listaMedicos.add(ped1);

        // ---- 4. Listamos los médicos añadidos -----------------------
        System.out.println("\n LISTAMOS MEDICOS");
        System.out.println("=================\n");

        int contador = 1; // contador para decir que medico es cada uno

        for (Medico medico : listaMedicos) { // for-each para mostrar el array
            System.out.println("-----------MEDICO " + contador++ + "------------");
            System.out.println(medico.toString());
            System.out.println("-------------------------------\n");
        }

        System.out.println("\n LISTAMOS CON INSTANCEOF");
        System.out.println("========================= \n");

        // ---- 5. ejemplo instanceOf ----------------------------------
        for (int i = 0; i < listaMedicos.size(); i++) {

            System.out.println("-----------MEDICO " + (i + 1) + "------------");
            System.out.println("- Mostramos ToString -");

            // proceso de casting con clase padre:
            Medico med = (Medico) listaMedicos.get(i);

            System.out.println(med.toString()); // mostramos nombre
            System.out.println("- Mostramos clase -");

            // metemos condiciones:
            if (med instanceof Ortopedista) {
                System.out.println("El médico " + (i + 1) + " es un ortopedista.");
                System.out.println("-------------------------------\n");
                continue;
            }
            if (med instanceof Pediatra) {
                System.out.println("El médico " + (i + 1) + " es un pediatra.");
                System.out.println("-------------------------------\n");
                continue;
            }
            if (med instanceof Medico)
                System.out.println("El médico " + (i + 1) + " es un medico.");

            System.out.println("-------------------------------\n");
        }
        // -------------------------------------------------------------
    }
}
