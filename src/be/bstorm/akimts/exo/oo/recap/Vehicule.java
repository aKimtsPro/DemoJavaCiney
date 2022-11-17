package be.bstorm.akimts.exo.oo.recap;

public class Vehicule {

    private int kmParcouru;
    private final String marque;
    private final String modele;

    public Vehicule(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    public void seDeplacer(int aParcourir){
        if( aParcourir > 0 )
            this.kmParcouru += aParcourir;
    }

    public int getKmParcouru() {
        return kmParcouru;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }
}
