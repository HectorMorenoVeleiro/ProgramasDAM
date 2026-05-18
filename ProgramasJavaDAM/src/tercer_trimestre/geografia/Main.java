import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ===========================================================
        // En este testeo se van a crear los municipios de Pontevedra....
        // ===========================================================
        System.out.println("===========================================================");
        System.out.println("En este testeo se van a crear los municipios de Pontevedra....");
        System.out.println("===========================================================");

        // 1. Crear el ArrayList para almacenar los municipios
        ArrayList<Municipio> listaMunicipios = new ArrayList<>();

        // 2. Instanciar los 61 municipios (Atributos: nombre, poblacion,
        // temperaturaMedia, altitud)
        listaMunicipios.add(new Municipio("Pontevedra", 83000, 15.0, 20));
        listaMunicipios.add(new Municipio("Barro", 3700, 14.5, 70));
        listaMunicipios.add(new Municipio("Campo Lameiro", 1800, 13.5, 320));
        listaMunicipios.add(new Municipio("Cotobade", 4200, 13.0, 350));
        listaMunicipios.add(new Municipio("A Lama", 2400, 12.5, 450));
        listaMunicipios.add(new Municipio("Poio", 17000, 15.0, 40));
        listaMunicipios.add(new Municipio("Ponte Caldelas", 5500, 13.8, 250));
        listaMunicipios.add(new Municipio("Vilaboa", 6000, 14.8, 30));
        listaMunicipios.add(new Municipio("Vigo", 293000, 15.5, 50));
        listaMunicipios.add(new Municipio("Baiona", 12000, 15.2, 15));
        listaMunicipios.add(new Municipio("Fornelos de Montes", 1600, 12.0, 420));
        listaMunicipios.add(new Municipio("Gondomar", 14800, 14.9, 80));
        listaMunicipios.add(new Municipio("Mos", 15000, 14.5, 140));
        listaMunicipios.add(new Municipio("Nigrán", 17300, 15.3, 35));
        listaMunicipios.add(new Municipio("Pazos de Borbén", 3000, 13.2, 260));
        listaMunicipios.add(new Municipio("O Porriño", 20000, 14.7, 110));
        listaMunicipios.add(new Municipio("Redondela", 29000, 15.1, 42));
        listaMunicipios.add(new Municipio("Soutomaior", 7400, 14.8, 75));
        listaMunicipios.add(new Municipio("Vilagarcía de Arousa", 37500, 15.0, 10));
        listaMunicipios.add(new Municipio("Cambados", 13700, 15.1, 12));
        listaMunicipios.add(new Municipio("O Grove", 10500, 15.4, 8));
        listaMunicipios.add(new Municipio("A Illa de Arousa", 4900, 15.3, 5));
        listaMunicipios.add(new Municipio("Meaño", 5300, 14.7, 60));
        listaMunicipios.add(new Municipio("Meis", 4700, 14.5, 120));
        listaMunicipios.add(new Municipio("Ribadumia", 5100, 14.8, 40));
        listaMunicipios.add(new Municipio("Sanxenxo", 17400, 15.6, 15));
        listaMunicipios.add(new Municipio("Vilanova de Arousa", 10200, 15.0, 15));
        listaMunicipios.add(new Municipio("Cangas", 26500, 15.2, 20));
        listaMunicipios.add(new Municipio("Moaña", 19400, 15.1, 35));
        listaMunicipios.add(new Municipio("Bueu", 12000, 14.9, 25));
        listaMunicipios.add(new Municipio("Marín", 24300, 15.0, 15));
        listaMunicipios.add(new Municipio("Tui", 16800, 15.0, 45));
        listaMunicipios.add(new Municipio("A Guarda", 10000, 15.2, 20));
        listaMunicipios.add(new Municipio("O Rosal", 6200, 15.1, 55));
        listaMunicipios.add(new Municipio("Tomiño", 13500, 15.0, 60));
        listaMunicipios.add(new Municipio("Oia", 3000, 14.8, 85));
        listaMunicipios.add(new Municipio("Ponteareas", 23000, 14.5, 50));
        listaMunicipios.add(new Municipio("Mondariz", 4400, 13.8, 120));
        listaMunicipios.add(new Municipio("Mondariz-Balneario", 700, 14.0, 90));
        listaMunicipios.add(new Municipio("As Neves", 3800, 14.2, 150));
        listaMunicipios.add(new Municipio("Salvaterra de Miño", 9800, 14.8, 65));
        listaMunicipios.add(new Municipio("A Cañiza", 5100, 11.5, 570));
        listaMunicipios.add(new Municipio("Arbo", 2600, 14.9, 130));
        listaMunicipios.add(new Municipio("Covelo", 2400, 11.8, 490));
        listaMunicipios.add(new Municipio("Crecente", 2000, 13.5, 290));
        listaMunicipios.add(new Municipio("Lalín", 20200, 11.2, 550));
        listaMunicipios.add(new Municipio("Agolada", 2300, 11.0, 520));
        listaMunicipios.add(new Municipio("Dozón", 1100, 10.5, 640));
        listaMunicipios.add(new Municipio("Rodeiro", 2400, 10.8, 610));
        listaMunicipios.add(new Municipio("Silleda", 8600, 11.6, 510));
        listaMunicipios.add(new Municipio("Vila de Cruces", 5200, 11.9, 430));
        listaMunicipios.add(new Municipio("A Estrada", 20400, 12.5, 300));
        listaMunicipios.add(new Municipio("Forcarei", 3300, 11.0, 620));
        listaMunicipios.add(new Municipio("Cerdedo", 1800, 12.0, 450));
        listaMunicipios.add(new Municipio("Caldas de Reis", 9800, 14.2, 25));
        listaMunicipios.add(new Municipio("Catoira", 3300, 14.5, 15));
        listaMunicipios.add(new Municipio("Cuntis", 4600, 13.5, 180));
        listaMunicipios.add(new Municipio("Moraña", 4200, 13.8, 160));
        listaMunicipios.add(new Municipio("Pontecesures", 3000, 14.6, 10));
        listaMunicipios.add(new Municipio("Portas", 2900, 14.3, 45));
        listaMunicipios.add(new Municipio("Valga", 5900, 14.5, 25));

        // 3. Instanciar el Departamento pasando el nombre y la lista de municipios
        Departamento departamento = new Departamento("Pontevedra", listaMunicipios);

        // Test de verificación rápida
        System.out.println("Departamento creado: " + departamento.getNombre());
        System.out.println("Total de municipios cargados: ");
        for (Municipio municipio : listaMunicipios) {
            municipio.imprimir();
        }
    }
}