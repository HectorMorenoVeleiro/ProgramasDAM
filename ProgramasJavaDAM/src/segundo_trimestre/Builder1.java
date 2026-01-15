package segundo_trimestre;

public class Builder1 {

    public static void main(String[] args) {

        // Usos StringBuilder
        /* --String-- */
        StringBuffer nombre = new StringBuffer("Renso");

        /* --Empty_capacity-- */
        StringBuffer apellidos = new StringBuffer(80);

        /* --Empty-- */
        StringBuffer direccion = new StringBuffer();

        // --------------------------------------------------------------

        // Usos StringBuffer (unlock)
        /* --length-- */
        System.out.println(nombre.length());

        /* --capacity-- */
        System.out.println(nombre.capacity());
        System.out.println(apellidos.capacity());

        /* --append-- */
        System.out.println(nombre.append(" Regino"));
        System.out.println(direccion.append("Camino De Las Luces"));

        /* --nuevo_string(OBJETO)-- */
        String otrosApellidos = new String(" Moreno Perez");

        // Cadena StringBuilder de (otrosApellidos)
        nombre.append(otrosApellidos);
        nombre.append(" porque no saben pronunciar el peruano");

        System.out.println(nombre);

        /* --reverse-- */
        nombre.reverse();

        /* --toString-- */
        nombre.toString();

        // -------------------------------------------------------------

        // Ahora conviertes el StringBuffer(StringBuilder) a un String simple
        /* --nuevo_String-- */
        String experimento_finalizado = nombre.toString();
        System.out.println(experimento_finalizado); // Aqui sale directamente como una cadena y no un constructor

    }

}
