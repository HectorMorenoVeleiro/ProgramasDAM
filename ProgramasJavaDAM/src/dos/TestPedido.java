package dos;

public class TestPedido {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.calcularPedido("Ensalada César", 15.0, "Agua", 5.0);
        pedido.calcularPrecio("chuleta de cerdo", 15.0, "Macarrones", 20.0, "Agua", 5.0);
        pedido.calcularPrecio("Pizza", 8.0, "Pasta", 12.0, "Helado", 2.0, "Refresco", 2.5);
    }
}
