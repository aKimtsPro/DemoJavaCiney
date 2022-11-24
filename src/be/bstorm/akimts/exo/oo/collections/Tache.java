package be.bstorm.akimts.exo.oo.collections;

public class Tache implements Comparable<Tache> {

    private final String nom;
    private final Priorite priorite;

    public Tache(String nom, Priorite priorite) {
        this.nom = nom;
        this.priorite = priorite;
    }

    public String getNom() {
        return nom;
    }

    public Priorite getPriorite() {
        return priorite;
    }


    @Override
    public int compareTo(Tache tache) {
        if(tache == null)
            throw new IllegalArgumentException();

        return this.getPriorite().ordinal() - tache.getPriorite().ordinal();
    }
}
