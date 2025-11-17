package dos;

public class Caja {

    //atributos
    double base;
    double anchura;
    double altura;
    String tipo;

    //constructor completo
    public Caja(double base, double anchura, double altura) {
        this.base = base;
        this.anchura = anchura;
        this.altura = altura;
    }

    //constructor por defecto
    public Caja() {
        base = anchura = altura = 0d;
    }

    //constructor con un parametro de tipo longitud double
    public Caja(double longitud) {
        this.base = this.anchura = this.altura = longitud;
    }

    //Constructor con un nuevo atributo tipoDeCaja
    public Caja(double base, double anchura, double altura, String tipo) {
        this(base, anchura, altura);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Caja{" + "base=" + base +
                ", anchura=" + anchura +
                ", altura=" + altura +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
