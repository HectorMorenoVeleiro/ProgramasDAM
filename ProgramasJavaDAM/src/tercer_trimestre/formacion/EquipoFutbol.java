package tercer_trimestre.formacion;

public class EquipoFutbol {

    String nombre;
    String pais;
    Tecnico tecnico;
    Portero portero;
    Defensa[] defensa = new Defensa[4];
    MedioCampo[] mediocampo = new MedioCampo[4];
    Delantero[] delantero = new Delantero[2];

    public EquipoFutbol(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public EquipoFutbol(String nombre, String pais, Tecnico tecnico, Portero portero, Defensa[] defensa,
            MedioCampo[] mediocampo, Delantero[] delantero) {
        this(nombre, pais);
        this.tecnico = tecnico;
        this.portero = portero;
        this.defensa = defensa;
        this.mediocampo = mediocampo;
        this.delantero = delantero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Portero getPortero() {
        return portero;
    }

    public void setPortero(Portero portero) {
        this.portero = portero;
    }

    public Defensa[] getDefensa() {
        return defensa;
    }

    public void setDefensa(Defensa[] defensa) {
        this.defensa = defensa;
    }

    public MedioCampo[] getMediocampo() {
        return mediocampo;
    }

    public void setMediocampo(MedioCampo[] mediocampo) {
        this.mediocampo = mediocampo;
    }

    public Delantero[] getDelantero() {
        return delantero;
    }

    public void setDelantero(Delantero[] delantero) {
        this.delantero = delantero;
    }

    public void imprimir() {
        System.out.println("Equipo De Futbol: \nnombre= " + getNombre() + "\npais= " + getPais());
        System.out.println();
        tecnico.imprimir();
        System.out.println();
        portero.imprimir();
        System.out.println();
        for (Defensa defensa : defensa) {
            defensa.imprimir();
            System.out.println();
        }
        for (MedioCampo medioCampo : mediocampo) {
            medioCampo.imprimir();
            System.out.println();
        }
        for (Delantero delantero : delantero) {
            delantero.imprimir();
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // defensas
        Defensa[] defensas = new Defensa[4];
        for (int i = 0; i < defensas.length; i++) {
            defensas[i] = new Defensa(10, true, false);
        }

        // mediocampos
        MedioCampo[] medioCampo = new MedioCampo[4];
        for (int i = 0; i < medioCampo.length; i++) {
            medioCampo[i] = new MedioCampo(7, true, false, 15);
        }

        // delanteros
        Delantero[] delanteros = new Delantero[2];
        for (int i = 0; i < delanteros.length; i++) {
            delanteros[i] = new Delantero(6, false, true, 6);
        }

        Tecnico tecnico = new Tecnico(14, false);

        Portero portero = new Portero(6, false, true, 100);

        EquipoFutbol equipoFultbol = new EquipoFutbol("Sporting de Macedonia", "Santaclarita Palomar", tecnico, portero,
                defensas, medioCampo,
                delanteros);

        equipoFultbol.imprimir();

    }
}
