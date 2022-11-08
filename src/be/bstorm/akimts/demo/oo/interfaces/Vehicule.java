package be.bstorm.akimts.demo.oo.interfaces;

public class Vehicule {

    private int kmParcouru;

    public void seDeplacer(int aParcourir){
        if( aParcourir > 0 )
            kmParcouru += aParcourir;
    }

    public int getKmParcouru() {
        return kmParcouru;
    }
}
