package tercer_trimestre.cuentas;

public class CuentaAhorro extends Cuenta {

    // new atribute
    boolean activa;

    // constructor
    public CuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual); // father constructor
        // TODO Auto-generated constructor stub (entender q coño hacer...)

        this.activa = this.isActiva(); // activa true/false en funcion a isActiva
    }

    // parecido a getMethod
    public boolean isActiva() {
        if (this.getSaldo() > 10000)
            return true;
        else
            return false;
    }

    // setMethod
    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    // EXERCICE METHOD:

    // metodo consignar:
    @Override
    public void consignar(float cantidad) {
        if (isActiva())
            super.consignar(cantidad);
    }

    // metodo retirar:
    @Override
    public void retirar(float cantidad) {
        if (isActiva())
            super.retirar(cantidad);
    }

    // metodo extracto mensual
    @Override
    public void extractoMensual() {
        if (super.getNumeroRetiros() > 4)
            super.setComisionMensual(1000f * (getNumeroRetiros() - 4));
        super.extractoMensual();
    }

    // toString
    public String toString() {
        String extToString = super.toString();
        return extToString + "\n[activa= " + this.activa + "]";
    }

}
