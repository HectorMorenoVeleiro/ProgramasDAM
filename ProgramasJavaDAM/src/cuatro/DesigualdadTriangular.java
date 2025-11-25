package cuatro;

public class DesigualdadTriangular {

    double ladoA;
    double ladoB;
    double ladoC;

    DesigualdadTriangular() {
        ladoA = 0;
        ladoB = 0;
        ladoC = 0;
    }

    DesigualdadTriangular(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public boolean isTriangle() {
        return (this.ladoA <= (this.ladoB + this.ladoC) && this.ladoC <= (this.ladoA + this.ladoB)
                && this.ladoB <= (this.ladoA + this.ladoC));
    }
}
