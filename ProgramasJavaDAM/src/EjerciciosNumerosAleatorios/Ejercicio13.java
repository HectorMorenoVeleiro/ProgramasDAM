package ejerciciosnumerosaleatorios;

public class Ejercicio13 {
    // Escribe un programa que simule la tirada de dos dados. El programa deberá
    // continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
    // dados tengan el mismo valor.
    public static void main(String[] args) {
        int dado1 = (int) (Math.random() * 6 + 1), dadoRandom1;
        int dado2 = (int) (Math.random() * 6 + 1), dadoRandom2;
        System.out.println("dados originales\n-----------------");
        System.out.println("[" + dado1 + "]\t[" + dado2 + "]");
        System.out.println("dados a comparar\n----------------");
        do {
            dadoRandom1 = (int) (Math.random() * 6 + 1);
            dadoRandom2 = (int) (Math.random() * 6 + 1);
            System.out.print("\n[" + dadoRandom1 + "]\t[" + dadoRandom2 + "]");
        } while (dado1 != dadoRandom1 || dado2 != dadoRandom2);
    }
}
