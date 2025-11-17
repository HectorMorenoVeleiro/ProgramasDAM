package dos;

public class CuentaBancaria {

    /*
     * Agregar a la clase CuentaBancaria un atributo que presente el porcentaje
     * de interes mensual.
     * Agregar un método que calcule un nuevo saldo aplicando la tasa de interes
     * corresp
     */
    public float interes;
    public String nombreCuenta;
    public String apellidosCuenta;
    public long numeroCuenta;
    public double saldoCuenta;

    public enum tipoCuenta {
        CUENTA_AHORROS, CUENTA_CORRIENTE
    }

    public tipoCuenta cuenta;

    public CuentaBancaria(float interes, String nombreCuenta, String apellidosCuenta, long numeroCuenta,
            tipoCuenta cuenta) {
        this.interes = interes;
        this.nombreCuenta = nombreCuenta;
        this.apellidosCuenta = apellidosCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = 0d;
        this.cuenta = cuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getApellidosCuenta() {
        return apellidosCuenta;
    }

    public void setApellidosCuenta(String apellidosCuenta) {
        this.apellidosCuenta = apellidosCuenta;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public tipoCuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(tipoCuenta cuenta) {
        this.cuenta = cuenta;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    // (en vrd es un getter pero llamemoslo asi)
    public double consultarSaldo() {
        return this.saldoCuenta;
    }

    // ingreso en CuentaBancaria
    public void consignarSaldo(double valor) {
        this.saldoCuenta += valor;
    }

    // retirar determinado valor de CuentaBancaria
    public void retirarSaldo(double valor) {
        if (saldoCuenta - valor < 0) {
            System.out.println("no puedes retirar un valor mayor al que tienes en la cuenta sin un credito");
        } else {
            this.saldoCuenta -= valor;
        }
    }

    // metodo para calcular el nuevo saldo aplicando la tasa mensual
    public void calcularInteresMensual() {
        double cantidadMensual = saldoCuenta * (interes / 12);
        saldoCuenta += cantidadMensual;
    }

    public void comparaSaldos(CuentaBancaria otra) {
        boolean booleano = this.getSaldoCuenta() >= otra.getSaldoCuenta();
        System.out.println(booleano);
    }

    public void transfusionSaldo(CuentaBancaria otra, double valorTransferir) {
        if (valorTransferir > this.getSaldoCuenta()) {
            System.out.println("no se puede transferir tanto");
        } else {
            this.retirarSaldo(valorTransferir);
            otra.consignarSaldo(valorTransferir);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria [interes%=" + interes + ", nombreCuenta=" + nombreCuenta + ", apellidosCuenta="
                + apellidosCuenta + ", numeroCuenta=" + numeroCuenta + ", saldoCuenta=" + saldoCuenta + ", cuenta="
                + cuenta + "]";
    }

}
