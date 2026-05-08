package tercer_trimestre.mamiferos;

public abstract class Mamifero {

    /**
     * ==============================================
     * Metodo abstacto que presenta que los mamiferos
     * amamantan a sus crias
     * ==============================================
     */

    abstract void amamantarCrias();

    public void comer() {
        System.out.println("los mamiferos comen para sobrevivir...");
    }

}
