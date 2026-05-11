package tercer_trimestre.peaje;

import java.util.ArrayList;

public class Peaje {

    // Atributo que identifica el nombre de una estación de peaje
    String nombre;
    /*
     * Atributo que identifica el nombre del departamento donde está ubicada la
     * estación de peaje
     */
    String departamento;
    /*
     * Atributo que identifica el conjunto de vehículos que llega a la estación de
     * peaje
     */
    ArrayList<Vehiculo> vehiculos;
    /*
     * Atributo que identifica el total de dinero recolectado por la estación de
     * peaje
     */
    int totalPeaje = 0;

    /*
     * Atributos contadores de clase
     */
    static int totalCamiones = 0;
    static int totalMotos = 0;
    static int totalCarros = 0;

    /**
     * Constructor de la clase Peaje
     * 
     * @param nombre       Parámetro que define el nombre de la estación de peaje
     * @param departamento Parámetro que define el departamento donde se encuentra
     *                     localizado el peaje
     */
    Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        vehiculos = new ArrayList<>(); // Crea el vector de vehículos
    }

    /**
     * Método que devuelve el nombre de la estación de peaje
     * 
     * @return El nombre de la estación de peaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre de la estación de peaje
     * 
     * @param nombre Parámetro que define el nombre de la estación de peaje
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el departamento donde está localizada la estación de
     * peaje
     * 
     * @return El departamento donde está localizada la estación de peaje
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Método que establece el departamento donde está localizada la estación de
     * peaje
     * 
     * @param departamento Parámetro que define el departamento donde está
     *                     localizada la estación de peaje
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Método que permite añadir un vehículo al vector de vehículos de la estación
     * de peaje
     * 
     * @param vehículo Parámetro que define el vehículo a agregar al vector de
     *                 vehículos de la estación de peajeRelaciones de asociación,
     *                 agregación y composición 315
     */
    public void anadirVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    /**
     * Método que permite calcular el peaje de un vehículo que llega a la estación
     * de peaje
     * 
     * @param Parámetro que define el vehículo que llega a la estación de peaje
     */
    public int calcularPeaje(Vehiculo vehiculo) {
        if (vehiculo instanceof Carro) { /*
                                          * Si el vehículo que llegó es un carro
                                          */
            totalCarros++; // Actualiza el total de carros que llega al peaje
            totalPeaje += Carro.valorPeaje; /*
                                             * Actualiza el total de dinero del peaje
                                             */
            return Carro.valorPeaje; // Retorna el dinero pagado por un carro
        } else if (vehiculo instanceof Moto) { /*
                                                * Si el vehículo que llegó es una moto
                                                */
            totalMotos++; // Actualiza el total de motos que llega al peaje
            totalPeaje += Moto.valorPeaje; /*
                                            * Actualiza el total de dinero del peaje
                                            */
            return Moto.valorPeaje; // Retorna el dinero pagado por una motow
        } else if (vehiculo instanceof Camion) { /*
                                                  * Si el vehículo que llegó es un camión
                                                  */
            totalCamiones++; /*
                              * Actualiza el total de camiones que llega al peaje
                              */
            Camion camion = (Camion) vehiculo; /*
                                                * Obtiene un objeto Camión
                                                */
            /*
             * Calcula el peaje del camión y actualiza total de dinero del peaje
             */
            totalPeaje += camion.getNumeroEjes() * camion.getValorPeajeEje();
            // Retorna el dinero pagado por un camión
            return camion.getNumeroEjes() * camion.getValorPeajeEje();
        } else
            return -1; // Si llega otro tipo de objeto
    }

    /**
     * Método que muestra en pantalla los datos del peaje, el total de vehículos que
     * llegó al peaje discriminado por tipo y el total de dinero recaudado por la
     * estación de peaje
     */
    public void imprimir() {
        System.out.println("Peaje = " + getNombre());
        System.out.println("Ubicación = " + getDepartamento());
        System.out.println("Total de carros = " + totalCarros);
        System.out.println("Total de motos = " + totalMotos);
        System.out.println("Total de camiones = " + totalCamiones);
        int totalVehiculos = totalCarros + totalMotos + totalCamiones;
        System.out.println("Total de vehículos = " + totalVehiculos);
        System.out.println("Dinero total = $" + totalPeaje);
    }
}