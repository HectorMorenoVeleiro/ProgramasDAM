package cuatro;

public class DesigualdadTriangular {

    // atributos
    double ladoA;
    double ladoB;
    double ladoC;

    // constructor por parametros
    DesigualdadTriangular(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    // metodo para saber si es triangulo o no
    public boolean isTriangle() {
        return (this.ladoA <= (this.ladoB + this.ladoC) && this.ladoC <= (this.ladoA + this.ladoB)
                && this.ladoB <= (this.ladoA + this.ladoC));
    }
}
