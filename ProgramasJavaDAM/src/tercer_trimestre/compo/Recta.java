package tercer_trimestre.compo;

public class Recta {

    Punto p1;
    Punto p2;
    double pendiente;
    double longitud;

    Recta(Punto punto1, Punto punto2) {
        this.p1 = punto1;
        this.p2 = punto2;
    }

    Recta(int x1, int y1, int x2, int y2) {
        this.p1 = new Punto(x1, y1);
        this.p2 = new Punto(x2, y2);
        calcularPendiente();
        calcularLongitudSegmento();
    }

    Punto getPunto1() {
        return p1;
    }

    Punto getPunto2() {
        return p2;
    }

    double getPendiente() {
        return this.pendiente;
    }

    double getlongitud() {
        return this.longitud;
    }

    void calcularPendiente() {
        this.pendiente = ((double) (p2.y - p1.y) / (double) (p2.x - p1.x));
    }

    void calcularLongitudSegmento() {
        this.longitud = Math.sqrt((Math.pow((double) (p2.x - p1.x), 2) + Math.pow((double) (p2.y - p1.y), 2)));
    }

    // double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    void imprimir() {
        System.out.println("PUNTO: [\np1= " + getPunto1() + " p2= " + getPunto2());
        System.out.println("pendiente= " + getPendiente());
        System.out.println("longitud= " + getlongitud());
    }

}
