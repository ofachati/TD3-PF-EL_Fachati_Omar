package arbres;

import java.util.Set;

public class Feuille implements Arbre {

    private final int valeur;

    public Feuille(final int valeur) {
        this.valeur = valeur;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(final Integer val) {
        return val.equals(valeur);
    }

    @Override
    public Set<Integer> valeurs() {
        return Set.of(valeur);
    }

    @Override
    public Integer somme() {
        return valeur;
    }

    @Override
    public Integer min() {
        return valeur;
    }

    @Override
    public Integer max() {
        return valeur;
    }

    /**
     * une feuille est toujours triée.
     */
    @Override
    public boolean estTrie() {
        return true;
    }
    
}