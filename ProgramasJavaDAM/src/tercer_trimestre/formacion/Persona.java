package tercer_trimestre.formacion;

public class Persona {

    int añosExperiencia;
    boolean esNacional; // true: lo es | false: no lo es

    public Persona(int añosExperiencia, boolean esNacional) {
        this.añosExperiencia = añosExperiencia;
        this.esNacional = esNacional;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public boolean isEsNacional() {
        return esNacional;
    }

    public void setEsNacional(boolean esNacional) {
        this.esNacional = esNacional;
    }

    public void imprimir() {
        System.out.println("Persona:\nañosExperiencia= " + getAñosExperiencia() + "\nesNacional= " + isEsNacional());
    }
}
