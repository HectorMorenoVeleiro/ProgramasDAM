package ejercicioscuentapropia.ExamenesAnteriores;

//programa algoritmo recursivo que permita sumar digitos de un numero
//Ejemplo
//Entrada (1234)
//Salida   (10)
public class Ejercicio1 {

    public static int digitos_numero(int num) {
        int digitos = (String.valueOf(num)).length();
        return digitos;
    }

    public static int sumarDigitos(int num, int contador) {
        int sumatorioDigitos = 0;
        while (true) {
            sumatorioDigitos += (int) (((float) num / (Math.pow(10, contador - 1))));
            System.out.println((int) (((float) num / (Math.pow(10, contador - 1)))));
            num = num - ((int) Math.pow(10, contador - 1)) * (int) ((float) num / (Math.pow(10, contador - 1)));
            contador--;
            if (contador < 1)
                break;
        }
        return sumatorioDigitos;
    }

    public static void main(String[] args) {
        System.out.println(sumarDigitos(1234, digitos_numero(1234)));
    }

}

// 1
// 2
// 3
// 4
// 1 + 2 + 3 + 4