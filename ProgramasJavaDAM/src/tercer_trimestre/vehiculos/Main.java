package tercer_trimestre.vehiculos;

public class Main {
    public static void main(String[] args) {

        /*
         * |------------------------------IMPORTANTE----------------------------------|
         * |Profe confieso delito porque esto no hay forma de maquillarlo el Main está|
         * |todo chatGepeteado pero juro que el resto no lo está.·····················|
         * |--------------------------------------------------------------------------|
         */

        // ════════════════ CAMIONETA 🚛 ════════════════
        separador("CAMIONETA", "🚛");

        Terrestre camioneta = new Terrestre(0, 120, 4, Terrestre.tipoVehiculo.CIVIL);
        subseccion("Estado inicial");
        System.out.println(camioneta.imprimir());

        subseccion("Acelerando 80 km/h");
        camioneta.acelerar(80);

        subseccion("Frenando 30 km/h");
        camioneta.frenar(30);

        subseccion("Cálculo de revoluciones");
        System.out.println("  Fuerza=500  Radio=0.35  =>  " + camioneta.calcularRevolucionesMotor(500, 0.35) + " rpm");

        // ════════════════ MOTO ACUÁTICA 🚤 ════════════════
        separador("MOTO ACUÁTICA", "🚤");

        Acuatico motoAcuatica = new Acuatico(0, 90, 2, Acuatico.terreno.SUPERFICIE);
        subseccion("Estado inicial");
        System.out.println(motoAcuatica.imprimir());

        subseccion("Acelerando 60 km/h");
        motoAcuatica.acelerar(60);
        System.out.println(motoAcuatica.imprimir());

        subseccion("Recomendación de navegación — viento 50 km/h");
        motoAcuatica.recomendarVelocidad(50);

        subseccion("Recomendación de navegación — viento 100 km/h");
        motoAcuatica.recomendarVelocidad(100);

        subseccion("Frenando 20 km/h");
        motoAcuatica.frenar(20);
        System.out.println(motoAcuatica.imprimir());

        // ════════════════ AVIÓN ✈️ ════════════════
        separador("AVIÓN", "✈️");

        VehiculoAereo avion = new VehiculoAereo(0, 900);
        subseccion("Estado inicial");
        System.out.println(avion.imprimir());

        subseccion("Encendiendo motores");
        avion.encender();

        subseccion("Despegue");
        avion.acelerar(300);
        avion.despegar();
        avion.subirTrenAterrizaje();
        avion.volar();
        System.out.println(avion.imprimir());

        subseccion("Intentando superar velocidad máxima");
        avion.acelerar(1500);

        subseccion("Frenando 100 km/h");
        avion.frenar(100);
        System.out.println(avion.imprimir());

        subseccion("Aterrizaje");
        avion.soltarTrenAterrizaje();
        avion.aterrizar();
        avion.apagar();
    }

    static void separador(String titulo, String emoji) {
        String linea = "=".repeat(45);
        System.out.println("\n" + linea);
        System.out.println("  " + emoji + "  " + titulo);
        System.out.println(linea + "\n");
    }

    static void subseccion(String titulo) {
        System.out.println("  --- " + titulo + " ---");
    }
}