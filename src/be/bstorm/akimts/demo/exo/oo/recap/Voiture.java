package be.bstorm.akimts.demo.exo.oo.recap;

public class Voiture extends Vehicule {

    private final int nbrPorte;

    public Voiture(String marque, String modele, int nbrPorte) {
        super(marque, modele);
        if( nbrPorte == 3 || nbrPorte == 5 )
            this.nbrPorte = nbrPorte;
        else
            this.nbrPorte = 3;
    }

    public int getNbrPorte() {
        return nbrPorte;
    }

}
