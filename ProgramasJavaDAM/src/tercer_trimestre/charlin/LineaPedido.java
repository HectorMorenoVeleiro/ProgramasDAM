package tercer_trimestre.charlin;

public class LineaPedido {
    private Productos producto;
    private int cantidad = 0;
    private double subTotal = 0;
    private int id = 0;

    public LineaPedido(int id, int cantidad, Productos producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto = producto;
        subTotal = producto.getPrecio() * cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void imprimir() {
        System.out.println("LineaPedido{" +
                "\nid=" + id +
                ", \nproducto=" + producto +
                ", \ncantidad=" + cantidad +
                ", \nsubTotal=" + subTotal +
                "\n}");
    }
}