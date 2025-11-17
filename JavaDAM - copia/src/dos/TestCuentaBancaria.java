package dos;

import dos.CuentaBancaria.tipoCuenta;

public class TestCuentaBancaria {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria(0.02f, "Pedro", "Perez", 123456789, tipoCuenta.CUENTA_AHORROS);
        CuentaBancaria cuenta2 = new CuentaBancaria(0.02f, "Javier", "Romero", 543234452, tipoCuenta.CUENTA_CORRIENTE);

        System.out.println(cuenta1.toString());
        cuenta1.consignarSaldo(200000);
        System.out.println(cuenta1.toString());
        cuenta1.consignarSaldo(300000);
        double retiro = 400000;
        cuenta1.retirarSaldo(retiro);
        System.out.println(cuenta1.toString());
        cuenta1.retirarSaldo(400000);
        System.out.println(cuenta1.toString());
        cuenta1.calcularInteresMensual();
        System.out.println(cuenta1.consultarSaldo());
        System.out.println(retiro);

        cuenta2.consignarSaldo(421321);
        cuenta1.comparaSaldos(cuenta2);
        double transferir = 3999.33;
        System.out.println("\n" + cuenta1.toString() + "\n" + cuenta2.toString());
        cuenta1.transfusionSaldo(cuenta2, transferir);
        System.out.println("\n" + cuenta1.toString() + "\n" + cuenta2.toString());

    }
    // soberana mrd de ejercicio
}
