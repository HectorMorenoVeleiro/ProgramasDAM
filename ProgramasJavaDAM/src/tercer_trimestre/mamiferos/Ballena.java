package tercer_trimestre.mamiferos;

public class Ballena extends Mamifero {

    // ya no es abstracto
    void amamantarCrias() {
        System.out.println("La ballena amamanta a sus crias en LATAM");
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println("las ballenas abren sus fauces y tragan... ");
    }
}
