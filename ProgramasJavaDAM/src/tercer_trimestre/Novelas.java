package tercer_trimestre;

public class Novelas extends Libro {

    // enum
    enum tipoNovela {
        HISTORICA, ROMANTICA, POLICIACA, REALISTA, CIENCIA_FICCION, AVENTURAS
    };

    // atributes
    tipoNovela tipo; // tipo de novela

    // ctr
    public Novelas(String titulo, String autor, tipoNovela tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }

    // getters + setters
    public tipoNovela getTipo() {
        return tipo;
    }

    public void setTipo(tipoNovela tipo) {
        this.tipo = tipo;
    }

    // toString
    @Override
    public String toString() {
        return "";
    }
}
