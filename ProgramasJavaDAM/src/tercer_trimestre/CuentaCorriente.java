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
    @Override
    public void retirar(float cantidad) {
        float sobrante = this.getSaldo() - cantidad;

        // if cantidad > saldo queda como sobregiro
        setNumeroRetiros(getNumeroRetiros() + 1);

        // condicion if-else:
        if (sobrante >= 0) {
            // normal
            this.setSaldo(getSaldo() - cantidad);
        } else {
            setSobregiro(-sobrante);
            setSaldo(0);
            System.out.println("la cantidad a retirar excede saldo actual");
            System.out.println("dicho exceso quedara como sobregiro: " + this.getSobregiro());
        }
    }

    // metodo consignar:
    // si no hay sobregiro todo funciona como en la clase cuenta:
    @Override
    public void consignar(float cantidad) {
        if (this.getSobregiro() == 0) {
            super.consignar(cantidad);
        } else if (cantidad >= this.getSobregiro()) {
            // si queda menos lo metemos como saldo -->
            setSaldo(cantidad - this.getSobregiro());
            setSobregiro(0);
            setNumeroConsignaciones(getNumeroConsignaciones() + 1);
        }
    }

    // metodo extracto mensual
    @Override
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
