package dos;

import java.util.Scanner;

public class TestNumero {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Numero num1 = new Numero(3);
        Numero num2 = new Numero(5);
        Numero num3 = new Numero(12);
        boolean decision = true;
        String respuesta;
        int tomaDecision;

        while (decision) {
            System.out.println("Te apetece testear los metodos de tu clase Numero?: ");
            respuesta = sc.nextLine();
            if (respuesta.equals("si")) {
                System.out.println("que metodo te apetece testear?: ");
                System.out.println("(1)getValor/(2)getDoble/(3)getTriple/(4)toString/(5)equals/(6)aniade/(7)resta: ");
                tomaDecision = sc.nextInt();

                switch (tomaDecision) {
                    case 1:
                        System.out.println(num1.getValor());
                        System.out.println(num2.getValor());
                        System.out.println(num3.getValor());
                        break;

                    case 2:
                        System.out.println(num1.getDoble());
                        System.out.println(num2.getDoble());
                        System.out.println(num3.getDoble());
                        break;

                    case 3:
                        System.out.println(num1.getTriple());
                        System.out.println(num2.getTriple());
                        System.out.println(num3.getTriple());
                        break;

                    case 4:
                        System.out.println(num1.toString());
                        System.out.println(num2.toString());
                        System.out.println(num3.toString());
                        break;

                    case 5:
                        System.out.println(num2.equals(num3)); // false
                        System.out.println(num1.equals(num3)); // false
                        System.out.println(num2.equals(num1)); // false
                        break;

                    case 6:
                        System.out.println(Numero.aniade(num1.getValor()) + "\n");
                        System.out.println(Numero.aniade(num2.getValor()) + "\n");
                        System.out.println(Numero.aniade(num3.getValor()) + "\n");
                        break;

                    case 7:
                        System.out.println(Numero.resta(num1.getValor()) + "\n");
                        System.out.println(Numero.resta(num2.getValor()) + "\n");
                        System.out.println(Numero.resta(num3.getValor()) + "\n");
                        break;

                    default:
                        break;
                }
            } else if (respuesta.equals("no")) {
                decision = false;
            }
        }
        System.out.println("chau");
    }
}
