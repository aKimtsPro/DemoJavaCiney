package be.bstorm.akimts.exo.oo.generics2;

public abstract class Vehicule {

    private final String marque;
    private final String modele;

    public Vehicule(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }
}
