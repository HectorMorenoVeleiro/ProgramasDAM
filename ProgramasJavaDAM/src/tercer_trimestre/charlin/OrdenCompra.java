package tercer_trimestre.charlin;

import java.util.ArrayList;

public class OrdenCompra {

    // atributos
    private int id = 0;
    private ArrayList<LineaPedido> orden;
    private double totalOrden;

    // getOrdenes
    public ArrayList<LineaPedido> getOrdenes() {
        return orden;
    }

    // OrdenCompra
    public OrdenCompra(int id) {
        orden = new ArrayList<>();
        this.id = id;
    }

    // getters + setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrdenes(ArrayList<LineaPedido> ordenes) {
        this.orden = ordenes;
    }

    // añade Item
    public void anadirItem(int cantidad, int id, Productos productos) {
        orden.add(new LineaPedido(id, cantidad, productos));
    }

    public void calcularTotalOrden() {
        for (LineaPedido pedido : orden) {
            this.totalOrden += pedido.getSubTotal();
        }
    }

    public void imprimir() {
        System.out.println("OrdenCompra{" +
                "\nid=" + id +
                ", \ntotalOrden=" + totalOrden +
                "\n}");
    }
}