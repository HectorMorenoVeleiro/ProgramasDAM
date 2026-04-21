package tercer_trimestre.cole;

public class Test3 {

    public static void main(String[] args) {

        Persona p = new Estudiante(null, null, null, 0);

        if (p instanceof Estudiante) {
            Estudiante e = (Estudiante) p;
            System.out.println("Carrera recuperada: " + e.getCarrera());
            System.out.println("Semestre: " + e.getSemestre());
        }

        Persona p2 = new Profesor(null, null, null, null);

        if (p2 instanceof Profesor) {
            Profesor profe = (Profesor) p2;
            System.out.println("Departamento: " + profe.getDepartamento());
            System.out.println("Categoria: " + profe.getCategoria());
        }

        // 4 veces nos podemos equivocar
        Profesor malo = (Profesor) p;
        System.out.println("Departamento " + malo.getDepartamento());

        Estudiante bueno = (Estudiante) p2;
        System.out.println("Semestre: " + bueno.getSemestre());

        // !!!!!POR ESO SE USA ANTES de hacer el downcasting el operador InstanceOf
    }

}
