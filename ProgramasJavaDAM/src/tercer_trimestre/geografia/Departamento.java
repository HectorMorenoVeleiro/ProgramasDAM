package tercer_trimestre.geografia;

import java.util.ArrayList;

public class Departamento {
    String nombre;// Atributo que identifica el nombre de un departamento
    /*
     * Atributo que identifica los municipios que pertenecen a un
     * departamento
     */
    ArrayList<Municipio> municipios = new ArrayList<>();

    /**
     * Constructor de la clase Departamento
     * 
     * @param nombre     Parámetro que define el nombre del departamento
     * @param municipios Parámetro que define los municipios que
     *                   hacen parte del departamento
     */
    public Departamento(String nombre, ArrayList<Municipio> municipios) {
        this.nombre = nombre;
        this.municipios = municipios;
    }

    /**
     * Método que devuelve el nombre del departamento
     * 
     * @return El nombre del departamento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del departamento
     * 
     * @param nombre Parámetro que define el nombre del departamento
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que agrega un municipio al vector de municipios del
     * departamento
     * 
     * @param municipio Parámetro que define el municipio a agregar al
     *                  vector de municipios del departamento
     */
    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
        setNombre(this.nombre);
    }

    /**
     * Método que elimina un municipio del vector de municipios del
     * departamento
     * 
     * @param nombre Parámetro que define el nombre del municipio a
     *               eliminar
     */
    public void eliminarMunicipio(String nombre) {
        Municipio municipio;
        for (int i = 0; i < municipios.size(); i++) { /*
                                                       * Se debe recorrer el
                                                       * vector de municipios
                                                       */
            // Se obtiene un objeto municipio aplicando el proceso de casting
            municipio = (Municipio) municipios.get(i);
            // Si el nombre del municipio obtenido es igual al buscado
            if (nombre.equals(municipio.getNombre())) {
                municipios.remove(municipio); /*
                                               * Elimina el municipio
                                               * del vector
                                               */
                break; // No es necesario seguir buscando el municipio
            }
        }
    }

    /**
     * Método que busca un municipio a partir de un nombre
     * 
     * @param nombre Parámetro que define el nombre del municipio a
     *               buscar
     */
    public void buscarMunicipio(String nombre) {
        Municipio municipio;
        boolean enontrado = false;
        for (int i = 0; i < municipios.size(); i++) { /*
                                                       * Se debe recorrer el
                                                       * vector de municipios
                                                       */
            // Se obtiene un objeto municipio aplicando el proceso de castingRelaciones de
            // asociación, agregación y composición 377
            municipio = (Municipio) municipios.get(i);
            // Si el nombre del municipio obtenido es igual al buscado
            if (nombre.equals(municipio.getNombre())) {
                municipio.imprimir(); /*
                                       * Se muestra en pantalla los datos
                                       * del municipio encontrado
                                       */
                enontrado = true;
                break; // No es necesario seguir explorando el vector de
            }
            if (!enontrado) { /*
                               * Si el
                               * municipio no se encuentra
                               */
                System.out.println("Municipio no encontrado");
            }
        }
    }

    /**
     * Método que busca municipios con una población mayor o igual a
     * un valor dado como parámetro
     * 
     * @param población Parámetro que define una determinada
     *                  cantidad de población
     */
    public void buscarMunicipioConPoblaciónMayor(int población) {
        Municipio municipio;
        boolean encontróMunicipios = false;
        for (int i = 0; i < municipios.size(); i++) { /*
                                                       * Se debe recorrer el
                                                       * vector de municipios
                                                       */
            // Se obtiene un objeto municipio aplicando el proceso de casting
            municipio = (Municipio) municipios.get(i);
            /*
             * Si la población del municipio obtenido es mayor o igual que
             * la población ingresada
             */
            if (municipio.getPoblación() >= población) {
                System.out.println(municipio.getNombre()); /*
                                                            * Se
                                                            * imprime el nombre del municipio
                                                            */
                encontróMunicipios = true;
            }
        }
        /*
         * En caso de no encontrar municipios que no tengan una
         * población igual o mayor a la ingresada
         */
        if (!encontróMunicipios) {
            System.out.println("No existen municipios con esta población");
        }
    }

    /**
     * Método que calcula el censo poblacional del departamento
     * sumando la población de todos los municipios del departamento
     * 
     * @return La población total del departamento
     */
    public int calcularCensoPoblaciónDepartamento() {
        Municipio municipio;
        int totalCenso = 0; // El total a calcular se inicializa en cero
        for (int i = 0; i < municipios.size(); i++) { /*
                                                       * Se recorre el vector
                                                       * de municipios
                                                       */
            // Se obtiene un municipio utilizando el proceso de casting
            municipio = (Municipio) municipios.get(i);
            totalCenso += municipio.getPoblación(); /*
                                                     * Se acumula el
                                                     * total de población del municipio
                                                     */
        }
        return totalCenso; // Devuelve el total calculado
    }
}