package tres;

public class Letras {

    private char letra;

    public Letras(char letra) {
        if (Character.isAlphabetic(letra))
            if (Character.isLowerCase(letra)) {
                Character.toUpperCase(letra);
            } else {
                Character.toLowerCase(letra);
            }
        else
            System.out.println("no se ha instanciado el objeto");
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        if (Character.isAlphabetic(letra))
            if (Character.isLowerCase(letra)) {
                Character.toUpperCase(letra);
            } else {
                Character.toLowerCase(letra);
            }
        else
            System.out.println("no se ha instanciado el objeto");
    }

    @Override
    public String toString() {
        return "Letras [letra=" + letra + "]";
    }
}
