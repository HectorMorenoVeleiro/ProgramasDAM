package tres;

public class AmstrongGeneral {

    public static boolean isArmstrong(int n) {
        int centena = n / 100;
        int decena = (n % 100) / 10;
        int unidad = (n % 100) % 10;
        boolean confirmacion;
        if (Math.pow(centena, 3) + Math.pow(decena, 3) + Math.pow(unidad, 3) == n) {
            System.out.println();
            System.out.println("Es un numero de amstrong");
            confirmacion = true;
        } else {
            System.out.println("No es un numero de amstrong");
            confirmacion = false;
        }
        return confirmacion;
    }

    public static boolean esArmstrong(int num) {
        int original = num;
        int dig = numeroAmstrong.CuentaDigitos(num);
        int acum = 0;
        while (num > 0) {
            acum += (int) Math.pow((num % 10), dig);
            System.out.println(acum);
            num = num / 10;
            System.out.println(num);
        }
        return original == acum;
    }
}
