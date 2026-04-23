package tercer_trimestre.bucle;

import java.util.ArrayList;
import java.util.List;

public class Test5Ciclistas {

    public static void main(String[] args) {
        // 1. Inicialización de componentes
        LogicaCarrera logica = new LogicaCarrera();
        List<Ciclista> peloton = new ArrayList<>();

        // 2. Creación de datos de prueba
        peloton.add(new Ciclista(101, "Mikel Landa"));
        peloton.add(new Ciclista(42, "Primoz Roglic"));
        peloton.add(new Ciclista(7, "Remco Evenepoel"));
        peloton.add(new Ciclista(1, "Jonas Vingegaard"));
        peloton.add(new Ciclista(23, "Carlos Rodríguez"));

        System.out.println("=== COMIENZA LA COMPETICIÓN ===");

        // 3. Simulación de 3 Etapas
        for (int etapa = 1; etapa <= 3; etapa++) {
            ejecutarEtapa(peloton, logica, etapa);
        }

        System.out.println("\n=== FIN DE LA CARRERA: PODIO FINAL ===");
        imprimirTabla(peloton);
    }

    private static void ejecutarEtapa(List<Ciclista> peloton, LogicaCarrera logica, int numEtapa) {
        System.out.println("\n--- ETAPA " + numEtapa + " EN CURSO ---");

        // Cada ciclista corre la etapa (tiempos entre 2h y 2h15min aprox en segundos)
        for (Ciclista c : peloton) {
            c.correrEtapa(7200, 8100);
        }

        // Aplicamos la lógica de clasificación
        logica.actualizarClasificacionGeneral(peloton);

        // Mostramos cómo va la cosa
        System.out.println("\nCLASIFICACIÓN GENERAL TRAS ETAPA " + numEtapa + ":");
        imprimirTabla(peloton);
    }

    private static void imprimirTabla(List<Ciclista> lista) {
        String formato = "| %-4s | %-18s | %-10s | %-12s |%n";
        System.out.format("+------+--------------------+------------+--------------+%n");
        System.out.format("| POS  | NOMBRE             | T. ETAPA   | T. ACUMULADO |%n");
        System.out.format("+------+--------------------+------------+--------------+%n");

        for (Ciclista c : lista) {
            // Nota: Usamos el atributo directamente o corregimos el getter de posicionGen
            System.out.format(formato,
                    c.posicionGen + "º",
                    c.getNombre(),
                    c.getTiempo() + "s",
                    c.getTiempoAcumulado() + "s");
        }
        System.out.format("+------+--------------------+------------+--------------+%n");
    }
}