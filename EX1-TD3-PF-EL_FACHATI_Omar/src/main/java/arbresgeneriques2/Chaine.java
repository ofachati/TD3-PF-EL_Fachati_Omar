package arbresgeneriques2;

public class Chaine implements Sommable<Chaine>, Comparable<Chaine> {
    
    private String valeur;

    public Chaine(String valeur) {
        this.valeur = valeur;
    }

    public String valeur() {
        return valeur;
    }

    @Override
    public Chaine sommer(final Chaine autre) {
        return new Chaine(String.format("%s%s", this.valeur(), autre.valeur()));
    }

    private static final Chaine _zero = new Chaine("");

    @Override
    public Chaine zero() {
        return Chaine._zero;
    }

    @Override
    public String toString() {
        return String.format("%s :: Chaine", this.valeur());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Chaine)) return false;
        return this.valeur == ((Chaine)o).valeur;
    }

    @Override
    public int hashCode() {
        return valeur.hashCode();
    }

    @Override
    public int compareTo(Chaine autre) {
        return this.valeur.compareTo(autre.valeur());
    }

}