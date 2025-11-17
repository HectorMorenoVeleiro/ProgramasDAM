package tres;

import java.util.Scanner;

public class Propuesto8 {

    /* 1000M 500D 100C */
    public static void main(String[] args) {
        String res = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO DEL 1 AL 3999 --> ");
        int n = Integer.parseInt(sc.nextLine());

        while (n > 0) {
            while (n >= 1000) {
                res += "M";
                n -= 1000;
            }
            while (n >= 900) {
                res += "CM";
                n -= 900;
            }
            while (n >= 500) {
                res += "D";
                n -= 500;
            }
            while (n >= 400) {
                res += "CD";
                n -= 400;
            }
            while (n >= 100) {
                res += "C";
                n -= 100;
            }
            while (n >= 90) {
                res += "XC";
                n -= 90;
            }
            while (n >= 50) {
                res += "L";
                n -= 50;
            }
            while (n >= 40) {
                res += "XL";
                n -= 40;
            }
            while (n >= 10) {
                res += "X";
                n -= 10;
            }
            while (n >= 9) {
                res += "IX";
                n -= 9;
            }
            while (n >= 5) {
                res += "V";
                n -= 5;
            }
            while (n >= 4) {
                res += "IV";
                n -= 4;
            }
            while (n >= 3) {
                res += "III";
                n -= 3;
            }
            while (n >= 2) {
                res += "II";
                n -= 2;
            }
            while (n >= 1) {
                res += "I";
                n -= 1;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
