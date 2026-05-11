package tercer_trimestre.peaje;

public class TestPeaje {

    public static void main(String[] args) {

        // ─────────────────────────────────────────────────────────────────────
        // PRUEBA DE CARRO
        // ─────────────────────────────────────────────────────────────────────
        System.out.println("========== PRUEBA CARRO ==========");

        Carro carro1 = new Carro("ABC123");
        Carro carro2 = new Carro("XYZ789");

        System.out.println("-- Datos carro1 --");
        carro1.imprimir();

        System.out.println("-- Datos carro2 --");
        carro2.imprimir();

        // Cambiar valor de peaje estático y verificar que afecta a todos los carros
        System.out.println("\n-- Cambiando valor de peaje de Carro a 12000 --");
        Carro.setValorPeaje(12000);
        System.out.println("carro1 después del cambio:");
        carro1.imprimir();
        System.out.println("carro2 después del cambio:");
        carro2.imprimir();

        // ─────────────────────────────────────────────────────────────────────
        // PRUEBA DE MOTO
        // ─────────────────────────────────────────────────────────────────────
        System.out.println("\n========== PRUEBA MOTO ==========");

        Moto moto1 = new Moto("MOT001");
        Moto moto2 = new Moto("MOT002");

        System.out.println("-- Datos moto1 --");
        moto1.imprimir();

        System.out.println("-- Datos moto2 --");
        moto2.imprimir();

        // Cambiar valor de peaje estático y verificar que afecta a todas las motos
        System.out.println("\n-- Cambiando valor de peaje de Moto a 6000 --");
        Moto.setValorPeaje(6000);
        System.out.println("moto1 después del cambio:");
        moto1.imprimir();
        System.out.println("moto2 después del cambio:");
        moto2.imprimir();

        // ─────────────────────────────────────────────────────────────────────
        // PRUEBA DE CAMION
        // ─────────────────────────────────────────────────────────────────────
        System.out.println("\n========== PRUEBA CAMION ==========");

        Camion camion1 = new Camion("CAM001", 2);
        Camion camion2 = new Camion("CAM002", 5);

        System.out.println("-- Datos camion1 --");
        camion1.imprimir();

        System.out.println("-- Datos camion2 --");
        camion2.imprimir();

        // Cambiar valor de peaje por eje y verificar que afecta a todos los camiones
        System.out.println("\n-- Cambiando valor de peaje por eje de Camion a 7000 --");
        Camion.setValorPeajeEje(7000);
        System.out.println("camion1 después del cambio:");
        camion1.imprimir();
        System.out.println("camion2 después del cambio:");
        camion2.imprimir();

        // ─────────────────────────────────────────────────────────────────────
        // PRUEBA DE POLIMORFISMO
        // ─────────────────────────────────────────────────────────────────────
        System.out.println("\n========== PRUEBA POLIMORFISMO ==========");

        Vehiculo[] flota = {
                new Carro("POL001"),
                new Moto("POL002"),
                new Camion("POL003", 3)
        };

        for (Vehiculo v : flota) {
            System.out.println("-- " + v.getClass().getSimpleName() + " --");
            v.imprimir();
        }

        // ─────────────────────────────────────────────────────────────────────
        // PRUEBA DE PEAJE
        // ─────────────────────────────────────────────────────────────────────
        System.out.println("\n========== PRUEBA PEAJE ==========");

        // Restaurar valores de peaje a sus defaults antes de la prueba
        Carro.setValorPeaje(10000);
        Moto.setValorPeaje(5000);
        Camion.setValorPeajeEje(5000);

        // Crear estación de peaje
        Peaje peaje = new Peaje("Peaje La Paila", "Valle del Cauca");
        System.out.println("Estación creada: " + peaje.getNombre() + " - " + peaje.getDepartamento());

        // Crear vehículos y añadirlos al peaje
        Carro c1 = new Carro("CAR100");
        Carro c2 = new Carro("CAR200");
        Moto m1 = new Moto("MOT100");
        Camion k1 = new Camion("CAM100", 3); // 3 ejes → 3 * 5000 = 15 000
        Camion k2 = new Camion("CAM200", 2); // 2 ejes → 2 * 5000 = 10 000

        peaje.anadirVehiculo(c1);
        peaje.anadirVehiculo(c2);
        peaje.anadirVehiculo(m1);
        peaje.anadirVehiculo(k1);
        peaje.anadirVehiculo(k2);

        // Calcular peaje para cada vehículo
        System.out.println("\n-- Calculando peajes --");
        for (Vehiculo v : peaje.vehiculos) {
            int pagado = peaje.calcularPeaje(v);
            System.out.println(v.getClass().getSimpleName()
                    + " [" + v.placa + "] pagó: $" + pagado);
        }

        // Imprimir resumen final del peaje
        System.out.println("\n-- Resumen de la estación --");
        peaje.imprimir();

        // Prueba: cambiar nombre y departamento
        System.out.println("\n-- Cambiando nombre y departamento del peaje --");
        peaje.setNombre("Peaje El Vino");
        peaje.setDepartamento("Cundinamarca");
        System.out.println("Nuevo nombre: " + peaje.getNombre());
        System.out.println("Nuevo departamento: " + peaje.getDepartamento());
    }
}