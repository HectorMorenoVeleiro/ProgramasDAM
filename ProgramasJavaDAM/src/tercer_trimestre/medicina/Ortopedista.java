package tercer_trimestre.medicina;

public class Ortopedista extends Medico {

    enum tipologiaOrt {
        MAXILOFACIAL, PEDIATRICA
    };

    tipologiaOrt tipo;

    public Ortopedista(String nombre, tipologiaOrt tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public void setTipologiaOrt(tipologiaOrt tipo) {
        this.tipo = tipo;
    }

    public tipologiaOrt getTipologiaOrt() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n[tipologiaOrt= " + getTipologiaOrt() + "]";
    }
}
