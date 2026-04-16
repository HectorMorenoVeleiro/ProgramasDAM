package tercer_trimestre.inmuebles;

public class Test1 {

    /* inmueble test */

    public static void main(String[] args) {

        System.out.println("\nPOBLAMOS EL MAPA DE PRECIOS UNITARIOS");

        System.out.println("---------------------------------");

        // create inmueble and print
        Inmueble inm = new Inmueble(01, 100, "me comes los cojones 33");
        inm.imprimir(); // print method

        System.out.println("---------------------------------");

        // create outsider house and print
        CasaRural CR = new CasaRural(02, 150, "mi abuela se llama Jose 15",
                7, 3, 2, 1, 2);
        CR.imprimir(); // print method

        System.out.println("---------------------------------\n");
        System.out.println("CALCULAMOS EL PRECIO DE VENTA");
        System.out.println("---------------------------------");
        CR.calcularPrecioVenta();
        System.out.println("---------------------------------");

    }

}
