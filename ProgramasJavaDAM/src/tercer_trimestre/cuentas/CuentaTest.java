package tercer_trimestre.cuentas;

public class CuentaTest {

    public static void main(String[] args) {
        System.out.println("--- PROBANDO CUENTA DE AHORROS ---");
        // Saldo inicial 15000 para que esté activa (> 10000)
        CuentaAhorro ahorro = new CuentaAhorro(15000, 12);
        ahorro.consignar(2000); // Saldo: 17000

        // Realizamos 5 retiros para probar la comisión extra (límite es 4)
        ahorro.retirar(1000);
        ahorro.retirar(1000);
        ahorro.retirar(1000);
        ahorro.retirar(1000);
        ahorro.retirar(1000); // Este es el 5to retiro, generará comisión

        ahorro.extractoMensual(); // Aplica intereses y comisión por exceso de retiros
        System.out.println(ahorro.toString());
        System.out.println();

        System.out.println("--- PROBANDO CUENTA CORRIENTE (SOBREGIRO) ---");
        // Saldo inicial 5000
        CuentaCorriente corriente = new CuentaCorriente(5000, 10);

        // Retiramos más de lo que hay para activar sobregiro
        System.out.println("Retirando 7000 de un saldo de 5000...");
        corriente.retirar(7000);
        System.out.println(corriente.toString());

        // Consignamos para reducir el sobregiro
        System.out.println("Consignando 1000 para reducir sobregiro...");
        corriente.consignar(1000);
        System.out.println(corriente.toString());
        System.out.println();

        System.out.println("--- PROBANDO CUENTA BASE (INTERESES) ---");
        Cuenta cuentaSimple = new Cuenta(10000, 12); // 12% anual = 1% mensual
        cuentaSimple.calcularInteres(); // Debería sumar 100 (1% de 10000)
        System.out.println("Saldo tras interés mensual: " + cuentaSimple.getSaldo());
    }
}