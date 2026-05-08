package tercer_trimestre.competicion;

public class PartidoFutbolLigaEspanola implements PartidoFutbol {
    String equipoLocal;
    String equipoVisitante;
    int GolesEquipoLocal;
    int GolesEquipoVisitante;

    public PartidoFutbolLigaEspanola(String equipoLocal, String equipoVisitante, int golesEquipoLocal,
            int golesEquipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        GolesEquipoLocal = golesEquipoLocal;
        GolesEquipoVisitante = golesEquipoVisitante;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesEquipoLocal() {
        return GolesEquipoLocal;
    }

    public int getGolesEquipoVisitante() {
        return GolesEquipoVisitante;
    }

    @Override
    public void setEquipoLocal(String nombre) {
        this.equipoLocal = nombre;
    }

    @Override
    public void setEquipoVisitante(String nombre) {
        this.equipoVisitante = nombre;
    }

    @Override
    public void SetGolesEquipoLocal(int golesEquipoLocal) {
        this.GolesEquipoLocal = golesEquipoLocal;
    }

    @Override
    public void SetGolesEquipoVisitante(int golesEquipoVisitante) {
        this.GolesEquipoVisitante = golesEquipoVisitante;
    }

    public void imprimirMarcador() {
        System.out.println(
                "El equipo local: " + equipoLocal + " mete " + getGolesEquipoLocal() + " y el equipo visitante "
                        + equipoVisitante + " mete " + getGolesEquipoVisitante());
    }
}
