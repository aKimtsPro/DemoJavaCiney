package be.bstorm.akimts.exo.oo.interfaces;

public class LegumeConserve extends Aliment {

    private final int poids;

    public LegumeConserve(String nom, int calories, int poids) {
        super(nom, null, calories);
        this.poids = poids > 0 ? poids : 100;
    }

    public int getPoids() {
        return poids;
    }

    @Override
    public String getSaveur() {
        return "salé";
    }
}
