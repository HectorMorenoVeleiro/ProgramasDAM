package EjerciciosNumerosAleatorios;

public class Ejercicio16 {
    //Realiza un simulador de máquina tragaperras simplificada que cumpla los
    //siguientes requisitos:
    //a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
    //figuras posibles: corazón, diamante, herradura, campana y limón.
    //b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
    //perdido”.
    //c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
    //ha recuperado su moneda”.
    //d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
    //10 monedas”.
    //Ejemplo 1:
    //diamante diamante limón
    //Bien, ha recuperado su moneda
    //Ejemplo 2:
    //herradura campana diamante
    //Lo siento, ha perdido
    //Ejemplo 3:
    //corazón corazón corazón
    //Enhorabuena, ha ganado 10 monedas
    public static void main(String[] args) {
        String[] figuras = new String[] {"corazon", "diamante", "herradura", "campana", "limon"};
        String figura1 = figuras[(int)(Math.random()*figuras.length)];
        String figura2 = figuras[(int)(Math.random()*figuras.length)];
        String figura3 = figuras[(int)(Math.random()*figuras.length)];
        System.out.println("[" + figura1 + "] [" + figura2 + "] [" + figura3 + "]");
        if (figura1.equals(figura2) && figura2.equals(figura3))
            System.out.println("has ganado 10 monedas");
        if (figura1.equals(figura2) || figura2.equals(figura3) || figura1.equals(figura3))
            System.out.println("bien, has recuperado la moneda");
        else
            System.out.println("lo siento, has perdido la moneda ");
    }
}
