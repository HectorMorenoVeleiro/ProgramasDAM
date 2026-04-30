package tercer_trimestre.bucle;

public class TestEquipo {

    public static void main(String[] args) {

        // ── Crear equipos ──────────────────────────────────────────────
        Equipo equipoA = new Equipo("Team Ineos", "Reino Unido");
        Equipo equipoB = new Equipo("Jumbo-Visma", "Países Bajos");
        Equipo equipoC = new Equipo("UAE Team Emirates", "Emiratos Árabes");

        // ── Crear ciclistas ────────────────────────────────────────────
        // Equipo A
        Ciclista c1 = new Ciclista(1, "Chris Froome");
        Ciclista c2 = new Ciclista(2, "Geraint Thomas");
        Ciclista c3 = new Ciclista(3, "Egan Bernal");

        // Equipo B
        Ciclista c4 = new Ciclista(4, "Jonas Vingegaard");
        Ciclista c5 = new Ciclista(5, "Primoz Roglic");
        Ciclista c6 = new Ciclista(6, "Wout van Aert");

        // Equipo C
        Ciclista c7 = new Ciclista(7, "Tadej Pogacar");
        Ciclista c8 = new Ciclista(8, "Adam Yates");
        Ciclista c9 = new Ciclista(9, "Juan Ayuso");

        // ── Añadir ciclistas a sus equipos ────────────────────────────
        equipoA.añadirCiclista(c1);
        equipoA.añadirCiclista(c2);
        equipoA.añadirCiclista(c3);

        equipoB.añadirCiclista(c4);
        equipoB.añadirCiclista(c5);
        equipoB.añadirCiclista(c6);

        equipoC.añadirCiclista(c7);
        equipoC.añadirCiclista(c8);
        equipoC.añadirCiclista(c9);

        // ── Simulación de 3 etapas ─────────────────────────────────────
        int tiempoMin = 3600; // 1 hora en segundos
        int tiempoMax = 7200; // 2 horas en segundos

        Equipo[] equipos = { equipoA, equipoB, equipoC };

        for (int etapa = 1; etapa <= 3; etapa++) {
            System.out.println("\n╔══════════════════════════════╗");
            System.out.println("║         ETAPA " + etapa + "              ║");
            System.out.println("╚══════════════════════════════╝");

            for (Equipo equipo : equipos) {
                System.out.println("\n── " + equipo.getNombre() + " ──");

                // Cada ciclista corre la etapa
                for (Ciclista ciclista : equipo.listaCiclistas) {
                    ciclista.correrEtapa(tiempoMin, tiempoMax);
                }

                // Calcular y acumular tiempo del equipo
                equipo.calcularTiempo();
            }
        }

        // ── Resultados finales ─────────────────────────────────────────
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║      RESULTADOS FINALES      ║");
        System.out.println("╚══════════════════════════════╝");

        for (Equipo equipo : equipos) {
            System.out.println("\n--> EQUIPO: " + equipo.getNombre());
            System.out.println("  Ciclistas:");
            for (Ciclista ciclista : equipo.listaCiclistas) {
                ciclista.imprimir();
                System.out.println("  ----------");
            }
            equipo.imprimir();
        }

        // ── Clasificación final por tiempo acumulado del equipo ────────
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║     CLASIFICACIÓN EQUIPOS    ║");
        System.out.println("╚══════════════════════════════╝");

        // Ordenar equipos por tiempoAcumulado (burbuja simple)
        for (int i = 0; i < equipos.length - 1; i++) {
            for (int j = 0; j < equipos.length - 1 - i; j++) {
                if (equipos[j].getTiempoAcumulado() > equipos[j + 1].getTiempoAcumulado()) {
                    Equipo temp = equipos[j];
                    equipos[j] = equipos[j + 1];
                    equipos[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < equipos.length; i++) {
            System.out.println((i + 1) + "º - " + equipos[i].getNombre()
                    + " | Tiempo total: " + equipos[i].getTiempoAcumulado() + " seg");
        }
    }
}