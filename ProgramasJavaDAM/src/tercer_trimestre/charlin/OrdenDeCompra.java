package tercer_trimestre.charlin;

import java.util.ArrayList;

public class OrdenDeCompra {

    String ID;

    OrdenDeCompra(String ID, int lineasPedido) {
        this.ID = ID;
        this.lineasPedido = lineasPedido;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public int getLineasPedido() {
        return lineasPedido;
    }

    public void setLineasPedido(int lineasPedido) {
        this.lineasPedido = lineasPedido;
    }

    public void calcularTotal() {

    }

    public void añadirItem() {

    }

    public String toString() {
        return "alvari villa es verde";
    }

}
