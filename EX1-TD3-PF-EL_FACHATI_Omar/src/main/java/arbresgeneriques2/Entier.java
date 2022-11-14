package arbresgeneriques2;

public class Entier implements Sommable<Entier>, Comparable<Entier> {
    private Integer valeur;

    public Entier(int valeur) {
        this.valeur = valeur;
    }

    public int valeur() {
        return valeur;
    }

    @Override
    public Entier sommer(final Entier autre) {
        return new Entier(this.valeur() + autre.valeur());
    }

    private static final Entier _zero = new Entier(0);

    @Override
    public Entier zero() {
        return Entier._zero;
    }

    @Override
    public String toString() {
        return String.format("%d :: Entier", this.valeur());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Entier)) return false;
        return this.valeur == ((Entier)o).valeur;
    }

    @Override
    public int hashCode() {
        return valeur.hashCode();
    }

    @Override
    public int compareTo(Entier autre) {
        return this.valeur.compareTo(autre.valeur());
    }
    
}