package dos;

public class Pedido {

    // LOS PARAMETROS NO TIENEN PORQUE SER ATRIBUTOS

    public void calcularPedido(String primerPlato, double costoPrimerPlato,
            String bebida, double costoBebida) {
        double total = costoPrimerPlato + costoBebida;
        System.out.println("El costo de " + primerPlato + " y " + bebida + " es = $" + total);
    }

    public void calcularPrecio(String primerPlato, double costoPrimerPlato,
            String segundoPlato, double costoSegundoPlato, String bebida, double costoBebida) {
        double total = costoPrimerPlato + costoSegundoPlato + costoBebida;
        System.out.println("El precio de " + primerPlato + " + " + segundoPlato + " + " + bebida +
                " es = $" + total);
    }

    public void calcularPrecio(String primerPlato, double costoPrimerPlato,
            String segundoPlato, double costoSegundoPlato, String postre,
            double costoPostre, String bebida, double costoBebida) {
        double total = costoPrimerPlato + costoSegundoPlato + costoBebida + costoPostre;
        System.out.println("El precio de " + primerPlato + " + " + segundoPlato + " + " + bebida +
                " + " + postre + "es = $" + total);
    }

}
