package commandes;

public class Produit {
    private String nom;
    private Double prix;
    private Categorie cat;
    
    public Produit(String nom, Double prix, Categorie cat) {
        this.nom = nom;
        this.prix = prix;
        this.cat = cat;
    }

    public String nom() { return nom; }

    public Double prix() { return prix; }

    public Categorie cat() { return cat; }

    @Override
    public String toString() {
        return nom;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Produit)) return false;
        return nom.equals(((Produit)obj).nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }
}
