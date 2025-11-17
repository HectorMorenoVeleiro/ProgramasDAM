package tres;

import EjerciciosCuentaPropia.AjustesProgramas;

public class EjemploIMC {

    public static void main(String[] args) {
        double altura = AjustesProgramas.enterDoublePorScanner("INTRODUCE TU ALTURA -- > ");
        double peso = AjustesProgramas.enterDoublePorScanner("INTRODUCE TU PESO --> ");
        System.out.println("----------------------------");
        double IMC = peso / (Math.pow(altura, 2));
        if (IMC < 18.5)
            System.out.println("BAJO PESO");
        else if (IMC >= 18.5 && IMC < 24.9)
            System.out.println("NORMAL");
        else if (IMC >= 25 && IMC < 29.9)
            System.out.println("SOBREPESO");
        else if (IMC >= 30 && IMC < 34.9)
            System.out.println("OBESIDAD I");
        else if (IMC >= 35 && IMC < 39.9)
            System.out.println("OBESIDAD II");
        else if (IMC >= 40)
            System.out.println("OBESIDAD III");
    }
}
