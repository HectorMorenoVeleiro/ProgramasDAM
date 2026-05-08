package tercer_trimestre.competicion;

public interface PartidoFutbol extends MatchDeportivo {
    public static final int DURACION_PARTIDO_FUTBOL = 90;

    public void SetGolesEquipoLocal(int numero);

    public void SetGolesEquipoVisitante(int numero);
}
