package arbresgeneriques1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T> implements Arbre<T> {

    private final List<Arbre<T>> fils;

    public Noeud(final List<Arbre<T>> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {
        int rtr = 0;
        for (final Arbre<T> a : fils) {
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(final T val) {
        boolean rtr = false;
        for (final Arbre<T> a : fils) {
            if (a.contient(val)) return true;
        }
        return rtr;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> rtr = new HashSet<>();
        for (final Arbre<T> a : fils) {
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }
    
}