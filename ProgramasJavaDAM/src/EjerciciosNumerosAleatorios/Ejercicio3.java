package ejerciciosnumerosaleatorios;

public class Ejercicio3 {
    // Igual que el ejercicio anterior pero con la baraja española. Se utilizará la
    // baraja
    // de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
    public static void main(String[] args) {
        String[] cartas = new String[] { "2", "3", "4", "5", "6", "7", "SOTA", "CABALLO", "REY", "AS" };
        String[] palo = new String[] { "BASTOS", "COPAS", "OROS", "ESPADAS" };
        int randomCartas = (int) (Math.random() * cartas.length);
        int randomPalo = (int) (Math.random() * palo.length);
        System.out.printf("La carta es el: " + cartas[randomCartas] + " de " + palo[randomPalo]);
    }
}
