package universite;

public class Matiere {
    private String nom;

    public Matiere(String nom) {
        this.nom = nom;
    }

    public String nom() {
        return nom;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Matiere))
            return false;
        return ((Matiere) obj).nom().equals(nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }

    @Override
    public String toString() {
        return nom;
    }
}
