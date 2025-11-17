package dos;

import java.util.Objects;
import java.util.Scanner;

public class Numero {

    // Atributos
    int numero;
    public static Scanner sc = new Scanner(System.in);
    Scanner Sc = new Scanner(System.in);

    // Constructor
    public Numero() {
        numero = 0;
    }

    public Numero(int numero) {
        this.numero = numero;
    }

    public static int aniade(int numero) {
        System.out.println("Introduce un numero para sumar");
        int numSum = sc.nextInt();
        return numSum + numero;
    }

    public static int resta(int numero) {
        System.out.println("Introduce un numero para restar");
        int numRes = sc.nextInt();
        return numRes - numero;
    }

    public int getValor() {
        return this.numero;
    }

    public int getDoble() {
        return this.numero * 2;
    }

    public int getTriple() {
        return this.numero * 3;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "numero=" + this.numero +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Numero numero1)) return false;
        return numero == numero1.numero && Objects.equals(sc, numero1.Sc);
    }

    public Numero(Numero otro){
        this.numero = otro.numero;
    }
}