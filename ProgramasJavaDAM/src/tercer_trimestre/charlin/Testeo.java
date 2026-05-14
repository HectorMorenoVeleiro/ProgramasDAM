package tercer_trimestre.charlin;

public class Testeo {
    public static void main(String[] args) {
        Productos producto1 = new Productos(1, "Carpeta", "Carpeta anillada metálica", 1000);
        Productos producto2 = new Productos(2, "Tinta", "Tinta china de color negro.", 3000);
        Productos producto3 = new Productos(3, "Cinta pegante", "Cinta adhesiva de color transparente.", 800);
        Productos producto4 = new Productos(4, "Cartulina", "Pliego de cartulina 60x40 cms.", 600);

        OrdenCompra compra = new OrdenCompra(1);
        compra.anadirItem(1, 5, producto1);
        compra.anadirItem(2, 2, producto2);
        compra.anadirItem(3, 6, producto3);
        compra.anadirItem(4, 9, producto4);

        compra.calcularTotalOrden();
        System.out.println(compra);

        compra.imprimir();
    }
}