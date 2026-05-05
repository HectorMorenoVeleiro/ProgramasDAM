package tercer_trimestre.medicina;

public class Pediatra extends Medico {

    enum tipologiaPed {
        NEUROLOGO, PSICOLOGO
    };

    // en base al enum de arriba -->
    public tipologiaPed tipo;

    public Pediatra(String nombre, tipologiaPed tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public void setTipologiaPed(tipologiaPed tipo) {
        this.tipo = tipo;
    }

    public tipologiaPed getTipologiaPed() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n[tipologiaPed= " + getTipologiaPed() + "]";
    }
}
