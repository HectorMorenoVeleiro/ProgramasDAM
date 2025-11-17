package EjerciciosNumerosAleatorios;

import EjerciciosClase.AjustesProgramas;

public class Ejercicio29 {
    /*
     * Realiza un programa que muestre la previsión del tiempo para mañana en
     * Málaga. Las temperaturas máxima y mínima se deben generar de forma
     * aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
     * últimas décadas para cada estación. La probabilidad de que esté soleado
     * o nublado en cada estación se proporciona a continuación. Obviamente, la
     * temperatura mínima deberá ser menor o igual que la temperatura máxima.
     * Ejemplo:
     * 
     * 1. Primavera
     * 2. Verano
     * 3. Otoño
     * 4. Invierno
     * Seleccione la estación del año (1-4): 4
     * Previsión del tiempo para mañana
     * --------------------------------
     * Temperatura mínima: 10ºC
     * Temperatura máxima: 16ºC
     * Nublado
     */
    public static void main(String[] args) {
        int temperaturaMaxima = 0, temperaturaMinima = 0;
        int probabilidadClima = (int) Math.random() * 100 + 1;
        String clima = null;
        ;
        int estaciónDelAño = AjustesProgramas.introduceRangoDeIntegers(4, 1,
                "\t1. Primavera\n\t2. Verano\n\t3. Otoño\n\t4. Invierno\n\tSeleccione la estación del año (1-4) --> ");
        System.out.println("----------------------------------------------------------");
        switch (estaciónDelAño) {
            case 1:
                temperaturaMaxima = 15;
                temperaturaMinima = 30;
                if (probabilidadClima > 40)
                    clima = "Soleado";
                else
                    clima = "Nublado";
                break;
            case 2:
                temperaturaMaxima = 25;
                temperaturaMinima = 45;
                if (probabilidadClima > 20)
                    clima = "Soleado";
                else
                    clima = "Nublado";
                break;
            case 3:
                temperaturaMaxima = 20;
                temperaturaMinima = 30;
                if (probabilidadClima > 60)
                    clima = "Soleado";
                else
                    clima = "Nublado";
                break;
            case 4:
                temperaturaMaxima = 0;
                temperaturaMinima = 25;
                if (probabilidadClima > 80)
                    clima = "Soleado";
                else
                    clima = "Nublado";
                break;
        }
        System.out.println("\tTemperatura mínima: " + temperaturaMinima + "ºC\n\t" +
                "Temperatura máxima: " + temperaturaMaxima + "ºC\n\t" +
                "" + clima);
    }

}
