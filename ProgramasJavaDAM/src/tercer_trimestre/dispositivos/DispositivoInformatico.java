package tercer_trimestre.dispositivos;

public class DispositivoInformatico {

    String marca = "Acer"; /* atributo que identifica la marca del dispositivo informatico */

    DispositivoInformatico() {
        System.out.println("Marca = " + marca);
    }

    @Override
    public String toString() {
        return "DispositivoInformatico [marca=" + marca + "]";
    }

}
