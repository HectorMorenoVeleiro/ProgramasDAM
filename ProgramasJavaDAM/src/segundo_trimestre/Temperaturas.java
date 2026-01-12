package segundo_trimestre;

import java.util.Arrays;
import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaracion, lo que tu tienes
        int[] temperaturas1;

        // Inializacion, crear espacio para 10 datos
        temperaturas1 = new int[10];

        System.out.println(Arrays.toString(temperaturas1));

        // peticion de valores enteros de temperaturas
        for (int i = 0; i < temperaturas1.length; i++) {
            System.out.println("dame un entero para el indice :" + i);
            temperaturas1[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println(Arrays.toString(temperaturas1));

        // 1. CLONACION: Crea un objeto NUEVO en una direccion de memoria DISTINTA
        int[] temperaturas2 = (int[]) temperaturas1.clone();

        // 2. REFERENCIA: Ambas variables apuntan al MISMO objeto en memoria
        int[] temperaturas3 = temperaturas1;

        // Comparacion entre temperaturas1 y temperaturas2 (clon)
        if (temperaturas1.equals(temperaturas2))
            System.out.println("=");
        else
            System.out.println("!=");

        // Comparacion entre temperatuas1 y temperaturas3 (referencia)
        if (temperaturas1.equals(temperaturas3))
            System.out.println("=");
        else
            System.out.println("!=");

        sc.close();
    }

}
