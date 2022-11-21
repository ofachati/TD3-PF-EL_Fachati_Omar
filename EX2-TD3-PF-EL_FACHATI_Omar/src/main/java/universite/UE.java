package universite;

import java.util.Map;

public class UE {
    private String nom;
    private Map<Matiere, Integer> ects;

    public UE(String nom, Map<Matiere, Integer> ects) {
        this.nom = nom;
        this.ects = ects;
    }

    public String nom() {
        return nom;
    }

    public Map<Matiere, Integer> ects() {
        return ects;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof UE))
            return false;
        return ((UE) obj).nom().equals(nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }
}
