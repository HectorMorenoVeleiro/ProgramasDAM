package tres;

import EjerciciosCuentaPropia.AjustesProgramas;

public class ProgresionRecursiva {

    public static int primer;
    public static int razon;

    // metodo recursivo
    public static int terminoEne(int termObtener) {
        // recursividad
        if (termObtener == 1) // caso limite/base
            return primer;
        // recursividad caso generico
        else {
            return terminoEne(termObtener - 1) + razon;
        }
    }

    public static int sumaHastaEne(int termObtener) {
        if (termObtener == 1)
            return primer;
        else
            return sumaHastaEne(termObtener - 1) + terminoEne(termObtener);
    }

    public static void main(String[] args) {
        primer = AjustesProgramas.enterNumPorScanner("primer termino --> ");
        razon = AjustesProgramas.enterNumPorScanner("razón por la que multiplicamos --> ");
        int termObtener = AjustesProgramas.enterNumPorScanner("Que numero deseas obtener --> ");
        System.out.println(
                "la suma de los " + termObtener + " primeros terminos de la sucesion es: " + sumaHastaEne(termObtener));
        System.out.println("el termino " + termObtener + " es: " + terminoEne(termObtener));
    }
}
