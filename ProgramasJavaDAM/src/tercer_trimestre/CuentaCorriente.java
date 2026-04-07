package tercer_trimestre;

public class CuentaCorriente extends Cuenta {

    // new atribute
    float sobregiro = 0;

    // constructor
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual); // father construct
        // TODO Auto-generated constructor stub (entender q coño hacer...)
    }

    // getters y setters
    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }

    // metodo retirar:
    public void retirar(float cantidad) {
        if (cantidad > super.getSaldo()) {
            setSobregiro(getSobregiro() + (cantidad - super.getSaldo()));
            cantidad = super.getSaldo();
        }
        super.retirar(cantidad);
    }

    // metodo consignar:
    public void consignar(float cantidad) {
        if (getSobregiro() > 0)
            setSobregiro(getSobregiro() - cantidad);
        super.consignar(cantidad);
    }

    // metodo extracto mensual
    public void extractoMensual() {
        super.extractoMensual();
    }

    // toString
    @Override
    public String toString() {
        // si quisiesemos ver las caracteristicas heredadas de papa
        String extToString = super.toString();
        return extToString + "\nCuentaCorriente [sobregiro= " + sobregiro + "]";
    }

}
