package be.bstorm.akimts.exo.oo.generics;

import java.time.LocalDate;

public abstract class Sportif {

    private final LocalDate debutCarriere;
    private int nbrMedailles;

    public Sportif(LocalDate debutCarriere) {
        if( debutCarriere == null || debutCarriere.isAfter(LocalDate.now()) )
            throw new IllegalArgumentException("debutCarriere invalide");

        this.debutCarriere = debutCarriere;
    }

    public abstract double performer();

    public LocalDate getDebutCarriere() {
        return debutCarriere;
    }

    public int getNbrMedailles() {
        return nbrMedailles;
    }

    public void gagnerMedaille(){
        nbrMedailles++;
    }
}
