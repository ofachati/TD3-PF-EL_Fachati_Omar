package universite;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Etudiant {
    private String prenom;
    private String nom;
    private String numero;
    private Map<Matiere, Double> notes;
    private Annee annee;

    public Etudiant(String numero, String prenom, String nom, Annee a) {
        this.prenom = prenom;
        this.nom = nom;
        this.numero = numero;
        this.notes = new HashMap<>();
        this.annee = a;
        this.annee.inscrire(this);
    }

    public String prenom() {
        return prenom;
    }

    public String nom() {
        return nom;
    }

    public String numero() {
        return numero;
    }

    public Annee annee() {
        return annee;
    }

    public Map<Matiere,Double> notes() {
        return notes;
    }

    public void noter(Matiere m, Double note) {
        this.notes.put(m, note);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Etudiant))
            return false;
        return ((Etudiant) obj).numero().equals(numero);
    }

    @Override
    public int hashCode() {
        return numero.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder rtr = new StringBuilder();
        rtr.append(String.format("%s %s %s\n", numero, prenom, nom));
        for (UE ue : annee.ues()) {
            rtr.append(String.format("%s\n", ue.nom()));
            for (Entry<Matiere, Integer> ects : ue.ects().entrySet()) {
                Matiere matiere = ects.getKey();
                Integer credits = ects.getValue();
                String note = notes.containsKey(matiere) ? notes.get(matiere).toString() : "DEF";
                rtr.append(String.format("%s (%d) : %s\n", matiere, credits, note));
            }
        }
        return rtr.toString();
    }
}
