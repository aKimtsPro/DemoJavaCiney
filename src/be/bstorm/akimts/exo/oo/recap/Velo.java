package be.bstorm.akimts.exo.oo.recap;

public class Velo extends Vehicule {
    private boolean electrique;

    public Velo(String marque, String modele, boolean electrique) {
        super(marque, modele);
        this.electrique = electrique;
    }

    public boolean isElectrique() {
        return electrique;
    }

    public void setElectrique(boolean electrique) {
        this.electrique = electrique;
    }
}
