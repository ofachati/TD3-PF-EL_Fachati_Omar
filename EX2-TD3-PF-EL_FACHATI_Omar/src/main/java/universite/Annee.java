package universite;

import java.util.HashSet;
import java.util.Set;

public class Annee {
    private Set<UE> ues;
    private Set<Etudiant> etudiants;

    public Annee(Set<UE> ues) {
        this.ues = ues;
        this.etudiants = new HashSet<>();
    }

    public Set<UE> ues() {
        return ues;
    }

    public Set<Etudiant> etudiants() {
        return etudiants;
    }

    void inscrire(Etudiant e) {
        etudiants.add(e);
    }
}
