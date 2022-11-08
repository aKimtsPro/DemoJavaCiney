package be.bstorm.akimts.demo.exo.oo.banque;

import java.time.LocalDate;

public class CompteEpargne extends Compte {

    private LocalDate dateDernierRetrait;

    public CompteEpargne(String numero, Personne titulaire) {
        super( numero, titulaire );
    }

    public void retrait(double montant){
        if( montant <= getSolde() ) {
            super.retrait( montant );
            dateDernierRetrait = LocalDate.now();
        }
    }

    public LocalDate getDateDernierRetrait() {
        return dateDernierRetrait;
    }



}
