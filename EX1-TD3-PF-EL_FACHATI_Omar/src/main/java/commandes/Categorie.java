package commandes;

public enum Categorie {
    NORMAL, INTERMEDIAIRE, REDUIT, PARTICULIER;
    public double tva() {
        switch (this) {
            case NORMAL : return 0.20;
            case INTERMEDIAIRE : return 0.10;
            case REDUIT : return 0.055;
            case PARTICULIER : return 0.021;
            default: return 0.20;
        }
    }
}
