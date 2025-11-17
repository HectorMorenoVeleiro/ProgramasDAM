package EjerciciosNumerosAleatorios;

public class Ejercicio11 {
    //Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
    //aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
    //final aparecerá el número de suspensos, el número de suficientes, el número
    //de bienes, etc.
    public static void main(String[] args) {
        String[] notas = new String[]{"suspenso", "suficiente", "bien", "notable", "sobresaliente"};
        int notaInstancia, suspenso = 0, suficiente = 0, bien = 0, notable = 0, sobresaliente = 0;

        for (int i = 0; i < 20; i++) {
            notaInstancia = (int) (Math.random() * notas.length);
            System.out.print("[" + notas[notaInstancia] + "]  ");
            if (i == 5 || i == 10 || i == 15)
                System.out.print("\n");
            switch (notaInstancia) {
                case 0 -> suspenso ++;
                case 1 -> suficiente ++;
                case 2 -> bien ++;
                case 3 -> notable ++;
                case 4 -> sobresaliente ++;
            }
        }
        System.out.println("\n\n" + notas[0] + " =\t\t[" + suspenso + "]\n" +
                notas[1] + " =\t[" + suficiente + "]\n" +
                notas[2] + " =\t\t\t[" + bien + "]\n" +
                notas[3] + " =\t\t[" + notable + "]\n" +
                notas[4] + " =\t[" + sobresaliente + "]");
    }
}
