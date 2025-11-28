package tres;

import ejercicioscuentapropia.AjustesProgramas;

public class Propuesto10 {
    // numero vampiro

    public static boolean metodoVampirico(int digito1, int digito2, int numeroVampiro) {
        boolean esNumeroVampiroConEstosDigitos = false;
        if (digito1 * digito2 == numeroVampiro && !(digito1 % 10 == 0 && digito2 / 10 == 0))
            esNumeroVampiroConEstosDigitos = true;
        return esNumeroVampiroConEstosDigitos;
    }

    public static void main(String[] args) {
        /*
         * numero vampiro:
         * · numero par de digitos (20, 4053, 432224)
         * · colmillos (son fruto de la multiplicacion de
         * numeros del original, teniendo la mitad de este)
         * · permutacion (los dos colmillos combinados en x
         * forma forman el numero original)
         * · condicion de ceros (no pueden terminar ambos en 0)
         */

        // Llamas al numero por escaner
        int numeroVampiro = AjustesProgramas.enterRangoDeIntegers(10000, 999,
                "Introduce un número de 4 digitos --> ");

        boolean esNumeroVampiro = false;

        // divides el numero en digitos
        int digito1 = numeroVampiro % 10;
        int digito2 = (numeroVampiro / 10) % 10;
        int digito3 = (numeroVampiro / 100) % 10;
        int digito4 = numeroVampiro / 1000;

        // haces todas las combinaciones de digitos
        int operacion1 = digito1 + digito2 * 10; // 12
        int operacion2 = digito1 + digito3 * 10; // 13
        int operacion3 = digito1 + digito4 * 10; // 14
        int operacion4 = digito2 + digito3 * 10; // 23
        int operacion5 = digito2 + digito4 * 10; // 24
        int operacion6 = digito3 + digito4 * 10; // 34
        int operacion7 = digito2 + digito1 * 10; // 21
        int operacion8 = digito3 + digito1 * 10; // 31
        int operacion9 = digito4 + digito1 * 10; // 41
        int operacion10 = digito3 + digito2 * 10; // 32
        int operacion11 = digito4 + digito2 * 10; // 42
        int operacion12 = digito4 + digito3 * 10; // 43

        // llamas a un metodo que compruebe si esa combinacion es = numeroVampiro y con
        // que solo una lo sea entonces se confirma
        if (metodoVampirico(operacion1, operacion6, numeroVampiro)
                || metodoVampirico(operacion2, operacion5, numeroVampiro)
                || metodoVampirico(operacion3, operacion4, numeroVampiro)
                || metodoVampirico(operacion7, operacion12, numeroVampiro)
                || metodoVampirico(operacion8, operacion11, numeroVampiro)
                || metodoVampirico(operacion9, operacion10, numeroVampiro)
                || metodoVampirico(operacion1, operacion8, numeroVampiro)
                || metodoVampirico(operacion1, operacion9, numeroVampiro)
                || metodoVampirico(operacion1, operacion10, numeroVampiro)
                || metodoVampirico(operacion1, operacion11, numeroVampiro)
                || metodoVampirico(operacion1, operacion12, numeroVampiro)
                || metodoVampirico(operacion2, operacion3, numeroVampiro)
                || metodoVampirico(operacion2, operacion4, numeroVampiro)
                || metodoVampirico(operacion2, operacion5, numeroVampiro)
                || metodoVampirico(operacion2, operacion6, numeroVampiro)
                || metodoVampirico(operacion2, operacion7, numeroVampiro)
                || metodoVampirico(operacion2, operacion8, numeroVampiro)
                || metodoVampirico(operacion2, operacion9, numeroVampiro)
                || metodoVampirico(operacion2, operacion10, numeroVampiro)
                || metodoVampirico(operacion2, operacion11, numeroVampiro)
                || metodoVampirico(operacion2, operacion12, numeroVampiro)
                || metodoVampirico(operacion3, operacion4, numeroVampiro)
                || metodoVampirico(operacion3, operacion5, numeroVampiro)
                || metodoVampirico(operacion3, operacion6, numeroVampiro)
                || metodoVampirico(operacion3, operacion7, numeroVampiro)
                || metodoVampirico(operacion3, operacion8, numeroVampiro)
                || metodoVampirico(operacion3, operacion9, numeroVampiro)
                || metodoVampirico(operacion3, operacion10, numeroVampiro)
                || metodoVampirico(operacion3, operacion11, numeroVampiro)
                || metodoVampirico(operacion3, operacion12, numeroVampiro)
                || metodoVampirico(operacion4, operacion5, numeroVampiro)
                || metodoVampirico(operacion4, operacion6, numeroVampiro)
                || metodoVampirico(operacion4, operacion7, numeroVampiro)
                || metodoVampirico(operacion4, operacion8, numeroVampiro)
                || metodoVampirico(operacion4, operacion9, numeroVampiro)
                || metodoVampirico(operacion4, operacion10, numeroVampiro)
                || metodoVampirico(operacion4, operacion11, numeroVampiro)
                || metodoVampirico(operacion4, operacion12, numeroVampiro)
                || metodoVampirico(operacion5, operacion6, numeroVampiro)
                || metodoVampirico(operacion5, operacion7, numeroVampiro)
                || metodoVampirico(operacion5, operacion8, numeroVampiro)
                || metodoVampirico(operacion5, operacion9, numeroVampiro)
                || metodoVampirico(operacion5, operacion10, numeroVampiro)
                || metodoVampirico(operacion5, operacion11, numeroVampiro)
                || metodoVampirico(operacion5, operacion12, numeroVampiro)
                || metodoVampirico(operacion6, operacion7, numeroVampiro)
                || metodoVampirico(operacion6, operacion8, numeroVampiro)
                || metodoVampirico(operacion6, operacion9, numeroVampiro)
                || metodoVampirico(operacion6, operacion10, numeroVampiro)
                || metodoVampirico(operacion6, operacion11, numeroVampiro)
                || metodoVampirico(operacion6, operacion12, numeroVampiro)
                || metodoVampirico(operacion7, operacion8, numeroVampiro)
                || metodoVampirico(operacion7, operacion9, numeroVampiro)
                || metodoVampirico(operacion7, operacion10, numeroVampiro)
                || metodoVampirico(operacion7, operacion11, numeroVampiro)
                || metodoVampirico(operacion7, operacion12, numeroVampiro)
                || metodoVampirico(operacion8, operacion9, numeroVampiro)
                || metodoVampirico(operacion8, operacion10, numeroVampiro)
                || metodoVampirico(operacion8, operacion11, numeroVampiro)
                || metodoVampirico(operacion8, operacion12, numeroVampiro)
                || metodoVampirico(operacion9, operacion10, numeroVampiro)
                || metodoVampirico(operacion9, operacion11, numeroVampiro)
                || metodoVampirico(operacion9, operacion12, numeroVampiro)
                || metodoVampirico(operacion10, operacion11, numeroVampiro)
                || metodoVampirico(operacion10, operacion12, numeroVampiro)
                || metodoVampirico(operacion11, operacion12, numeroVampiro))
            esNumeroVampiro = true;

        // le comentas tu descubrimiento al colegón que prueba el programa
        System.out.println("El numero " + numeroVampiro + " es un numero vampiro ? --> " + esNumeroVampiro);
    }
}
