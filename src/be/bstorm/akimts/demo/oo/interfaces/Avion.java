package be.bstorm.akimts.demo.oo.interfaces;

public class Avion extends Vehicule implements TrucQuiVoleAvecDesAiles {

    private final int envergure;

    public Avion(int envergure) {
        this.envergure = envergure;
    }

    @Override
    public int getEnvergure() {
        return envergure;
    }

    @Override
    public void voler(int nbrKm) {
        seDeplacer( nbrKm );
    }
}
